package com.nacos.client;


import com.nacos.client.fallback.GoodsClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "provider", fallback = GoodsClientFallBack.class)
public interface GoodsClient {

    @GetMapping("goods/info1/{info}")
    String goodInfo1(@PathVariable String info);

    @GetMapping("goods/info2/{info}")
    String goodInfo2(@PathVariable String info);
}

