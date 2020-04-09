package no.hvl.dat110.example;

public class IoTSystem {

	public static void main(String[] args) {
		
		System.out.println("IoT system starting ... ");
		
		TemperatureMeasurement tm = new TemperatureMeasurement();
		
		TemperatureDevice tempdevice = new TemperatureDevice(tm);
		DisplayDevice disdevice = new DisplayDevice(tm);
		
		// TODO
		
		// start the devices
		
		// let the main-thread wait for while
		
		// stop the two stopable-threads
		
		// wait for the two stopable-threads to terminate
		tempdevice.start();
		
		System.out.println("IoT system shutting down ... ");	
		
	}

}
