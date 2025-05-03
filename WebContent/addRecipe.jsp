<!DOCTYPE html>
<html>
<head>
    <title>Add Recipe</title>
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
    <h1>Add New Recipe</h1>
    <form action="addRecipe" method="post">
        Title: <input type="text" name="title" required><br>
        Ingredients: <textarea name="ingredients" required></textarea><br>
        Steps: <textarea name="steps" required></textarea><br>
        Cuisine: <input type="text" name="cuisine"><br>
        Time Required (minutes): <input type="number" name="timeRequired" required><br>
        Calories: <input type="number" step="0.1" name="calories" required><br>
        Protein (g): <input type="number" step="0.1" name="protein" required><br>
        Fat (g): <input type="number" step="0.1" name="fat" required><br>
        Carbs (g): <input type="number" step="0.1" name="carbs" required><br>
        <button type="submit">Add Recipe</button>
    </form>
</body>
</html>
