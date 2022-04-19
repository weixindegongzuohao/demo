package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 根据id查询用户信息
     * @param id ID
     * @return int
     */
    User getUserInfo(int id);
    /**
     * 新增用户
     * @param user 用户
     * @return User
     */
    int save (User user);

    /**
     * 更新用户信息
     * @param user 用户
     * @return User
     */
    int update (User user);

    /**
     * 根据id删除
     * @param id ID
     * @return 删除成功
     */
    int deleteById (int id);

    /**
     * 查询所有用户信息
     * @return User
     */
    List<User> selectAll ();
}