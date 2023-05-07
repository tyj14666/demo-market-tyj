package com.demomarket.controller;

import com.demomarket.pojo.Order;
import com.demomarket.pojo.Page;
import com.demomarket.service.OrderService;
import com.demomarket.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order/list")
    public Result<Map<String,Object>> getOrderList(@RequestBody Page page){
        Map<String,Object> data=new HashMap<>();
        List<Order> orderList = orderService.getOrderByLimt(page.getPage(), page.getPers());
        System.out.println("orderList = " + orderList);
//        总条数
        int total = (int) orderService.count();
//        总页数
        int  currentPage =(total+ page.getPers()-1)/ page.getPers();
//        是否有下一页
        boolean hasNext=page.getPage() + 1 <= currentPage ? true : false;



        data.put("total",total);
        data.put("data",orderList);
//        data.put("rows",orderList);
        data.put("page",page.getPage());
        data.put("pers",page.getPers());
        data.put("hasNext",hasNext);
        return Result.success("操作成功",data);
    }

    @GetMapping("/order/last")
    public Result<List<Order>> last(){
        List<Order> lastOrderList = orderService.getLastOrderList();
        return Result.success(lastOrderList);
    }
}
