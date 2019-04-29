package com.controller.demo;

import com.entity.User;
import com.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author peter
 * date: 2019-04-29 11:06
 **/
@RestController
@AllArgsConstructor
public class TestController {

    private UserService userService;


    @GetMapping(value = {"","/"})
    public List<User> findAll(){
        return userService.findAll();
    }

}
