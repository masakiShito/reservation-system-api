package com.life.engineer.happy.reservation_system.mapper;

import com.life.engineer.happy.reservation_system.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users WHERE username = #{username}")
    User findByUsername(String username);
}
