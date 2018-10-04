package org.ydy.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer usr_id; //用户编号
    private String usr_name; //用户名
    private String usr_password; //用户密码
    private Integer Usr_role_id; //用户角色id
    private Integer Usr_flag; //用户标记
    private String token;

    public User(Integer usr_id, String usr_name, String usr_password, Integer usr_role_id, Integer usr_flag, String token) {
        this.usr_id = usr_id;
        this.usr_name = usr_name;
        this.usr_password = usr_password;
        Usr_role_id = usr_role_id;
        Usr_flag = usr_flag;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User(String usr_name, String usr_password, Integer usr_role_id, Integer usr_flag) {
        this.usr_name = usr_name;
        this.usr_password = usr_password;
        Usr_role_id = usr_role_id;
        Usr_flag = usr_flag;
    }

    public User() {
    }


    public Integer getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public String getUsr_password() {
        return usr_password;
    }

    public void setUsr_password(String usr_password) {
        this.usr_password = usr_password;
    }

    public Integer getUsr_role_id() {
        return Usr_role_id;
    }

    public void setUsr_role_id(Integer usr_role_id) {
        Usr_role_id = usr_role_id;
    }

    public Integer getUsr_flag() {
        return Usr_flag;
    }

    public void setUsr_flag(Integer usr_flag) {
        Usr_flag = usr_flag;
    }
}
