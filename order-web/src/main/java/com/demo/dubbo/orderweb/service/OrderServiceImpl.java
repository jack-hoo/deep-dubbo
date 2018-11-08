/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: OrderServiceImpl
 * Author:   shugan
 * Date:     2018/9/12 14:18
 * Description:
 */
package com.demo.dubbo.orderweb.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.demo.dubbo.po.OrderPO;
import com.demo.dubbo.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/9/12
 * @since 1.0.0
 */

//@Component
@com.alibaba.dubbo.config.annotation.Service(
        version = "1.0.0",
        timeout = 2000,
        //protocol = "rmi"
        //retries = 5
        //application = "${dubbo.application.id}",
        //protocol = "${dubbo.protocol.id}",
        //registry = "${dubbo.registry.id}"
        group = "foo",
        delay = 1000,
        token = "123456"
)
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderPO getOrderById(Long id) {
        RpcContext rpcContext = RpcContext.getContext();
        String test = rpcContext.getAttachment("test");
        System.out.println(test);
        /*try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return new OrderPO().setId(00000000000001l)
                .setGoodsAmount(100)
                .setGoodsName("shoes");
    }
}