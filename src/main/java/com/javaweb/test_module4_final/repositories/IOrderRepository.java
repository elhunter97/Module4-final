package com.javaweb.test_module4_final.repositories;

import com.javaweb.test_module4_final.models.Orders;
import com.javaweb.test_module4_final.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IOrderRepository extends JpaRepository<Orders, Long> {

}
