# Smart Recipe Recommender

<br>

The Smart Recipe Recommender is a web-based application built with **Java EE (Servlets & JSP)** and **MySQL**. It empowers users to discover recipes based on their available ingredients. The application also provides key **nutritional information** for each recipe, facilitating smarter and healthier meal planning.

---

## ✨ Features

* **Ingredient-Based Recipe Search:** Easily find recipes by inputting the ingredients you have on hand.
* **Add New Recipes (Admin):** Administrators can contribute new recipes, including ingredients and nutritional details.
* **Nutrition Information:** View essential nutritional data, such as calories, for each recipe.
* **Dynamic Web Interface:** A responsive and interactive user experience powered by Servlets, JSP, HTML, and CSS.
* **Database-Driven:** Leverages MySQL Workbench with JDBC DriverManager for efficient data storage and retrieval.

---

## 🛠️ Technologies Used

* **Backend:** Java (Servlets, JSP)
* **Database:** MySQL Workbench
* **Database Connectivity:** JDBC (DriverManager)
* **Frontend:** HTML, CSS, JavaScript
* **Server:** Apache Tomcat (or any Java EE compliant server)

---

## 📥 Prerequisites Downloads

Before you can run and develop the Smart Recipe Recommender, you need to have the following software installed on your system:

* **Java Development Kit (JDK):** (Download from: [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html) or [https://openjdk.org/](https://openjdk.org/))
* **Integrated Development Environment (IDE):** (Choose one: [https://www.eclipse.org/downloads/packages/release/2024-09/r/eclipse-ide-enterprise-java-and-web-developers](https://www.eclipse.org/downloads/packages/release/2024-09/r/eclipse-ide-enterprise-java-and-web-developers), [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/), or [https://netbeans.apache.org/download/index.html](https://netbeans.apache.org/download/index.html))
* **Apache Tomcat:** (Download from: [https://tomcat.apache.org/download-90.cgi](https://tomcat.apache.org/download-90.cgi))
* **MySQL Community Server:** (Download from: [https://dev.mysql.com/downloads/community/](https://dev.mysql.com/downloads/community/))
* **MySQL Workbench:** (Often included with MySQL Server, otherwise download from: [https://dev.mysql.com/downloads/](https://dev.mysql.com/downloads/))




---

## 🚀 Installation & Setup

**1. Clone the Repository:**

```bash
git clone [https://github.com/yourusername/SmartRecipeRecommender.git](https://github.com/yourusername/SmartRecipeRecommender.git)
cd SmartRecipeRecommender

2. Database Setup:
 * Open MySQL Workbench and create a new database (e.g., smartrecipes).
 * Populate the necessary tables with your recipe data.
 * Update the database connection details in your DBUtil.java file (or wherever you initialize the DriverManager):
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartrecipes", "yourUsername", "yourPassword");

3. Run on Apache Tomcat:
 * Import the SmartRecipeRecommender project into your Java IDE (Eclipse, IntelliJ, etc.) as a Dynamic Web Project.
 * Configure your IDE to deploy the project to your Apache Tomcat server.
 * Start the Tomcat server.
 * Access the application in your web browser at http://localhost:8080/SmartRecipeRecommender.
💡 Usage
 * Search Recipes: Enter your available ingredients in the search bar on the homepage to get personalized recipe recommendations.
 * Add Recipes (Admin): Navigate to the addRecipe.jsp page (you might need to provide a specific URL or access method for this).
 * View Nutrition Info: Detailed calorie and other nutritional information will be displayed alongside each recipe.
⚙️ Customization
 * Frontend Styling: Modify the look and feel of the application by editing the CSS files located in the WebContent/css/ directory.
 * User Authentication: Consider implementing user login functionality for personalized experiences and saved recipes.
 * Advanced Filtering: Enhance the search capabilities by adding more filters, such as dietary restrictions (vegetarian, vegan), cooking time, cuisine type, etc.
📄 License
This project is licensed under the MIT License. See the LICENSE file for complete details.
 Acknowledgments
 * JDBC: For providing seamless connectivity to the MySQL database.
 * Java EE: For the robust and scalable web application architecture.
 * MySQL Workbench: For the intuitive database management interface.
 * Apache Tomcat: For serving as the reliable platform to host the application.
