/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: OrderController
 * Author:   shugan
 * Date:     2018/9/12 14:20
 * Description:
 */
package com.demo.dubbo.orderweb.controller;

import com.demo.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/9/12
 * @since 1.0.0
 */
/*@RestController
@RequestMapping("/order")*/
public class OrderController {
    @Autowired
    private OrderService orderService;
    //test git
    /*@GetMapping
    public OrderPO getOder() {
        return orderService.getOrderById(00001l);
    }*/
}