package com.javaweb.test_module4_final.services;

import com.javaweb.test_module4_final.models.Orders;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface IOrderService {

    Page<Orders> getAll(Integer pageNo);
}
