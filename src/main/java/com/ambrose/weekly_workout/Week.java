package com.ambrose.weekly_workout;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_week")
public class Week {
  @Id
  @Column(name = "week_id", updatable = false, nullable = false)
  private UUID weekId;

  @PrePersist
  public void generateId() {
    if (weekId == null) {
      weekId = UUID.randomUUID();
    }
  }
  private int year;
  private int weekNumber;
  @OneToMany(mappedBy = "week", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<WorkoutDay> days = new ArrayList<>();
}
