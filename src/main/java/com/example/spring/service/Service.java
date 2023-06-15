package com.example.spring.service;

import java.util.Set;

public interface Service {
    void add(Set<Integer> ids);

    Set<Integer> get();
}
