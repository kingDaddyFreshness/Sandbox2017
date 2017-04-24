package com.jhilgedick.rest;

import javax.ws.rs.core.Response;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestSecondController {

	@Test
	public void testSecondControllerA() {
		SecondController c = new SecondController();
		Response r = c.getMsgA("johnny boy!");
		assertNotNull(r);
		assertEquals(200, r.getStatus());
		System.out.println("hi from A");
	}

	@Test
	public void testSecondControllerB() {
		SecondController c = new SecondController();
		Response r = c.getMsgB("johnny boy!");
		assertNotNull(r);
		assertEquals(200, r.getStatus());
		System.out.println("hi from B");
	}

	@Test
	public void testSecondControllerC() {
		SecondController c = new SecondController();
		Response r = c.getMsgB("johnny boy!");
		assertNotNull(r);
		assertEquals(200, r.getStatus());
		System.out.println("hi from D");
	}
}
