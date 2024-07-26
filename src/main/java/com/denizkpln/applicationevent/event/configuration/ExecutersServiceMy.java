package com.denizkpln.applicationevent.event.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ExecutersServiceMy {

    @Bean
    public ExecutorService executersService() {
        return Executors.newCachedThreadPool();
    }
}
