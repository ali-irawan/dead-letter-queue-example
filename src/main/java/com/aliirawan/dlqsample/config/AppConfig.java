package com.aliirawan.dlqsample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Value("${app.topic}")
	private String topicName;
	
	@Value("${app.queue}")
	private String queueName;
	
	@Value("${app.routing}")
	private String routing;
	
	@Value("${app.dlq-exchange}")
	private String dlqExchangeName;
	
	@Value("${app.dlq-routing}")
	private String dlqRouting;
	
	@Value("${app.dlq-queue}")
	private String dlqName;

	/**
	 * @return the topicName
	 */
	public String getTopicName() {
		return topicName;
	}

	/**
	 * @param topicName the topicName to set
	 */
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	/**
	 * @return the queueName
	 */
	public String getQueueName() {
		return queueName;
	}

	/**
	 * @param queueName the queueName to set
	 */
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	/**
	 * @return the dlqName
	 */
	public String getDlqName() {
		return dlqName;
	}

	/**
	 * @param dlqName the dlqName to set
	 */
	public void setDlqName(String dlqName) {
		this.dlqName = dlqName;
	}

	/**
	 * @return the dlqExchangeName
	 */
	public String getDlqExchangeName() {
		return dlqExchangeName;
	}

	/**
	 * @param dlqExchangeName the dlqExchangeName to set
	 */
	public void setDlqExchangeName(String dlqExchangeName) {
		this.dlqExchangeName = dlqExchangeName;
	}

	/**
	 * @return the dlqRouting
	 */
	public String getDlqRouting() {
		return dlqRouting;
	}

	/**
	 * @param dlqRouting the dlqRouting to set
	 */
	public void setDlqRouting(String dlqRouting) {
		this.dlqRouting = dlqRouting;
	}

	/**
	 * @return the routing
	 */
	public String getRouting() {
		return routing;
	}

	/**
	 * @param routing the routing to set
	 */
	public void setRouting(String routing) {
		this.routing = routing;
	}
	
}
