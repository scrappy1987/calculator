package com.qa.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

import com.qa.calculator.operations.Subtractor;

public class SubtractorTest {
	private Subtractor subtract = new Subtractor();

	@Test
	public void test() {
		Assert.assertEquals(4, subtract.subtract(8, 4));
	}

}
