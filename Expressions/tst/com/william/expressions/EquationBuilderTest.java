package com.william.expressions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquationBuilderTest {

	@Test
	void test() {
		assertEquals(
				new Equation(new AddExpression(new ConstantExpression(1),
						new MultiplyExpression(new ConstantExpression(5), 
								new VariableExpression())), new ConstantExpression(7)), EquationBuilder.buildEquation("1 + 5x = 7"));
	}
	
	
}
