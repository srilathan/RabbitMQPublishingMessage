package com.springboot.rabbitmq.listener.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.springboot.rabbitmq.listener.model.Employee;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${java.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}