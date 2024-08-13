package com.javaweb.test_module4_final.controllers;

import com.javaweb.test_module4_final.models.Orders;
import com.javaweb.test_module4_final.models.Product;
import com.javaweb.test_module4_final.services.IOrderService;
import com.javaweb.test_module4_final.services.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @GetMapping("/order")
    public String order(Model model,@RequestParam(name="pageNo",defaultValue = "1")Integer pageNo) {
        Page<Orders> orders = orderService.getAll(pageNo);
        model.addAttribute("orders", orders);
        model.addAttribute("totalPage", orders.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("searchKeyword", "");
        return "orderlist";

    }








}
