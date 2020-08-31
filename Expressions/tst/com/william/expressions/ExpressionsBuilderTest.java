package com.william.expressions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressionsBuilderTest {

	@Test
	void test() {
		assertEquals(new AddExpression( new ConstantExpression(3), new VariableExpression()), ExpressionBuilder.buildExpression("3 + x"));
	}
	
	@Test
	void test5() {
		assertEquals(new ConstantExpression(5), ExpressionBuilder.buildExpression("5"));
	}
	
	@Test
	void testX() {
		assertEquals(new VariableExpression(), ExpressionBuilder.buildExpression("x"));
	}
	
	
	@Test
	void testSimpleAddition() {
		assertEquals(new AddExpression( new ConstantExpression(3), new ConstantExpression(5)), ExpressionBuilder.buildExpression("3 + 5"));		
	}
	
	@Test
	void testSimpleMultiplication() {
		assertEquals(new MultiplyExpression(new ConstantExpression(2), new VariableExpression()), ExpressionBuilder.buildExpression("2x"));
	}
	
	@Test
	void testMultiplication() {
		assertEquals(new AddExpression(new ConstantExpression(5), new MultiplyExpression( new ConstantExpression(3), new VariableExpression())), ExpressionBuilder.buildExpression("5 + 3x"));
	}

}
