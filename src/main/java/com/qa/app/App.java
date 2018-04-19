package com.qa.app;

import com.qa.calculator.operations.Add;
import com.qa.calculator.operations.Divide;
import com.qa.calculator.operations.Multiply;
import com.qa.calculator.operations.Subtract;

public class App {

	public static void main(String[] args) {
		Add add = new Add();
		Subtract subtract = new Subtract();
		Divide divide = new Divide();
		Multiply multiply = new Multiply();

		// add calc
		Calcualtor myAddCalc = new Calcualtor(add);
		int addValue = myAddCalc.calculate(2, 2);
		System.out.println("This is addValue " + addValue);

		// sub calc
		Calcualtor mySubCalc = new Calcualtor(subtract);
		int subtractValue = mySubCalc.calculate(4, 2);
		System.out.println("This is subtractValue " + subtractValue);

		// multiply calc
		Calcualtor myMulCalc = new Calcualtor(multiply);
		int multiplyValue = myMulCalc.calculate(5, 5);
		System.out.println("This is multiplyValue " + multiplyValue);

		Calcualtor myDivCala = new Calcualtor(divide);
		int divideValue = myDivCala.calculate(2, 2);
		System.out.println("This is divideValue " + divideValue);
	}

}
