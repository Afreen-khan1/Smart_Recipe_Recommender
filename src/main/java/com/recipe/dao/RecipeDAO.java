package com.recipe.dao;

import com.recipe.model.Recipe;
import com.recipe.util.DBUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecipeDAO {
    public List<Recipe> getRecipesByIngredients(String ingredients) throws SQLException {
        List<Recipe> recipes = new ArrayList<>();
        String query = "SELECT * FROM recipes WHERE ingredients LIKE ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, "%" + ingredients + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Recipe recipe = new Recipe();
                recipe.setRecipeId(rs.getInt("recipe_id"));
                recipe.setTitle(rs.getString("recipe"));
                recipe.setIngredients(rs.getString("ingredients"));
                recipe.setSteps(rs.getString("steps"));
                recipe.setCuisine(rs.getString("cuisine"));
                recipe.setTimeRequired(rs.getInt("time_required"));
                recipe.setCalories(rs.getFloat("calories"));
                recipe.setProtein(rs.getFloat("protein"));
                recipe.setFat(rs.getFloat("fat"));
                recipe.setCarbs(rs.getFloat("carbs"));
                recipes.add(recipe);
            }
        }
        return recipes;
    }

    public void addRecipe(Recipe recipe) throws SQLException {
        String query = "INSERT INTO recipes (title, ingredients, steps, cuisine, time_required, calories, protein, fat, carbs) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, recipe.getTitle());
            stmt.setString(2, recipe.getIngredients());
            stmt.setString(3, recipe.getSteps());
            stmt.setString(4, recipe.getCuisine());
            stmt.setInt(5, recipe.getTimeRequired());
            stmt.setFloat(6, recipe.getCalories());
            stmt.setFloat(7, recipe.getProtein());
            stmt.setFloat(8, recipe.getFat());
            stmt.setFloat(9, recipe.getCarbs());
            stmt.executeUpdate();
        }
    }
}
