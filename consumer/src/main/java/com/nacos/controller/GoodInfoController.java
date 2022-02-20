package com.nacos.controller;

import com.nacos.client.GoodsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author ShengJieLiang
 * @Date 2022/2/19  18:07
 */
@RestController
@RequestMapping("goods")
public class GoodInfoController {

    @Autowired
    private GoodsClient goodsClient;

    @GetMapping("/info1/{info}")
    public String goodInfo1(@PathVariable String info){
        System.out.println(info);
        return  goodsClient.goodInfo1(info);
    }

    @GetMapping("/info2/{info}")
    public String goodInfo2(@PathVariable String info){
        System.out.println(info);
        return  goodsClient.goodInfo2(info);
    }

}
