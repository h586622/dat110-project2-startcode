package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {
	
	String topic;
	
	public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		this.topic = topic;
	}

	public SubscribeMsg(String topic, String user, MessageType type) {
		super(type, user);
		this.topic = topic;		
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String toString() {
		return "Topic is " + topic;
 	}

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
		
}
