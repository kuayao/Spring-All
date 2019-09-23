package com.groupthree.service.impl;

import com.groupthree.bean.User;
import com.groupthree.dao.UserMapper;
import com.groupthree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @classname :UserServiceImpl
 * @program: groupThree
 * @description: User实现类
 * @author: HaiPangXia
 * @create: 2019-09-23 10:23
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User Sel(int id) {
        return userMapper.Sel(id);
    }
}
