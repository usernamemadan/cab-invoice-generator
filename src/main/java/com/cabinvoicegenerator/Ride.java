package com.cabinvoicegenerator;

public class Ride {
	
	private float kilometers;
	private float minutes;
	
	public Ride(float kilometers, float minutes) {
		this.kilometers = kilometers;
		this.minutes = minutes;
	}

	public float getKilometers() {
		return kilometers;
	}

	public float getMinutes() {
		return minutes;
	}
}
