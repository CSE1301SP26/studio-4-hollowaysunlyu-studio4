package studio4;

import java.util.Scanner;
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5,0.5,0.3,0.2);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.36,0.5,0.03,0.2);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.03);
	}
}