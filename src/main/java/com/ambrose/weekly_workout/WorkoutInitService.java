package com.ambrose.weekly_workout;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkoutInitService {
  private final WorkoutRepository workoutRepository;
  private final WorkoutTemplateData workoutTemplateData;

  @PostConstruct
  public void initWorkoutsOnStartup() {
    // Tạo sẵn 8 tuần (2 tháng) tính từ hiện tại
    initializeWeeks(70);
  }

  public void initializeWeeks(int numberOfWeeks) {
    LocalDate now = LocalDate.now();
    WeekFields weekFields = WeekFields.ISO;

    for (int i = 0; i < numberOfWeeks; i++) {
      LocalDate weekStart = now.plusWeeks(i);
      int year = weekStart.getYear();
      int week = weekStart.get(weekFields.weekOfWeekBasedYear());
      String weekName = year + "-W" + String.format("%02d", week);

      for (String day : workoutTemplateData.getAllDays()) {
        if (!workoutRepository.existsByWeekNameAndDay(weekName, day)) {
          Workout workout = Workout.builder()
              .weekName(weekName)
              .day(day)
              .exercises(clone(workoutTemplateData.getExercisesForDay(day)))
              .build();
          workoutRepository.save(workout);
        }
      }
    }
  }

  @SuppressWarnings("unchecked")
  private List<Map<String, Object>> clone(List<Map<String, Object>> input) {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.convertValue(input, new TypeReference<>() {});
  }
}