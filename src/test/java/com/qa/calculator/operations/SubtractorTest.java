package com.qa.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

import com.qa.calculator.operations.Subtract;

public class SubtractorTest {
	private Subtract subtract = new Subtract();

	@Test
	public void test() {
		Assert.assertEquals(4, subtract.calculate(8, 4));
	}

}
