package com.aliirawan.dlqsample.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfiguration {

	@Autowired
	private AppConfig appConfig;

	@Bean
	public Queue queueSample() {
		// @formatter:off
		return QueueBuilder.durable(appConfig.getQueueName())
				.withArgument("x-dead-letter-exchange", appConfig.getDlqExchangeName())
				.withArgument("x-dead-letter-routing-key", appConfig.getDlqRouting())
				.build();
		// @formatter:on
	}

	@Bean
	Queue dlq() {
		return QueueBuilder.durable(appConfig.getDlqName()).build();
	}
}
