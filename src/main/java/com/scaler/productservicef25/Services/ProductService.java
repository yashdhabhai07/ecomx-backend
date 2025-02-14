package com.scaler.productservicef25.Services;

import com.scaler.productservicef25.Exceptions.ProductNotFoundException;
import com.scaler.productservicef25.Models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws ProductNotFoundException;
    List<Product> getAllProducts();
}
