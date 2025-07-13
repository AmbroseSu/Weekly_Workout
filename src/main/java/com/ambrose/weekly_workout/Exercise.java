package com.ambrose.weekly_workout;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_exercise")
public class Exercise {
  @Id
  @Column(name = "exercise_id", updatable = false, nullable = false)
  private UUID exerciseId;
  @ManyToOne
  @JoinColumn(name = "day_id", nullable = false)
  private WorkoutDay day;

  @Column(nullable = false)
  private String name;

  @Column(columnDefinition = "TEXT")
  private String description;

  private String icon;

  @Column(name = "image_url")
  private String imageUrl;

  private boolean completed = false;

  @Column(name = "sort_order")
  private Integer sortOrder = 0;
}
