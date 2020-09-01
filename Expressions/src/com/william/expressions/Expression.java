package com.william.expressions;

public abstract class Expression {
	
	public void print() {
		print(0);
	}
	
    public void print(int depth)
    {
        for(int i = 0; i < depth; i++)
        {
            System.out.print("   ");
        }
        System.out.print("|");
        printMe(depth);
    }

    public abstract void printMe(int depth);

    public abstract int evaluate(int x);
}
