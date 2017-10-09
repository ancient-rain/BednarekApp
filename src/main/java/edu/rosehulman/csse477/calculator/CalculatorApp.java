package edu.rosehulman.csse477.calculator;

import edu.rosehulman.csse477.calculator.api.IOp;
import edu.rosehulman.csse477.calculator.bednartd.Multiply;
import edu.rosehulman.csse477.calculator.impl.Add;
import edu.rosehulman.csse477.calculator.yorkww.Subtract;

public class CalculatorApp {

	public static void main(String[] args) {
		IOp add = new Add();
		IOp multiply = new Multiply();
		IOp subtract = new Subtract();
		
		System.out.println("Calculator Application");
		System.out.format("(%f + %f) * (%f - %f - %f) = %f%n", 2f, 3f, 4f, 5f, 6f,
				multiply.execute(add.execute(2f, 3f), subtract.execute(4f, 5f, 6f)));
	}
}
