package com.amsidh.mvc.config;

import com.amsidh.mvc.service.CurrencyExchangeFeignClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = CurrencyExchangeFeignClient.class)
@EnableDiscoveryClient
public class AppConfig {
}
