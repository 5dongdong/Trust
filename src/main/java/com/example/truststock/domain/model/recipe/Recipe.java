package com.example.truststock.domain.model.recipe;

import com.example.truststock.domain.model.ingredient.Ingredient;
import com.example.truststock.domain.model.product.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Recipe {

  @Id
  @GeneratedValue
  @Column(name = "RECIPE_ID")
  private Long recipeId;

  @OneToOne
  @JoinColumn(name = "PRODUCT_ID")
  private Product product;

  @OneToMany(mappedBy = "recipe")
  private List<Ingredient> ingredientId;

  private int quantity;

  private String unit;
}
