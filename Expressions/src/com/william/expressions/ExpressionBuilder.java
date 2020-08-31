package com.william.expressions;

public class ExpressionBuilder {

	public static Expression buildExpression(String input) {
		input = input.trim();
		
		
		if(input.indexOf('+') >= 0) {
			String rightString = input.substring(input.indexOf('+') + 1,input.length());
			String leftString = input.substring(0 ,input.indexOf('+'));
			Expression leftExpression = ExpressionBuilder.buildExpression(leftString);
			Expression rightExpression = ExpressionBuilder.buildExpression(rightString);
			return new AddExpression(leftExpression, rightExpression);

			
			
		}
		if(input.equals("x")) {
			
			return new VariableExpression();
			
			

			
		}
		if(input.indexOf('x') >= 0) {
			String rightString = input.substring(input.indexOf('x'));
			String leftString = input.substring(0 ,input.indexOf('x'));
			Expression leftExpression = ExpressionBuilder.buildExpression(leftString);
			Expression rightExpression = ExpressionBuilder.buildExpression(rightString);
			return new MultiplyExpression(leftExpression, rightExpression);
			
		}
		
		if(input.indexOf('+') == -1) {
			int i = Integer.parseInt(input);
			return new ConstantExpression(i);

			
		}
		
		
		return null;
	}
}
