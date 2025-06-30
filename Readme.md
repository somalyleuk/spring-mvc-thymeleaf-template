Run the Application:

Open a terminal in the root directory of your project.

Run the application using Maven: mvn spring-boot:run
or Gradle: ./gradlew bootRun 

Open your web browser and go to http://localhost:8080/products.

You should see a web page displaying the list of products from the static ArrayList.

This example demonstrates the basic flow:

The Controller (ProductController) handles the /products request.

It populates a List<Product> (our static data acting as the Model).

It adds this list to the Spring Model object, making it accessible to the view.

It returns the logical view name "products".

Thymeleaf (our View technology) resolves this to products.html and renders the data from the Model into the HTML table.# spring-mvc-thymeleaf-
# spring-mvc-thymeleaf-template
