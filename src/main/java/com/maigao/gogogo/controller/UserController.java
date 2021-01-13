package com.maigao.gogogo.controller;


import com.maigao.gogogo.entity.po.User;
import com.maigao.gogogo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userAll.do")
    public List<User> getUserAll() {
        List<User> all = userService.findAll();
        return all;
    }
}
