package com.example.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public interface CartService {


    void add(Set<Integer> ids);

    Set<Integer> get();
}
