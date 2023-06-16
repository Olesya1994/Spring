package com.example.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@SessionScope
public class Cart {
    private Set<Integer> items;

    public Cart(Set<Integer> items) {
        this.items = items;
    }

    public Set<Integer> getItems() {
        return items;
    }

    public void setItems(Set<Integer> items) {
        this.items = items;
    }
}
