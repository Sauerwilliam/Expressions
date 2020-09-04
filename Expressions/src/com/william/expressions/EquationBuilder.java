package com.william.expressions;

public class EquationBuilder {

	public static Equation buildEquation(String input) {
		
		if(input.indexOf('=') >= 0) {
			
			return new Equation(
					ExpressionBuilder.buildExpression(input.substring(0, input.indexOf('='))), 
					ExpressionBuilder.buildExpression(input.substring(input.indexOf('=') + 1))
					);
			
		}
		
		throw new RuntimeException("You typed an equation without an equal sign, so cowardly I refuse to keep running.");
		
	}
}
