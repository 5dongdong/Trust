package com.example.truststock.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class ActualInventory {

  @Id
  private Long actualInventoryID;

  private int productId;

  private int actualQuantity;

  private LocalDateTime inputDate;
}
