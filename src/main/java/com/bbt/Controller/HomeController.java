package com.bbt.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Override
    @RequestMapping(value = "/home")
    public String toString() {
        return super.toString();
    }
}
