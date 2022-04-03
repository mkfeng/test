package com.example.dubbotest.Impl;

import com.example.dubbotest.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}