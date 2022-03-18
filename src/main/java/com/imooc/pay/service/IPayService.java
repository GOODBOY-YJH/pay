package com.imooc.pay.service;

import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

public interface IPayService {

    /**
     *     创建、发起支付
     * @param orderId
     * @param amount
     * @return
     */
    PayResponse create(String orderId, BigDecimal amount);

    /**
     *异步通知处理
     * @param notifyData
     */
    String  asyncNotity(String notifyData);

}
