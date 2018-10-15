package com.cxb.eureka.provideruser.web;


import com.cxb.eureka.provideruser.dao.UserRepository;
import com.cxb.eureka.provideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author chenxiaobin
 * @description
 * @create 2018/10/12
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = userRepository.findById(id).get();
        return user;

    }
}
