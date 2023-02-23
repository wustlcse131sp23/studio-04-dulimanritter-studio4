package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color pink = new Color(255, 0, 100);
		StdDraw.setPenColor(pink);
		StdDraw.filledRectangle(0.5,0.5,0.4,0.25);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		
		StdDraw.setPenColor(Color.BLUE);
		double [] x = {0.5, 0.1, 0.2, 0.3};
		double [] y = {0.3, 0.4, 0.1, 0.6};
		StdDraw.filledPolygon(x, y);
		
		StdDraw.setPenColor(Color.CYAN);
		double [] z = {0.1, 0.3, 0.4, 0.4};
		double [] q = {0.5, 0.4, 0.2, 0.5};
		StdDraw.filledPolygon(z, q); 
	}
	
}