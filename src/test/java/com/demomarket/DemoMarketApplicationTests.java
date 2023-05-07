package com.demomarket;

import com.demomarket.mapper.OrderMapper;
import com.demomarket.pojo.Order;
import com.demomarket.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoMarketApplicationTests {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderMapper orderMapper;

    @Test
    void contextLoads() {
        List<Order> limt = orderService.getOrderByLimt(1, 3);
        System.out.println(limt);
    }

    @Test
    void test02() {
        List<Order> list = orderMapper.getLastOrderList();
        list.forEach(System.out::println);
    }

}
