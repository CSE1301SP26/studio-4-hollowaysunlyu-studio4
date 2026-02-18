package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = 0;
		double y = 0;
		double r = 0;
		double z = 0;
		StdDraw.setPenColor(red,green,blue);

		if (shape.equals("triangle")){
			
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double [] xarray = {x1, x2, x3};
			double [] yarray = {y1, y2, y3};
			if (filled){
			StdDraw.filledPolygon(xarray,yarray);
			} else{
			StdDraw.polygon(xarray,yarray);
			}
		} else{
			x = in.nextDouble();
			y = in.nextDouble();
			if (in.hasNextDouble()){
			r = in.nextDouble();
			}
			if (in.hasNextDouble()){
			z = in.nextDouble();
			}
		}
		
		if (filled){
			
			if (shape.equals("rectangle")){
				StdDraw.filledRectangle(x,y,r,z);
			}
			else if (shape.equals("ellipse")){
				StdDraw.filledEllipse(x, y, r, z);
			}
			else if (shape.equals("square")){
				StdDraw.filledSquare(x, y, r);
			}
			else if (shape.equals("circle")){
				StdDraw.filledCircle(x, y, r);
			}
		}
		else{
			if (shape.equals("rectangle")){
				StdDraw.rectangle(x,y,r,z);
			}
			else if (shape.equals("ellipse")){
				StdDraw.ellipse(x, y, r, z);
			}
			else if (shape.equals("square")){
				StdDraw.square(x, y, r);
			}
			else if (shape.equals("circle")){
				StdDraw.circle(x, y, r);
			}
		}
	}
}
