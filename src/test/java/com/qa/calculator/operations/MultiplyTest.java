package com.qa.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

import com.qa.calculator.operations.Multiply;

public class MultiplyTest {

	private Multiply multiply = new Multiply();

	@Test
	public void test() {
		Assert.assertEquals(16, multiply.calculate(4, 4));
	}

}
