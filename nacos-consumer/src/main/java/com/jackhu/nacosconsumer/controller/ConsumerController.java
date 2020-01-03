package com.jackhu.nacosconsumer.controller;

import com.jackhu.nacosconsumer.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping("hi")
    public String hi() {
        return this.providerFeign.hello();
    }
}