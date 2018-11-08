/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: OrderServiceGroup2Impl
 * Author:   shugan
 * Date:     2018/9/14 14:04
 * Description:
 */
package com.demo.dubbo.orderweb.service;

import com.demo.dubbo.po.OrderPO;
import com.demo.dubbo.service.OrderService;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/9/14
 * @since 1.0.0
 */
/*@com.alibaba.dubbo.config.annotation.Service(
        version = "2.0.0",
        timeout = 2000,
        group = "bar",
        delay = 1000
        //validation = "true"
)*/
public class OrderServiceGroup2Impl implements OrderService {

    @Override
    public OrderPO getOrderById(Long id) {
        return new OrderPO().setId(00000000000001l)
                .setGoodsAmount(100)
                .setGoodsName("shoes from group2");
    }
}