package com.example.truststock.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {

  @Id
  private Long categoryId;

  private String categoryName;
}
