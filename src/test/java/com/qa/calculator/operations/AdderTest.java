package com.qa.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

import com.qa.calculator.operations.Add;

public class AdderTest {

	private MathsOperation adder;

	@Test
	public void test() {
		adder = new Add();
		int expectedValue = 4;
		int actualValue = adder.calculate(2, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
