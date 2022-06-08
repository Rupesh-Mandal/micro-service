package com.rupeshmandal.contactservice.controller;

import com.rupeshmandal.contactservice.entity.Contact;
import com.rupeshmandal.contactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("/user/{userId}")
    public List<Contact> getContactOfUser(@PathVariable("userId") Long userId){
        return contactService.getContactOfUser(userId);
    }
}
