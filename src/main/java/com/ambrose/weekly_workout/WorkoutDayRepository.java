package com.ambrose.weekly_workout;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WorkoutDayRepository extends JpaRepository<WorkoutDay, UUID> {


    @Query("SELECT wd FROM WorkoutDay wd WHERE wd.week.weekId = :weekId AND wd.dayOfWeek = :dayOfWeek")
    WorkoutDay findByWeekIdAndDayOfWeek(UUID weekId, String dayOfWeek);

    // Additional query methods can be defined here if needed

}
