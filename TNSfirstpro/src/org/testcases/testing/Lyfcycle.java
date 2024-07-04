package org.testcases.testing;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
//@Disabled
@TestInstance(Lifecycle.PER_CLASS)
public class Lyfcycle {
   // @Test
    @RepeatedTest(2)//if we enter 0 or 1 it will give error
	public void testMethodOne(){
		System.out.println("This is testmethod one"+ this);
	}
    @Disabled//disabled the method off all test class
  //  @Test
	public void testMethodTwo() {
		System.out.println("This is testmethod two"+ this);
	}
    @BeforeAll
    public void beforeAlllyfcycleMethod()//life cycle method 
    {
		System.out.println("Before All");
	}
    @BeforeEach
    public void beforeeachyfcycleMethod() {
		System.out.println("Before Each");
	}
    @AfterAll
    public void afterallyfcycleMethod() {
		System.out.println("After All");
	}
    @AfterEach
    public void aftereachfcycleMethod() {
		System.out.println("After each");
	}
}
