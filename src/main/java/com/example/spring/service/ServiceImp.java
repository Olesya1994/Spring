package com.example.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.Set;
@SessionScope
@Service

public class ServiceImp implements com.example.spring.service.Service {
    public Set<Integer> items;

    public ServiceImp(Set<Integer> items){
        this.items = items;
    }


    @Override
    public void add(Set<Integer> ids) {
        items.addAll(ids);
    }

      @Override
      public Set<Integer> get() {
        return Collections.unmodifiableSet(items);
    }
}
