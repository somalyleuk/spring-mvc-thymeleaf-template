package co.cstad_student.spring_web_mvc.Controller;

import co.cstad_student.spring_web_mvc.Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String listProducts(Model model) {
        // ការទាញយកទិន្នន័យពី database ដោយប្រើ static ArrayList
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.00));
        products.add(new Product("Mouse", 25.00));
        products.add(new Product("Keyboard", 75.00));
        products.add(new Product("Monitor", 300.00));

        // Add list of products ទៅ Model  ដើម្បីឱ្យ View អាចចូលប្រើបាន
        model.addAttribute("products", products);

        // Return ឈ្មោះ template របស់ Thymeleaf ដើម្បី render
        return "products";
    }

    @GetMapping("/")
    public String home() {
        // Redirect ទៅ products list នៅពេលចូលប្រើ root
        return "redirect:/products";
    }
}