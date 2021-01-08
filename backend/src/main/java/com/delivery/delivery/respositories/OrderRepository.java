package com.delivery.delivery.respositories;

import com.delivery.delivery.entities.Order;
import com.delivery.delivery.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
