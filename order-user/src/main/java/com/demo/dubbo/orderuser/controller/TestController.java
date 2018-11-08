/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: TestController
 * Author:   shugan
 * Date:     2018/11/8 15:10
 * Description:
 */
package com.demo.dubbo.orderuser.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo.po.OrderPO;
import com.demo.dubbo.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/11/8
 * @since 1.0.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Reference(
            version = "1.0.0",
            //application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}",
            check = false,
            retries = 1,
            timeout = 10000,
            group = "*",
            validation = "true"
    )
    private OrderService orderService;

    @GetMapping("/hello")
    public OrderPO test() {
        OrderPO orderById = orderService.getOrderById(3233l);
        return orderById;
    }
}