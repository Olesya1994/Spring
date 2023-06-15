package com.example.spring.controller;

import com.example.spring.service.ServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


@RestController
@RequestMapping("/order")
public class Controller {
    private final ServiceImp service;

    public Controller(ServiceImp service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(RequestParam ids){
        service.add((Set<Integer>) ids);

    }
    @GetMapping("/get")
    public Set<Integer> get(){
        return service.get();
    }

}
