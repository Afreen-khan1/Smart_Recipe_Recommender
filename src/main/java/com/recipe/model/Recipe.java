package com.recipe.model;

public class Recipe {
    private int recipeId;
    private String title;
    private String ingredients;
    private String steps;
    private String cuisine;
    private int timeRequired;
    private float calories;
    private float protein;
    private float fat;
    private float carbs;

    // Getters and Setters
    public int getRecipeId() { return recipeId; }
    public void setRecipeId(int recipeId) { this.recipeId = recipeId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    public String getSteps() { return steps; }
    public void setSteps(String steps) { this.steps = steps; }

    public String getCuisine() { return cuisine; }
    public void setCuisine(String cuisine) { this.cuisine = cuisine; }

    public int getTimeRequired() { return timeRequired; }
    public void setTimeRequired(int timeRequired) { this.timeRequired = timeRequired; }

    public float getCalories() { return calories; }
    public void setCalories(float calories) { this.calories = calories; }

    public float getProtein() { return protein; }
    public void setProtein(float protein) { this.protein = protein; }

    public float getFat() { return fat; }
    public void setFat(float fat) { this.fat = fat; }

    public float getCarbs() { return carbs; }
    public void setCarbs(float carbs) { this.carbs = carbs; }
}
