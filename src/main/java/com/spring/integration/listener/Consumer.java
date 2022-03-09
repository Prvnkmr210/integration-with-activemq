package com.spring.integration.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
//	@JmsListener(destination="standalone.queue")
	public void consume(String message) {
		System.out.println(message);
	}

}
