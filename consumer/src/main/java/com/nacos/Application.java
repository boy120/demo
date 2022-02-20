package com.nacos;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @Description TODO
 * @Author ShengJieLiang
 * @Date 2022/2/18  15:00
 */
@SpringBootApplication(
        //解决netflix的Bean找不到问题
        scanBasePackageClasses = com.netflix.client.config.IClientConfig.class,
        //上面问题改变了默认扫描的包，这里需重新设置一下
        scanBasePackages = {"com.nacos"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.nacos.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //Feign 的日志增强类
    @Bean
    public Logger.Level logger(){
        return Logger.Level.FULL;
    }
}
