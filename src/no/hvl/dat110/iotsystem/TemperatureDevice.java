package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		Client client = new Client("testuser", Common.BROKERHOST, Common.BROKERPORT);
		// create a client object and use it to

		client.connect();
		
		// - connect to the broker
		
		for(int i = 0; i<COUNT;i++) {
		
		client.publish(Common.TEMPTOPIC, "Temperature is " + sn.read());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// - publish the temperature(s)
		}
		client.disconnect();
		// - disconnect from the broker

		// TODO - end

		System.out.println("Temperature device stopping ... ");


	}
}
