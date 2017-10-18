package com.xwcommon.xw_common_web.controller;

import com.xwcommon.xw_common_web.beans.User;
import com.xwcommon.xw_common_web.dao.UserMapper;
import com.xwcommon.xw_common_web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by qk on 2017/10/16
 */
@RestController
public class HelloController {
    final static Logger logger = LoggerFactory.getLogger("HelloController.class");

    @Autowired
    UserService userService;

    @GetMapping(value="hello")
    public String say(){
        System.out.println("tsttttttt乾坤tttttttttttyyyyyyy1777111");
        logger.error("哈哈");
        logger.info("qinak");
        User user = null;
        try {
            user = userService.selectByPrimaryKey(1);
            System.out.println(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("有异常");
            return "hello fail qiankun";
        }

        return "hello,qiankun";
    }
}

