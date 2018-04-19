package com.qa.calculator.operations;

import org.junit.Assert;
import org.junit.Test;

import com.qa.calculator.operations.Divide;

public class DivideTest {

	private Divide divider = new Divide();

	@Test
	public void test() {
		Assert.assertEquals(2, divider.calculate(4, 2));
	}

}
