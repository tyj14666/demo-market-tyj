package com.demomarket.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.demomarket.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 高冷男神TYJ
* @description 针对表【p_user】的数据库操作Mapper
* @createDate 2023-05-04 18:43:34
* @Entity com.demomarket.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {
    List<User> selectNicknameAndMobileById(@Param("id") Integer id);
}




