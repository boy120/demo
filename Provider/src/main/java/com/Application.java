package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @Author ShengJieLiang
 * @Date 2022/2/18  15:00
 */
@SpringBootApplication(scanBasePackageClasses = {com.netflix.client.config.IClientConfig.class},//解决netflix问题
                       scanBasePackages = {"com.nacos.controller"})//前面改变了默认扫描的包，这里需重新设置一下
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
