package com.shpyrna.order_api.conroller;


import com.shpyrna.order_api.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/user")
    public User getUser(){
        return new User("email@com", "1111");
    }
}
