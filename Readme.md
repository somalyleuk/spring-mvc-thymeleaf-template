# Run the Application:

- Open a terminal in the root directory of your project.

- Run Gradle: gradle bootRun

- Open your web browser and go to http://localhost:8080/products.

- You should see a web page displaying the list of products from the static ArrayList.


- The Controller (ProductController) handles the /products request.

- It populates a List<Product> (our static data acting as the Model).

- It adds this list to the Spring Model object, making it accessible to the view.

- It returns the logical view name "products".

Thymeleaf resolves this to products.html and renders the data from the Model into the HTML table.# spring-mvc-thymeleaf
# spring-mvc-thymeleaf-template

<img width="1728" alt="image" src="https://github.com/user-attachments/assets/646efde8-092b-4a1f-9236-bdd36d464334" />

