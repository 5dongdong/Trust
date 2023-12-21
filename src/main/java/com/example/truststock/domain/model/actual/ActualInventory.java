package com.example.truststock.domain.model.actual;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class ActualInventory {

  @Id
  @GeneratedValue
  @Column(name = "ACTUALInvenTORY_ID")
  private Long id;

  private int productId;

  private int actualQuantity;

  private LocalDateTime inputDate;
}
