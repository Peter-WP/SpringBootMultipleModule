package com.service;

import com.entity.User;
import com.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author peter
 * date: 2019-04-29 10:39
 **/
@AllArgsConstructor
@Component
public class DataInitRunner implements ApplicationRunner {

    private UserRepository userRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        userRepository.save(new User("11", 11));
        userRepository.save(new User("22", 22));
        userRepository.save(new User("33", 33));
        userRepository.save(new User("44", 44));
    }
}
