package com.astha.singh.controller;

import com.astha.singh.model.Orders;
import com.astha.singh.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired
    private OrdersService service;

    @GetMapping("/getAllOrders")
    public List<Orders> getAllOrders()
    {
        return  service.getAllOrders();
    }
    @PostMapping("/CreateOrders")
    public Orders createOrders(@RequestBody Orders orders)
    {
        return  service.createOrders(orders);
    }
    @PutMapping("/updateOrders")
    public Orders updateOrders(@RequestBody Orders orders)
    {
        return  service.updateOrders(orders);
    }
    @DeleteMapping("/deleteOrders")
    public  void deleteOrders(@RequestParam Integer id)
    {
        service.deeleteOrders(id);
    }
}
