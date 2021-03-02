package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {
	
	String topic;
	
	public UnsubscribeMsg(String user, String topic) {
		super(MessageType.UNSUBSCRIBE, user);
		this.topic = topic;
	}

	public UnsubscribeMsg(String topic, String user, MessageType type) {
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

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
}
