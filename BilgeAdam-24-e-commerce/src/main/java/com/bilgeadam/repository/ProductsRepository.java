package com.bilgeadam.repository;

import com.bilgeadam.entities.Cart;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Cart, Long> {
}
