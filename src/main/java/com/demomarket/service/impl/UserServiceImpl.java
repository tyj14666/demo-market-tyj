package com.demomarket.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demomarket.pojo.User;
import com.demomarket.service.UserService;
import com.demomarket.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 高冷男神TYJ
* @description 针对表【p_user】的数据库操作Service实现
* @createDate 2023-05-04 18:43:34
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




