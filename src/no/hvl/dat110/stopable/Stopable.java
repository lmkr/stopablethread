package no.hvl.dat110.stopable;

public abstract class Stopable extends Thread {

	private boolean stop = false;
	protected String name;
	
	public Stopable(String name) {
		this.name = name;
	}
	
	public synchronized void doStop() {
		stop = true;
	}

	private synchronized boolean doCont() {
		return !stop;

	}

	public void starting() {
		
	}
	
	public void stopping() {
		
	}

	public abstract void doProcess();
	
	public void run() {
		
		starting();
				
		while (doCont()) {

			doProcess();
			
		}

		stopping();
		
	}
}
