package com.vijitha.jbehave.simple.calc;

/**
 * Simple class to add and subtract two numbers.
 * 
 * @author Vijitha Epa
 * 
 */
public class Calculator {

	private int result;

	/**
	 * Simply add two numbers and return the result.
	 */
	public void addNumbers(int x, int y) {
		result = x + y;
	}

	/**
	 * Simply subtract two numbers and return the result.
	 */
	public void subtractNumbers(int x, int y) {
		result = x - y;
	}

	public int getResult() {
		return result;
	}

}
