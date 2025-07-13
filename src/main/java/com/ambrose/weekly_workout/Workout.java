package com.ambrose.weekly_workout;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "workouts", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"week_name", "day"})
})
@Data
@NoArgsConstructor // <- Bắt buộc cho JPA
@AllArgsConstructor
@Builder
public class Workout {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "workout_id")
  private Long workoutId;

  @Column(name = "week_name", nullable = false, length = 10)
  private String weekName; // e.g., "2025-W28"

  @Column(name = "day", nullable = false, length = 10)
  private String day; // e.g., "monday"

  @Column(name = "exercises", columnDefinition = "text", nullable = false)
  @Convert(converter = ExerciseListConverter.class)
  private List<Map<String, Object>> exercises;
}
