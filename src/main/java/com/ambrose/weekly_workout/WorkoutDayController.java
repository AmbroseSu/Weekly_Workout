package com.ambrose.weekly_workout;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/workoutday")
@RequiredArgsConstructor
@CrossOrigin
public class WorkoutDayController {

  private final WorkoutTemplateData workoutTemplateData;
  private final WorkoutRepository workoutRepository;


  // Endpoint: Trả về toàn bộ dữ liệu bài tập theo ngày
  @GetMapping("/data")
  public Map<String, Object> getWorkoutFromDb(@RequestParam String weekName) {
    Map<String, Object> result = new LinkedHashMap<>();
    List<Workout> workouts = workoutRepository.findAllByWeekName(weekName);

    for (Workout w : workouts) {
      Map<String, Object> dayData = new HashMap<>();
      dayData.put("title", capitalize(w.getDay()));
      dayData.put("exercises", w.getExercises());
      result.put(w.getDay(), dayData);
    }

    return result;
  }

  // Lấy danh sách ngày theo thứ tự chuẩn
  private List<String> getOrderedDays() {
    return List.of("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");
  }

  // Viết hoa chữ cái đầu
  private String capitalize(String s) {
    return s.substring(0, 1).toUpperCase() + s.substring(1);
  }

  @PutMapping("/update-status")
  public ResponseEntity<?> updateExerciseStatus(@RequestBody UpdateExerciseStatusRequest request) {
    Workout workout = workoutRepository.findByWeekNameAndDay(request.getWeekName(), request.getDay())
        .orElseThrow(() -> new RuntimeException("Workout not found"));

    List<Map<String, Object>> exercises = workout.getExercises();

    if (request.getExerciseIndex() < 0 || request.getExerciseIndex() >= exercises.size()) {
      return ResponseEntity.badRequest().body("Invalid exercise index");
    }

    Map<String, Object> exercise = exercises.get(request.getExerciseIndex());
    exercise.put("completed", request.isCompleted());

    workout.setExercises(exercises); // update lại toàn bộ list
    workoutRepository.save(workout);

    return ResponseEntity.ok("Status updated");
  }


}
