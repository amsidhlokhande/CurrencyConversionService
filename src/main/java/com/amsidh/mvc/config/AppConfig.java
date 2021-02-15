package com.amsidh.mvc.config;

import com.amsidh.mvc.service.CurrencyExchangeFeignClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = CurrencyExchangeFeignClient.class)
public class AppConfig {
}
