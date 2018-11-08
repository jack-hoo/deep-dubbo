/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: OrderPO
 * Author:   shugan
 * Date:     2018/9/12 14:06
 * Description:
 */
package com.demo.dubbo.po;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/9/12
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class OrderPO implements Serializable{
    private Long id;
    private String goodsName;
    private Integer goodsAmount;
}