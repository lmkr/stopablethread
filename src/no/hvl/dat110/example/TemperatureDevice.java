package no.hvl.dat110.example;

import no.hvl.dat110.stopable.Stopable;

public class TemperatureDevice extends Stopable {

	private TemperatureMeasurement tm;
	private TemperatureSensor sn;
		
	public TemperatureDevice(TemperatureMeasurement tm) {
		super("Sensor device");
		this.tm = tm;
		this.sn = new TemperatureSensor();
	}
	
	@Override
	public void starting() {
		System.out.println(super.name + " starting ...");
	}
	
	public void doProcess() {
					
				int temp = sn.read();
				System.out.println("READING: " + temp);
				
				tm.setTemperature(temp);

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

	@Override
	public void stopping() {
		
		System.out.println(super.name + " stopping ...");
		
	}
}
