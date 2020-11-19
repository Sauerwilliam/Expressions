package com.william.expressions;

public class ConstantExpression extends Expression {



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

	private double value;

     public ConstantExpression(double newValue)
     {
         value = newValue;
     }
     

     @Override
     public double evaluate(double x)
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
