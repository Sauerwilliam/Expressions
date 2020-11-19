package com.william.graphing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.william.expressions.Expression;
import com.william.expressions.ExpressionBuilder;

import javax.swing.JFrame;

public class GraphBase extends Canvas {

	private final Expression firstExpression;
	private final Expression secondExpression;
	
	private static final int X_GAP = 5;
	private static final int SIZE_OF_SQUARE = 6;
	private static final int CANVAS_HEIGHT = 480;
	private static final int CANVAS_WIDTH = 600;
	private static final int LINE_WIDTH = CANVAS_WIDTH;
	private static final int LINE_HEIGHT = CANVAS_HEIGHT;
	private static final int NUMBER_OF_COLUMNS = CANVAS_HEIGHT / SIZE_OF_SQUARE;
	private static final int NUMBER_OF_ROWS = CANVAS_WIDTH / SIZE_OF_SQUARE;


	/**
	 * Ignore this and don't change it
	 */
	private static final long serialVersionUID = 5297265833547099085L;

    public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		String input1 = reader.readLine();
        JFrame frame = new JFrame("My Drawing");
        String input2 = reader.readLine();
        Expression exp1 = ExpressionBuilder.buildExpression(input1);
        Expression exp2 = ExpressionBuilder.buildExpression(input2);
        
        Canvas canvas = new GraphBase(exp1, exp2);
        canvas.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        Graphics g = null;
        

    }
    
    
    public GraphBase(Expression a, Expression b) {
    	super();
    	firstExpression = a;
    	secondExpression = b;
    }
    
    public void drawPoint(Graphics g, double xCoordinate, double yCoordinate) {
		g.fillOval((int)convertPointToXCoordinate(xCoordinate),
				(int)(CANVAS_HEIGHT / 2 - 2 - (SIZE_OF_SQUARE * yCoordinate)),
					4, 4);
		
	}

	private double convertPointToXCoordinate(double xCoordinate) {
		return (CANVAS_WIDTH / 2 - 2) + (SIZE_OF_SQUARE * xCoordinate);
	}
	
    

	public void paint(Graphics g) {
    	
    	for (int i = 0; i < NUMBER_OF_ROWS; i+= X_GAP) {
			g.fillRect(SIZE_OF_SQUARE * i, 0, 1, LINE_HEIGHT);
		}
    	

    	for (int j = 0; j < NUMBER_OF_COLUMNS; j+= 1) {
			g.fillRect(0, SIZE_OF_SQUARE * j, LINE_WIDTH, 1);
		 
			
		}
    	
    	g.setColor(Color.RED);
    	//draw the center axes
    	g.fillRect(CANVAS_WIDTH / 2 - 2,0,3, LINE_HEIGHT);    	
    	g.fillRect(0, CANVAS_HEIGHT / 2 -1, LINE_WIDTH, 3);
    	g.setColor(new Color(0, 0, 0));

    	
    	//plot by hand 1,2
    	//plot by hand 4,2
    	//drawPoint(g, 4.2, 5.5);
    	drawPoint(g, 0, 0);
    	for(double i = 0; i < 100; i += .1) {
    		//y = 3x + 2
    		//drawPoint(g, i, -3*(i-2)*(i-2)+3);
    		//h = ih + v*t + 1/2 at^2
    		
    		drawPoint(g, i, firstExpression.evaluate(i));
    		drawPoint(g, i, secondExpression.evaluate(i));
    		if(firstExpression.evaluate(i) == secondExpression.evaluate(i)) {
    			System.out.println("Lines cross at " + i + "," +(int)firstExpression.evaluate(i));
    			
    		}
    	}

    	
    }
	

	

}
