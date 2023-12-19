package com.example.truststock.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class TheoreticalInventory {

  @Id
  private Long theoreticalInventoryID;

  private int productId;

  private int theoreticalQuantity;

  private LocalDateTime calculatedDate;
}
