package com.matrix.orderservice.service;

import com.matrix.orderservice.entity.TOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 订单 服务类
 * </p>
 *
 * @author testjava
 * @since 2021-03-22
 */
public interface TOrderService extends IService<TOrder> {

    String createOrder(String courseId, String memberId);
}
