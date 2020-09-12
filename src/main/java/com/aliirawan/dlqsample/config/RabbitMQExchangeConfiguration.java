package com.aliirawan.dlqsample.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfiguration {

	@Autowired
	private AppConfig appConfig;

	@Bean
	public TopicExchange topicExchange() {
		return new TopicExchange(appConfig.getTopicName());
	}

	@Bean
	DirectExchange deadLetterExchange() {
		return new DirectExchange(appConfig.getDlqExchangeName());
	}
}
