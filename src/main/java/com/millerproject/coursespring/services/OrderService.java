package com.millerproject.coursespring.services;

import com.millerproject.coursespring.entities.Order;
import com.millerproject.coursespring.entities.User;
import com.millerproject.coursespring.repositories.OrderRepository;
import com.millerproject.coursespring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
