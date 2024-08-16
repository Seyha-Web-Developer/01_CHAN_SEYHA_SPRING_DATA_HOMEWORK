package com.example.SpringDataHomework.service;

import com.example.SpringDataHomework.model.entity.Order;
import com.example.SpringDataHomework.model.request.OrderRequest;
import com.example.SpringDataHomework.model.response.OrderResponse;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public OrderResponse saveOrder(Long customerId, List<OrderRequest> requests);
    public OrderResponse findByOrderId(Long orderId);
    public List<OrderResponse> findByCustomerId(Long customerId);
}
