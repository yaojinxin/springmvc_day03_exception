package com.aeolia.config;


import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.aeolia.controller","com.aeolia.service","com.aeolia.dao","com.aeolia.domain"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,TransactionConfig.class})
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class SpringConfiguration {
}
