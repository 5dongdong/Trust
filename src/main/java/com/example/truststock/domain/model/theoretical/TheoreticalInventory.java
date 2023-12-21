package com.example.truststock.domain.model.theoretical;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class TheoreticalInventory {

  @Id
  @GeneratedValue
  @Column(name = "THEORETICALINVENTORY_ID")
  private Long id;

  private int productId;

  private int theoreticalQuantity;

  private LocalDateTime calculatedDate;
}
