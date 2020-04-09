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

		System.out.println(super.name + " starting q...");

	}

	public void doProcess() {

		int temp = tm.getTemperature();

		System.out.println("DISPLAY: " + temp);
		
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
