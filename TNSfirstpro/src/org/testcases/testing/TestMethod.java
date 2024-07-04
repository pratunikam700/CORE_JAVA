package org.testcases.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.testcases.businesslogic.Operations;

public class TestMethod {

	@TestFactory
	public DynamicTest testMethod1() {
		
		return DynamicTest.dynamicTest("First dynamic test",()->{Assertions.assertTrue(Operations.getFactorial(5));});
	}
}
