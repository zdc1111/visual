package com.apexsoft.visual.service;
import com.apexsoft.visual.mybatis.model.UserDomain;
import com.github.pagehelper.PageInfo;

import java.util.List;


public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
