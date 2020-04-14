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
	protected void starting() {
		// TODO
	}
	
	protected void doProcess() {
		// TODO
	}
	
	@Override
	protected void stopping() {
		// TODO
	}
}
