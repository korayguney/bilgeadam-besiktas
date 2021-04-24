package com.bilgeadam.repository;

import com.bilgeadam.entities.OrderItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends CrudRepository<OrderItems,Long> {
}
