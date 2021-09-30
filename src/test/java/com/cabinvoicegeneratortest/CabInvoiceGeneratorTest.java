package com.cabinvoicegeneratortest;

import org.junit.Assert;
import org.junit.Test;

import com.cabinvoicegenerator.CabInvoiceGenerator;


public class CabInvoiceGeneratorTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void givenRideDetailsShouldReturnFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		float fare = cabInvoiceGenerator.calculate(5, 10);
		Assert.assertEquals(60, fare, 1);
		
	}
}
