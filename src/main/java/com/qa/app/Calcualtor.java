package com.qa.app;

import com.qa.calculator.operations.Adder;
import com.qa.calculator.operations.Divide;
import com.qa.calculator.operations.Multiply;
import com.qa.calculator.operations.Subtractor;

public class Calcualtor {
	private Adder adder;
	private Subtractor subtractor;
	private Multiply multiply;
	private Divide divide;

	public Calcualtor() {
		this.adder = new Adder();
		this.subtractor = new Subtractor();
		this.multiply = new Multiply();
		this.divide = new Divide();
	}

	public int add(int num1, int num2) {
		return adder.add(num1, num2);
	}

	public int subtract(int num1, int num2) {
		return subtractor.subtract(num1, num2);
	}

	public int multiply(int num1, int num2) {
		return multiply.multiply(num1, num2);
	}

	public int divide(int num1, int num2) {
		return divide.divide(num1, num2);
	}
}
