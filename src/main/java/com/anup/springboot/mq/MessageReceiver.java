/**
 * 
 */
package com.anup.springboot.mq;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
/**
 * @author anup
 *
 */

@Component
public class MessageReceiver {
 
	@JmsListener(destination = "com.anup.testqueue")
	public void receiveQueue(String text) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Message Received: "+text);
	}
}
 