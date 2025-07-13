package com.ambrose.weekly_workout;

import lombok.Data;

@Data
public class UpdateExerciseStatusRequest {
  private String weekName;
  private String day;
  private int exerciseIndex;
  private boolean completed;
}
