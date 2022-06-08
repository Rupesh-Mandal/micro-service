package com.rupeshmandal.useruervice.controller;


import com.rupeshmandal.useruervice.entity.User;
import com.rupeshmandal.useruervice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){
        User user=userService.getUser(userId);

        List contact=restTemplate.getForObject("http://API-GATEWAY/contact/user/"+user.getUserId(), List.class);
        user.setContacts(contact);

        return user;
    }
}
