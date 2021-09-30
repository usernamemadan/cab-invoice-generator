package com.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.List;

public class RideRepository {

	List<Ride> rideList = new ArrayList<Ride>();

	public void addRide(float kilometer, float min) {
		Ride ride = new Ride(kilometer, min);
		rideList.add(ride);
	}

}
