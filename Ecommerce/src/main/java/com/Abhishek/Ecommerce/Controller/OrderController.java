package com.Abhishek.Ecommerce.Controller;

import com.Abhishek.Ecommerce.Entity_Model.OrderRequest;
import com.Abhishek.Ecommerce.Service.OrderService;
import com.Abhishek.Ecommerce.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place/{userId}")
    public OrderDTO placeOrder(@PathVariable Long userId, @RequestBody OrderRequest orderRequest)
    {
        return orderService.placeOrder(userId, orderRequest.getProductQuantity(), orderRequest.getTotalAmount());
    }

    @GetMapping("/all-orders")
    public List<OrderDTO> getAllOrders()
    {
        return orderService.getAllOrders();
    }

    @GetMapping("/user/{user-id}")
    public List<OrderDTO> getOrderByUser(@PathVariable Long userId)
    {
        return orderService.getOrderByUser(userId);
    }
}
