package com.scaler.productservicef25.Controller;

import com.scaler.productservicef25.Exceptions.ProductNotFoundException;
import com.scaler.productservicef25.Models.Product;
import com.scaler.productservicef25.Services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductByID(@PathVariable("id") Long id) throws ProductNotFoundException {
            Product product = productService.getProductById(id);
//        try {
//            Product product = productService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//        } catch (ProductNotFoundException e) {
//            responseEntity = new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
//        }
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return null;
    }
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return null;
    }
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return null;
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long productId){

    }
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException Ex){
        return new ResponseEntity<>(Ex.getMessage(),HttpStatus.SERVICE_UNAVAILABLE);
    }
}
