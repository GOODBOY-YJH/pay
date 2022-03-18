package com.imooc.pay.service.impl;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayServiceImplTest {

    @Autowired
    private PayServiceImpl payService;

    @Test
    public void create() {
        //  new BigDecimal() 不要用这种方式
        payService.create("836751983508", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);

    }
}