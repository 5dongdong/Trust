package com.example.truststock.domain.model.product;

import com.example.truststock.domain.model.recipe.Recipe;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Product {

  @Id
  @GeneratedValue
  @Column(name = "PRODUCT_ID")
  private Long id;

  private String productName;

  @OneToOne(mappedBy = "product")
  private Recipe recipe;
}
