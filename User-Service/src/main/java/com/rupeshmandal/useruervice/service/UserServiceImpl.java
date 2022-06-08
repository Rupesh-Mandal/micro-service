package com.rupeshmandal.useruervice.service;

import com.rupeshmandal.useruervice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    List<User> list=List.of(
            new User(121L,"sdfsdf","53454"),
            new User(122L,"tryhfgh","6575676"),
            new User(123L,"g nbm","53909454"),
            new User(124L,"nvghghg ","6869"),
            new User(125L,"vbnbvmnbkh","788644")
    );



    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
