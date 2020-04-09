package no.hvl.dat110.example;

public class IoTSystem {

	public static void main(String[] args) {
		
		System.out.println("IoT system starting ... ");
		
		TemperatureMeasurement tm = new TemperatureMeasurement();
		
		TemperatureDevice tempdevice = new TemperatureDevice(tm);
		DisplayDevice disdevice = new DisplayDevice(tm);
		
		tempdevice.start();
		disdevice.start();
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		tempdevice.doStop();
		disdevice.doStop();
		 
		try {
			
			
			tempdevice.join();
			disdevice.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("IoT system shutting down ... ");	
		
	}

}
