package com.demomarket.service;

import com.demomarket.pojo.Order;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 高冷男神TYJ
* @description 针对表【p_order】的数据库操作Service
* @createDate 2023-05-04 18:44:08
*/
public interface OrderService extends IService<Order> {
    List<Order> getOrderByLimt(int page, int pers);
    List<Order> getLastOrderList();
}
