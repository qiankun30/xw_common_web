package com.xwcommon.xw_common_web.dao;


import com.github.pagehelper.Page;
import com.xwcommon.xw_common_web.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int deletyPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 分页查询数据
     */
    Page<User> selectUserListByPage();
}