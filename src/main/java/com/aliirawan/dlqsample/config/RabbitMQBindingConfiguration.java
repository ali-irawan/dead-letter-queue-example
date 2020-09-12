package com.aliirawan.dlqsample.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQBindingConfiguration {

	@Autowired
	private AppConfig appConfig;

	@Bean
	public Binding bindingTopicExchangeQueueSampleTopicRabbitMQ(TopicExchange topicExchange, Queue queueSample) {
		return BindingBuilder.bind(queueSample).to(topicExchange).with(appConfig.getRouting());
	}

	@Bean
	public Binding bindingTopicExchangeQueueDLQTopicRabbitMQ(DirectExchange deadLetterExchange, Queue dlq) {
		return BindingBuilder.bind(dlq).to(deadLetterExchange).with(appConfig.getDlqRouting());
	}
}
