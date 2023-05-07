package com.demomarket.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demomarket.pojo.Order;
import com.demomarket.service.OrderService;
import com.demomarket.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 高冷男神TYJ
* @description 针对表【p_order】的数据库操作Service实现
* @createDate 2023-05-04 18:44:08
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrderByLimt(int page, int pers) {
        page=(page-1)*pers;
        List<Order> orderList = orderMapper.getOrderByLimt(page, pers);
        return orderList;
    }

    @Override
    public List<Order> getLastOrderList() {
        return orderMapper.getLastOrderList();
    }
}




