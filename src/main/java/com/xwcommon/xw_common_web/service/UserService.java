package com.xwcommon.xw_common_web.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xwcommon.xw_common_web.beans.User;
import com.xwcommon.xw_common_web.dao.UserMapper;
import com.xwcommon.xw_common_web.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * create by qk on 2017/10/16
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public User selectByPrimaryKey(Integer id){
        User u = new User();
        u.setName("qk-test");
        userMapper.insertSelective(u);
       /* try{
            int i = 3/0;
        }catch (Exception e){
            System.out.println("异常点");
            *//*手动抛异常 为了事物*//*
            throw  new RuntimeException();
        }*/
        System.out.println("分页查询开始");
        PageHelper.startPage(1, 3);
        Page<User> page = userMapper.selectUserListByPage();
        System.out.println(page.getResult().get(1).toString());
       return userMapper.selectByPrimaryKey(1);
    };
}
