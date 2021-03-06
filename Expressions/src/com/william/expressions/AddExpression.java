package com.william.expressions;

public class AddExpression extends Expression {

	@Override
	public String toString() {
		return "AddExpression [left=" + left + ", right=" + right + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
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
		AddExpression other = (AddExpression) obj;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}

	private Expression left;
    private Expression right;

    public AddExpression(Expression newLeft, Expression newRight)
    {
        left = newLeft;
        right = newRight;
    }

    public double evaluate(double x)
    {
        return left.evaluate(x) + right.evaluate(x);
    }

    public void printMe(int depth)
    {
    	System.out.print("-- +\n");
        
        left.print(depth + 1);
        right.print(depth + 1);
    }
    
}
