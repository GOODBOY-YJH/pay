package com.imooc.pay.enums;

import com.lly835.bestpay.enums.BestPayTypeEnum;

public enum PayPlatformEnum {
    ALIPAY(1),
    WX(2),
    ;
    Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    PayPlatformEnum(Integer code){
        this.code = code;
    }
    public static PayPlatformEnum getByBestPayTypeEnum(BestPayTypeEnum bestPayTypeEnum) {
        // if(bestPayTypeEnum.getPlatform().name() == PayPlatformEnum.ALIPAY.name()){
        //     return PayPlatformEnum.ALIPAY;
        // }else if(bestPayTypeEnum.getPlatform().name() == PayPlatformEnum.WX.name()){
        //     return PayPlatformEnum.WX;
        // }
        for (PayPlatformEnum payPlatformEnum : PayPlatformEnum.values()) {
            if (bestPayTypeEnum.getPlatform().name().equals(payPlatformEnum.name())){
                return payPlatformEnum;
            }
        }
        throw new RuntimeException("错误的支付平台"+ bestPayTypeEnum.name());
    }
}
