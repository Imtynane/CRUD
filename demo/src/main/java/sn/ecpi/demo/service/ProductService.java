package sn.ecpi.demo.service;

import sn.ecpi.demo.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(UUID id);

    Product createProduct(Product product);

    Product updateProduct(UUID id, Product updatedProduct);

    boolean deleteProduct(UUID id);

    List<Product> searchProducts(String keyword);

    Product findProductByProductName(String productName);
}