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
		// TODO
	}
	
	public void doProcess() {
		// TODO
	}
	
	@Override
	public void stopping() {
		// TODO
	}
}
