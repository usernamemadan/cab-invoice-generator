package com.cabinvoicegenerator;

public class CabInvoiceGenerator extends RideRepository implements InvoiceService {
	
	private static final int MIN_FARE = 5;
	private static final int COST_PER_KILOMETER = 10;
	private static final int COST_PER_MINUTE = 1;
	
	public float calculateFare() {
		float totalFare = 0;
		float fare = 0;
		for (Ride ride : rideList) {
			fare = ride.getKilometers() * COST_PER_KILOMETER + ride.getMinutes() * COST_PER_MINUTE;
			totalFare += fare;
		}
		return totalFare > MIN_FARE ? totalFare : MIN_FARE;
	}

}
