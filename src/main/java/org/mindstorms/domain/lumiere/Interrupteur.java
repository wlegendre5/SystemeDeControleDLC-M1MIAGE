package org.mindstorms.domain.lumiere;

import lejos.nxt.ADSensorPort;
import lejos.nxt.TouchSensor;
import org.mindstorms.service.SysControlDLC;

public class Interrupteur extends/* Thread*/TouchSensor{

	public Interrupteur(ADSensorPort port) {
		super(port);
		// TODO Auto-generated constructor stub
	}

	private TouchSensor interrupt;
	private boolean io = false;

	/*public void ioActive() {
	   io = true;
	}*/
	
	/*public Interrupteur(ADSensorPort port) {
		interrupt = new TouchSensor(port);
		super(port);
	}*/
	
	public boolean pushed() {
		return this.isPressed();
	}

}
