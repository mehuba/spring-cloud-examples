package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * Created by zhaoyibin on 19:15 2019/3/29
 */
@Component
public class SchedualServiceHiFallback implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
