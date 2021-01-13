package com.maigao.gogogo.service.user.impl;

import com.maigao.gogogo.entity.po.User;
import com.maigao.gogogo.repository.UserRepository;
import com.maigao.gogogo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

}
