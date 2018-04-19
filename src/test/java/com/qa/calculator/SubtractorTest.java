package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SubtractorTest {

	private Subtractor subtract = new Subtractor();

	@Test
	public void test() {
		Assert.assertEquals(4, subtract.subtract(8, 4));
	}

}
