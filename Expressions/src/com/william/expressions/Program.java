package com.william.expressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		
		while(true) {
	        
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        String numbers = reader.readLine();//"4x + 3 + 5";//System.in.();
        Equation input = EquationBuilder.buildEquation(numbers);
        
        
        	//String x = reader.readLine();//"4x + 3 + 5";//System.in.();
        	//int newX = Integer.parseInt(reader.readLine());
            //System.out.println(input.isValid(newX));
            boolean solutions = false;
        	for(int i = -1000; i < 1000; i++) {
            	
            	if(input.isValid(i)) {
            		solutions = true;
            		System.out.println("" + i + " is a solution");
            	}
            }
        	if(!solutions) {
        		System.out.println("No whole number solutions between -1000 and 999.");
        	}
        }
//        while(true) {
//        	String x = reader.readLine();//"4x + 3 + 5";//System.in.();
//            int newX = Integer.parseInt(x);
//            System.out.println(input.evaluate(newX));
//            
//            
//            
//        	
//        }
        
        
        
        
	}

}
