package com.example.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@Service
public class CartServiceImp implements CartService {
    @Autowired
    private final Cart cart;

    public CartServiceImp(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(Set<Integer> ids) {
        Collection<Integer> items1 = cart.getItems();
        cart.setItems(items1.addAll(ids));
    }

    @Override
    public Set<Integer> get() {
        return Collections.unmodifiableSet(cart.getItems());
    }
}
