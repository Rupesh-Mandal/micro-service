package com.rupeshmandal.contactservice.service;

import com.rupeshmandal.contactservice.entity.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getContactOfUser(Long userId);

}
