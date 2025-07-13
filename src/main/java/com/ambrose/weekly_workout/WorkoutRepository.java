package com.ambrose.weekly_workout;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
  Optional<Workout> findByWeekNameAndDay(String weekName, String day);
  boolean existsByWeekNameAndDay(String weekName, String day);
  List<Workout> findAllByWeekName(String weekName);
}
