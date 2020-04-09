package no.hvl.dat110.example;

import no.hvl.dat110.stopable.Stopable;

public class DisplayDevice extends Stopable {

	private TemperatureMeasurement tm;

	public DisplayDevice(TemperatureMeasurement tm) {
		super("Display device");
		this.tm = tm;
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
