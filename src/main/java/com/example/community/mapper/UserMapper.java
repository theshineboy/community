package com.example.community.mapper;

import com.example.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Insert("insert into user (account_id,account_name,token,gmt_createtime,gmt_updatetime) " +
            "values (#{account_id},#{account_name},#{token},#{gmt_createtime},#{gmt_updatetime})")
    void insert(User user);

    @Select("select id,account_id,account_name,token,gmt_createtime,gmt_updatetime from user " +
            "where token=#{token}")
    User findByToken(@Param("token") String token);
}
