package com.corejava.enumdemo;

enum TrafficSignal {
	RED("STOP"), 
	GREEN("GO"), 
	ORANGE("SLOW DOWN");
	

	private String action;

	public String getAction() {
		return this.action;
	}

	// enum constructor - cannot be public or protected
	private TrafficSignal(String action) {
		this.action = action;
	}
}

public class EnumWithCustomizedValue {

	public static void main(String[] args) {

		TrafficSignal[] signal = TrafficSignal.values();

		for (TrafficSignal s : signal) {
			
			System.out.println("name: " + s.name() + " Action: "+ s.getAction());

		}
	}
}
