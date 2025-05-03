package com.recipe.controller;
import com.recipe.dao.RecipeDAO;
import com.recipe.model.Recipe;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/search")
public class RecipeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ingredients = request.getParameter("ingredients");

        RecipeDAO recipeDAO = new RecipeDAO();
        try {
            List<Recipe> recipes = recipeDAO.getRecipesByIngredients(ingredients);
            request.setAttribute("recipes", recipes);
            RequestDispatcher dispatcher = request.getRequestDispatcher("results.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
