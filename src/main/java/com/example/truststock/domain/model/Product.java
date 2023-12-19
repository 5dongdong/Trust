package com.example.truststock.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

  @Id
  private Long productId;

  private String productName;

  private int categoryId;

  private int unitPrice;

  private int StockQuantity;
}
