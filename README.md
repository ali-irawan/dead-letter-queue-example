# dead-letter-queue-example
Project using Spring Boot + RabbitMQ for dead-letter-queue concept

## Prerequisites

- Have a rabbitMQ server run at port **5672**

Given configuration example:

```
		app:
		  topic: my-topic
		  queue: my-queue
		  routing: com.aliirawan.*
		  dlq-exchange: deadLetterExchange
		  dlq-routing: deadLetter
		  dlq-queue: dlq #Dead Letter Queue    
		spring:
		  rabbitmq:
		    host: 127.0.0.1
		    port: 5672
		    username: user
		    password: password
		    listener:
		      simple:
		        retry:
		          enabled: true
		          initial-interval: 3s
		          max-attempts: 2
		          max-interval: 10s
		          multiplier: 2

```

Checkout this source and run the application

```
	./mvnw spring-boot:run
```
Go to rabbitmq-managment and publish message from the administration panel to "my-queue"

```
	2020-09-12 14:21:05.658  INFO 3794 --- [           main] c.a.dlqsample.DlqsampleApplication       : Started DlqsampleApplication in 1.27 seconds (JVM running for 1.562)
	2020-09-12 14:21:20.695  INFO 3794 --- [ntContainer#0-1] c.a.d.handler.MessageHandlerService      : Handle incoming message
	2020-09-12 14:21:20.695  INFO 3794 --- [ntContainer#0-1] c.a.d.handler.MessageHandlerService      : some message
```
