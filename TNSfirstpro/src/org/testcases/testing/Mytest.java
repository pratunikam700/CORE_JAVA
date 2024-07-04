package org.testcases.testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import org.testcases.businesslogic.Operations;

public class Mytest {

	@Test
	public void testAddition()
	{
		int expected=7;
		int actual=Operations.add(2, 5);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void getFactorial() {
		System.out.println("Factorial testing");
		boolean expected=true;
		boolean actual=Operations.getFactorial(7);
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void isPalimdrome() {
		System.out.println("ispalimdrome testing");
		boolean expected=true;
		boolean actual=Operations.isPalimdrome(717);
		Assertions.assertEquals(expected, actual);
	}
	
}
