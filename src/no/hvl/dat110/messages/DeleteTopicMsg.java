package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	String topic;

	public DeleteTopicMsg(String user, String topic) {
		super(MessageType.DELETETOPIC, user);
		this.topic = topic;
	}
	
	public DeleteTopicMsg(String topic, String user, MessageType type) {
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
	
	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

}
