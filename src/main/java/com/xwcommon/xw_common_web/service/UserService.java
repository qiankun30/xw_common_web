package com.xwcommon.xw_common_web.service;

import com.xwcommon.xw_common_web.beans.User;
import com.xwcommon.xw_common_web.dao.UserMapper;
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
        try{
            int i = 3/0;
        }catch (Exception e){
            System.out.println("异常点");
            /*手动抛异常 为了事物*/
            throw  new RuntimeException();
        }
       return userMapper.selectByPrimaryKey(1);
    };
}
