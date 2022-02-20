package com.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author ShengJieLiang
 * @Date 2022/2/18  15:02
 */
@RestController
@RequestMapping(value = "goods")
public class Goods {

    @GetMapping("/info1/{info}")
    public String getInfo(@PathVariable String info){
        int i = 1;
        while (i!= 10){
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return info;
    }

    @GetMapping("/info2/{info}")
    public String getInfos(@PathVariable String info){
        System.out.println(info);
        return info;
    }
}
