package com.woodhill.user.service.config;

import com.woodhill.hotel.services.HotelService;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * AppConfiguration class provides configuration for the UserService application.
 */
@Configuration
public class AppConfiguration {

    /**
     * Creates a RestTemplate bean.
     *
     * @return a RestTemplate bean
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
