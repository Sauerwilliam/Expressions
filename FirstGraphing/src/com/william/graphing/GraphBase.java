package com.william.graphing;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphBase extends Canvas {

	/**
	 * Ignore this and don't change it
	 */
	private static final long serialVersionUID = 5297265833547099085L;

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new GraphBase();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        //g.fillOval(100, 100, 200, 200);
        g.fill3DRect(100, 100, 200, 200, false);
    }
	
	
}
