package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    @Select("select username,sex,level,birth,email,authority from users where user_id = #{user_id}")
     User getUserById(@Param("user_id") String user_id);
}
