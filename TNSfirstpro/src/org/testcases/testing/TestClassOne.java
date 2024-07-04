package org.testcases.testing;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.testcases.businesslogic.Operations;

public class TestClassOne {

	@ParameterizedTest
	@CsvSource({"4,24","5,120","0,1","-4,-1"})
	public void testForFactorial(int n, long expected) {
		boolean actual= Operations.getFactorial(n);
		Assertions.assertEquals(expected, actual);
	}
	@ParameterizedTest
	@ValueSource(ints= {5,9,13,20})
	public void testForPrimeNumber(int n) {
		assertTrue(Operations.isPalimdrome(n));
	}
}
