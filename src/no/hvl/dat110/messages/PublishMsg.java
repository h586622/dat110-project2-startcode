package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	String topic;
	String message;
	
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic=topic;
		this.message=message;
		
	}

	public PublishMsg(String topic, String user, MessageType type, String message) {
		super(type, user);
		this.topic = topic;	
		this.message = message;
	}
	
	

	public void setMessage(String message) {
		this.message = message;
	}



	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String toString() {
		return "Topic is " + topic + " message /n" + message;
 	}
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getMessage() {
		
		return message;
	}
}
