package com.apexsoft.visual.mybatis.mapper;

import com.apexsoft.visual.mybatis.model.UserDomain;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component(value = "userDomainMaper")
public interface UserDomainMapper {
    @Insert("insert into t_user(USERID,username,password) values (FUNC_NEXTID('T_USER'),#{username},#{password})")
    int insert(UserDomain record);

    @Select({"select userId,userName,password,phone from t_user"})
    List<UserDomain> selectUsers();




}