package com.example.truststock.domain.model.ingredient;

import com.example.truststock.domain.model.recipe.Recipe;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ingredient {

  @Id
  @Column(name = "INGREDIENT_ID")
  private Long ingredientId;

  @ManyToOne
  @JoinColumn(name = "RECIPE_ID")
  private Recipe recipe;
  @Column(name = "INGREDIENT_NAME")
  private String ingredientName;
}
