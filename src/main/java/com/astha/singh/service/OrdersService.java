package com.astha.singh.service;

import com.astha.singh.model.Orders;
import com.astha.singh.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersService {

    @Autowired
    private OrdersRepository repo;

    //READ
    public Orders getOrdersById(int id)
    {

        return repo.getReferenceById(id);
    }
    //READ ALL
    public List<Orders> getAllOrders()
    {

        return repo.findAll();
    }
    //CREATE
    public Orders createOrders(Orders orders)
    {

        return  repo.save(orders);
    }
    //UPDATE
    public  Orders updateOrders(Orders orders)
    {
        repo.save(orders);
        return  orders;
    }
    //DELETE
    public void deeleteOrders(int id)
    {

        repo.deleteById(id);
    }
}
