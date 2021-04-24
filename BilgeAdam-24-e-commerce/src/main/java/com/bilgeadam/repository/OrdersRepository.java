package com.bilgeadam.repository;

import com.bilgeadam.entities.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders,Long> {
}
