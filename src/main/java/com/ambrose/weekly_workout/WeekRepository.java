package com.ambrose.weekly_workout;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WeekRepository extends JpaRepository<Week, UUID> {

    @Query("SELECT w FROM Week w WHERE w.year = :year AND w.weekNumber = :weekNumber")
    Week findByYearAndWeekNumber(int year, int weekNumber);

}
