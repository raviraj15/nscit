package com.nscit.NCourage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class BadgeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int badgeId;

    private int Total_number_of_points;

    private String badgeLevel;

    private String isPhysical;
}
