package com.scaler.productservicef25.Services;

import com.scaler.productservicef25.Exceptions.ProductNotFoundException;
import com.scaler.productservicef25.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelfProductService implements ProductService {

    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
//        Make a db call to get the product of given ID
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
