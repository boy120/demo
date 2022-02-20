package com.nacos.client.fallback;

import com.nacos.client.GoodsClient;
import org.springframework.stereotype.Component;

@Component //必须为容器对象
public class GoodsClientFallBack implements GoodsClient {

    @Override
    public String goodInfo1(String info) {
        return "goodInfo 1 调用第三方异常";
    }

    @Override
    public String goodInfo2(String info) {
        return "goodInfo 2 调用第三方异常";
    }
}
