package com.william.expressions;

public class VariableExpression extends Expression {

	
	 public int evaluate(int x)
     {
		 
         return x;
     }
	 
	 
     public void printMe(int depth)
     {

    	 System.out.println("-- x");
     }
     
     public boolean equals(Object other) {
    	 return other instanceof VariableExpression;
     }


	@Override
	public double evaluate(double x) {
		// TODO Auto-generated method stub
		return x;
	}


	
	
     

}
