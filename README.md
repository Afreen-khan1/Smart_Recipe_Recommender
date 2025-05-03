

Smart Recipe Recommender

The Smart Recipe Recommender is a web-based application developed using Java EE (Servlets & JSP) and MySQL. It helps users find recipes based on the ingredients they have. The system also provides nutritional information, making meal planning smarter and healthier.


---

Features

Ingredient-Based Recipe Search: Users can input available ingredients to get matching recipes.

Add New Recipes: Admins can add new recipes with ingredients and nutritional details.

Nutrition Information: Displays calories and other nutritional data for each recipe.

Dynamic Web Interface: Built using Servlets, JSP, and HTML/CSS.

Database-Driven: Uses MySQL Workbench with JDBC DriverManager to connect and query data.



---

Technologies Used

Java (Servlets, JSP)

JDBC (DriverManager)

MySQL Workbench

HTML, CSS, JavaScript

Apache Tomcat (or any Java EE server)





---

Installation & Setup

1. Clone the Repository:



git clone https://github.com/yourusername/SmartRecipeRecommender.git
cd SmartRecipeRecommender

2. Database Setup:

Open MySQL Workbench and create a database (e.g., smartrecipes).

Add your recipe data manually to the tables.

Update the database credentials in DBUtil.java or wherever you used DriverManager:




Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartrecipes", "yourUsername", "yourPassword");

3. Run on Apache Tomcat:

Import the project into Eclipse/IntelliJ as a Dynamic Web Project.

Deploy it to Apache Tomcat.

Visit http://localhost:8080/SmartRecipeRecommender.





---

Usage

Search Recipes: Enter ingredients on the homepage and get recommended recipes.

Add Recipes (Admin): Use the addRecipe.jsp page.

View Nutrition Info: Each recipe displays relevant calorie and nutritional data.



---

Customization

Change UI Style: Modify CSS in WebContent/css/.

Add User Login: Implement authentication for user-specific features.

Enhance Filters: Add more filters like "vegetarian", "under 30 mins", etc.



---

License

This project is licensed under the MIT License. See the LICENSE file for details.


---

Acknowledgments

JDBC for database connectivity

Java EE for web architecture

MySQL Workbench for managing data

Apache Tomcat for hosting the application



---
