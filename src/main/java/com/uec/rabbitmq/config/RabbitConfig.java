package com.uec.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: RabbitMq配置信息
 * @author: Ming.Lee/李明
 * @create: 2018-11-22 13:50
 **/

@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

}

