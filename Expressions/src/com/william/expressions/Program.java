package com.william.expressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        String numbers = reader.readLine();//"4x + 3 + 5";//System.in.();
        Expression input = ExpressionBuilder.buildExpression(numbers);
        


        while(true) {
        	String x = reader.readLine();//"4x + 3 + 5";//System.in.();
            int newX = Integer.parseInt(x);
            System.out.println(input.evaluate(newX));
            
            
            
        	
        }
        
        
        
        
	}

}
