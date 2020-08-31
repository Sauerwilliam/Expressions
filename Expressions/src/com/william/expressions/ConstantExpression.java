package com.william.expressions;

public class ConstantExpression extends Expression {

	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConstantExpression other = (ConstantExpression) obj;
		if (value != other.value)
			return false;
		return true;
	}

	private int value;

     public ConstantExpression(int newValue)
     {
         value = newValue;
     }

     public int evaluate(int x)
     {
         return value;
     }

     public void printMe(int depth)
     {
         System.out.println("-- " + value);
     }

	@Override
	public String toString() {
		return "ConstantExpression [value=" + value + "]";
	}
}
