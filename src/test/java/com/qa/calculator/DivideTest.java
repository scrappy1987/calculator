package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DivideTest {

	private Divide divider = new Divide();

	@Test
	public void test() {
		Assert.assertEquals(2, divider.divide(4, 2));
	}

}
