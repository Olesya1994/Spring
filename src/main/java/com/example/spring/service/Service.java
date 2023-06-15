package com.example.spring.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;
//@Service
public interface Service {

     public void add( Set<Integer> ids);
    public Set<Integer> get();

}
