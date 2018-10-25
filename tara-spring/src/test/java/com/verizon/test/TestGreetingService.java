package com.verizon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.verizon.adb.model.Customer;
import com.verizon.adb.restapi.CustomerApi;
import com.verizon.adb.restapi.*;

public class TestGreetingService {
	CustomerApi gs;
	
	@Before
	public void setUp() throws Exception {
		this.gs= new CustomerApi();
	}

	@After
	public void tearDown() throws Exception {
		this.gs=null;
	}

	@Test
	public void testGreetForValidUserName() {
		String input ="Srinivasan";
		String expected ="Hello Srinivasan";
		
		Customer customer;
		String actual = null;
		//String actual = gs.addCustomer(customer);
		assertEquals(expected, actual);
	}
	 @Test
	 public void testGreetForNUllUserName(){
		Object actual = null;
		// String actual = gs.addCustomer(null);
		 assertNull(actual);
	 }

}
