package org.ydy.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.ydy.entity.User;

public interface UserMapper {
    @Select("select * from sys_user where usr_name=#{usr_name} and usr_password=#{usr_password}")
    public User userLogin(@Param("usr_name") String usr_name, @Param("usr_password") String usr_password);
}
