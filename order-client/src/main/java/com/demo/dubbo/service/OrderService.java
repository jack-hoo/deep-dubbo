/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: OrderService
 * Author:   shugan
 * Date:     2018/9/12 14:05
 * Description:
 */
package com.demo.dubbo.service;

import com.demo.dubbo.po.OrderPO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/9/12
 * @since 1.0.0
 */
public interface OrderService {
    OrderPO getOrderById(@NotNull Long id);
}