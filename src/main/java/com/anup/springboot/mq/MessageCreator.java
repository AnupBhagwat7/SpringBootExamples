/**
 * 
 */
package com.anup.springboot.mq;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @author anup
 *
 */

@Component
public class MessageCreator implements CommandLineRunner {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
	private Queue queue;

	public void run(String... arg0) throws Exception {
		// This will put text message to queue
		this.jmsMessagingTemplate.convertAndSend(this.queue, "Hello Java2blog!!");
		this.jmsMessagingTemplate.convertAndSend(this.queue, "Hello Anup!!");
		this.jmsMessagingTemplate.convertAndSend(this.queue, "Hello Archu!!");
		this.jmsMessagingTemplate.convertAndSend(this.queue, "Hello there!!");
		this.jmsMessagingTemplate.convertAndSend(this.queue, "Hello Mann!!");
		System.out.println("Message has been put to queue by sender");
	}
}
