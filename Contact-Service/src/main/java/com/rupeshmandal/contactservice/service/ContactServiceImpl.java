package com.rupeshmandal.contactservice.service;

import com.rupeshmandal.contactservice.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> contacts=List.of(
            new Contact(121L,"sdfsdf","53454",121L),
            new Contact(122L,"tryhfgh","6575676",122L),
            new Contact(123L,"g nbm","53909454",123L),
            new Contact(124L,"nvghghg ","6869",123L),
            new Contact(125L,"vbnbvmnbkh","788644",125L)
    );


    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
