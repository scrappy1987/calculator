package com.qa.app;

import com.qa.calculator.operations.MathsOperation;

public class Calcualtor {
	private MathsOperation mathsOperation;

	public Calcualtor(MathsOperation mathsOperation) {
		this.mathsOperation = mathsOperation;
	}

	public int calculate(int num1, int num2) {
		return mathsOperation.calculate(num1, num2);
	}

}
