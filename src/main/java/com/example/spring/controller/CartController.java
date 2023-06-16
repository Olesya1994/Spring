package com.example.spring.controller;

import com.example.spring.service.CartServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


@RestController
@RequestMapping("/order")
public class CartController {
    private final CartServiceImp service;

    public CartController(CartServiceImp service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("ID") Set<Integer> ids) {
        service.add(ids);
    }

    @GetMapping("/get")
    public Set<Integer> get() {
        return service.get();
    }

}
