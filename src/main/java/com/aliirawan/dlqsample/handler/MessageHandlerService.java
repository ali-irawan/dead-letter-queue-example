package com.aliirawan.dlqsample.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.aliirawan.dlqsample.model.Payload;

@Service
public class MessageHandlerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MessageHandlerService.class);

	@RabbitListener(queues = "${app.queue}")
	public void handleIncomingMessage(Payload payload) {
		LOGGER.info("Handle incoming message");
		LOGGER.info(payload.getMessage());

		if ("simulate-error".equals(payload.getMessage())) {
			throw new RuntimeException("Simulate error");
		}
	}
}
