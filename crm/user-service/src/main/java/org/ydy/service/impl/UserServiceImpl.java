package org.ydy.service.impl;

import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.ydy.entity.User;
import org.ydy.mapper.UserMapper;
import org.ydy.service.UserService;
import org.ydy.util.JWTHelper;

import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StringRedisTemplate redisTemplate;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    //用户登录
    @Override
    public User userLogin(String usr_name, String usr_password) {
        User user=userMapper.userLogin(usr_name,usr_password);
        if(user!=null){
            String token= JWTHelper.genToken(ImmutableMap.of("usr_name",user.getUsr_name()));
            redisTemplate.opsForValue().set(user.getUsr_name(),token);
            redisTemplate.expire(user.getUsr_name(),30, TimeUnit.MINUTES);
            user.setToken(token);
        }
        return user;
    }
}
