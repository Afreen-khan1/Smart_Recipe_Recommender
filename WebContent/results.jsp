<%@ page import="com.recipe.model.Recipe" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Results</title>
    <link rel="stylesheet" href="style.css">
    <style>
        /* Any page-specific styles can go here */
        .ingredients-list {
            white-space: pre-line; /* Preserve line breaks in ingredients */
        }
        .steps {
            white-space: pre-line; /* Preserve line breaks in steps */
        }
    </style>
</head>
<body>
    <section class="results-container">
        <h2>Search Results</h2>
        <table class="recipe-table">
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Ingredients</th>
                    <th>Steps</th>
                    <th>Cuisine</th>
                    <th>Time Required (mins)</th>
                    <th>Calories</th>
                    <th>Protein (g)</th>
                    <th>Fat (g)</th>
                    <th>Carbs (g)</th>
                </tr>
            </thead>
            <tbody>
                <% List<Recipe> recipes = (List<Recipe>) request.getAttribute("recipes");
                   if (recipes != null && !recipes.isEmpty()) {
                       for (Recipe recipe : recipes) { %>
                <tr>
                    <td><%= recipe.getTitle() %></td>
                    <td class="ingredients-list"><%= recipe.getIngredients() %></td>
                    <td class="steps"><%= recipe.getSteps() %></td>
                    <td><%= recipe.getCuisine() %></td>
                    <td><%= recipe.getTimeRequired() %></td>
                    <td><%= recipe.getCalories() %></td>
                    <td><%= recipe.getProtein() %></td>
                    <td><%= recipe.getFat() %></td>
                    <td><%= recipe.getCarbs() %></td>
                </tr>
                <%     }
                   } else { %>
                <tr><td colspan="9" class="no-results">No recipes found.</td></tr>
                <% } %>
            </tbody>
        </table>
    </section>
</body>
</html>