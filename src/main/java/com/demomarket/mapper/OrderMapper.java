package com.demomarket.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.demomarket.pojo.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 高冷男神TYJ
* @description 针对表【p_order】的数据库操作Mapper
* @createDate 2023-05-04 18:44:08
* @Entity com.demomarket.pojo.Order
*/
public interface OrderMapper extends BaseMapper<Order> {

    List<Order> getOrderByLimt(int page,int pers);

    List<Order> getLastOrderList();

}




