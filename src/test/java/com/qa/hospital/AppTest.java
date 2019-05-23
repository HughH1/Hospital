package com.qa.hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

	@Before
	public void setup() {

	}

	@Test
	public void admitPatients() {
		Patient patient = new Patient();
		Hospital.admitPatient(patient);
		patient.setLocation("Ward 1");
		assertEquals("Can not find location", "Ward 1", patient.getLocation());
	}

	@Test
	public void test2() {
		assertEquals("can't create treatment plan", "", d.createTreatment(1, "treatment"));
	}

}
