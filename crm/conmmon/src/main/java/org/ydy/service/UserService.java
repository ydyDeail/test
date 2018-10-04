package org.ydy.service;

import org.ydy.entity.User;

public interface UserService {
    User userLogin(String usr_name,String usr_password);
}
