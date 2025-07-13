package com.ambrose.weekly_workout;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_workout_day")
public class WorkoutDay {
  @Id
  @Column(name = "workouday_id", updatable = false, nullable = false)
  private UUID workoutDayId;

  @ManyToOne
  @JoinColumn(name = "week_id", nullable = false)
  private Week week;

  private String dayOfWeek; // "monday", "tuesday", etc.

  private String title;

  private boolean completed = false;

  @OneToMany(mappedBy = "day", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Exercise> exercises = new ArrayList<>();
}
