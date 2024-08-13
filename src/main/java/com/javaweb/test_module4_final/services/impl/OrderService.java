package com.javaweb.test_module4_final.services.impl;

import com.javaweb.test_module4_final.models.Orders;
import com.javaweb.test_module4_final.repositories.IOrderRepository;
import com.javaweb.test_module4_final.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepository orderRepository;
    @Override
    public Page<Orders> getAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo-1, 5);
        return orderRepository.findAll(pageable);
    }
}
