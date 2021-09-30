package com.cabinvoicegeneratortest;

import org.junit.Assert;
import org.junit.Test;

import com.cabinvoicegenerator.CabInvoiceGenerator;


public class CabInvoiceGeneratorTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void givenRideDetailsShouldReturnFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		
		cabInvoiceGenerator.addRide(20, 10);
		cabInvoiceGenerator.addRide(10, 5);
		float fare = cabInvoiceGenerator.calculateFare();
		Assert.assertEquals(315, fare, 1);
	}
}
