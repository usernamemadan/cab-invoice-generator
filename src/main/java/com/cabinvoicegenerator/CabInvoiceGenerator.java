package com.cabinvoicegenerator;

public class CabInvoiceGenerator {
	
	private static final int MIN_FARE = 5;
	private static final int COST_PER_KILOMETER = 10;
	private static final int COST_PER_MINUTE = 1;
	
	public float calculate(float kilometer, float min) {
		float fare = kilometer * COST_PER_KILOMETER + min * COST_PER_MINUTE;
		return fare > MIN_FARE ? fare : MIN_FARE;
	}
}
