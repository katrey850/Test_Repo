package com.cognixia.jump.corejava.classes;

public class Patient {

	// Attributes
	String name;
	int temperature;
	boolean sick;
	
	
	// Constructor
	public Patient() {
		this.name = "";
		this.temperature = 0;
		this.sick = false;
	}
	
	public Patient(String name, int temperature, boolean sick) {
		this.name = name;
		this.temperature = temperature;
		this.sick = sick;
	}
	
	
	// Methods
	public void getSick() {
		this.sick = true;
	}
	
	public void getHealthy() {
		this.sick = false;
	}

	
	// Special Methods - getters and setters
	public void setName(String name) {
		this.name = name;
	}
	
}

