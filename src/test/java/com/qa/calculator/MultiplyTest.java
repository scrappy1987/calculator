package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

	private Multiply multiply = new Multiply();

	@Test
	public void test() {
		Assert.assertEquals(16, multiply.multiply(4, 4));
	}

}
