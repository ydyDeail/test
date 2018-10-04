package org.ydy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.ydy.domain.RestCode;
import org.ydy.domain.Restrespones;
import org.ydy.entity.User;
import org.ydy.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @PostMapping(value = "/user/login", produces = "application/json;charset=utf-8")
    public Restrespones<User> userLogin(@RequestBody User user){
        User user1=userService.userLogin(user.getUsr_name(),user.getUsr_password());
        if(user1!=null){
            return Restrespones.success(user1);
        }else{
            return Restrespones.error(RestCode.USER_NOT_FIND);
        }
    }
}
