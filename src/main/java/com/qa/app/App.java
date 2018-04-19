package com.qa.app;

public class App {

	public static void main(String[] args) {
		Calcualtor myCalc = new Calcualtor();
		int addValue = myCalc.add(2, 2);
		System.out.println("This is addValue " + addValue);
		int subtractValue = myCalc.subtract(4, 2);
		System.out.println("This is subtractValue " + subtractValue);
		int multiplyValue = myCalc.multiply(5, 5);
		System.out.println("This is multiplyValue " + multiplyValue);
		int divideValue = myCalc.divide(2, 2);
		System.out.println("This is divideValue " + divideValue);
	}

}
