package no.hvl.dat110.example;

import no.hvl.dat110.stopable.Stopable;

public class DisplayDevice extends Stopable {

	private TemperatureMeasurement tm;

	public DisplayDevice(TemperatureMeasurement tm) {
		super("Display device");
		this.tm = tm;
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
