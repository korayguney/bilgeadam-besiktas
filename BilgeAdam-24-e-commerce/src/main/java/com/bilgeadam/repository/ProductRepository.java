package com.bilgeadam.repository;

import com.bilgeadam.entities.Cart;
import com.bilgeadam.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
