package edu.westga.comp4420.junit_sample.test.model.telephone_checker;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import edu.westga.comp4420.junit_sample.model.TelephoneChecker;

class TestIdentifySpam {
	
	@Test
	void testValidNumber() {
		
	TelephoneChecker checker = new TelephoneChecker();
		assertFalse(checker.identifySpam(1111234567L));
		
	}
	
	@Test
	void testInvalidNumber() {
	TelephoneChecker checker = new TelephoneChecker();
		assertThrows(IllegalArgumentException.class, () -> {
			checker.identifySpam(555555L);
		});
		
	}
	
	@Test
	void testSpamAreaCode999() {
		TelephoneChecker checker = new TelephoneChecker();
		assertTrue(checker.identifySpam(9995555555L));
	}
	
	@Test
	void testSpamAreaCode900() {
		TelephoneChecker checker = new TelephoneChecker();
		assertTrue(checker.identifySpam(9005555555L));
	}
	
	@Test
	void testSpamAreaCode888() {
		TelephoneChecker checker = new TelephoneChecker();
		assertTrue(checker.identifySpam(8885555555L));
	}
	
	@Test
	void testSpamAreaCode800() {
		TelephoneChecker checker = new TelephoneChecker();
		assertTrue(checker.identifySpam(8005555555L));
	}
	
	@Test
	void testSpamAreaCode911() {
		TelephoneChecker checker = new TelephoneChecker();
		assertTrue(checker.identifySpam(9115555555L));
	}
	
	@Test
	void testSpamAreaCode411() {
		TelephoneChecker checker = new TelephoneChecker();
		assertTrue(checker.identifySpam(4115555555L));
	}
}