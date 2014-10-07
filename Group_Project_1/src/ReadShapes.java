import java.io.*;
import java.util.*;

/**
 * Read in some Shapes (some are Circles, some are Rectangles), put them in an
 * array (or ArrayList), print them out, and find the biggest rectangle using
 * the method "findBiggestRectangle".
 * 
 * @author Your name here.
 * 
 */
public class ReadShapes {

	/**
	 * Read in the shapes from the file "shapes.txt". Print them out. Find the
	 * circle with the largest radius.
	 * 
	 * @param args
	 *            Ignored
	 */
	public static void main(String[] args) {

		// read in the data file "shapes.txt"

		// once it is read in, you should be able to print it out
		System.out.println("Here is the list of shapes: ");
		// put some code here to print out the list

		System.out.print("\nThe rectangle with the greatest area is ");
		Rectangle biggest = findBiggestRectangle(list);
		System.out.println(biggest);
		System.out.println();

	} // end main method

	/**
	 * Iterates through the list of shapes and returns the rectangle with the
	 * largest area.
	 * 
	 * @return The Rectangle with the largest area.
	 */
	public static Rectangle findBiggestRectangle(/*
												 * how do you pass in the
												 * parameter?
												 */) {

		Rectangle biggest = null;
		// put some code here to find the biggest in area

		return biggest;
	} // end of method findBiggestRectangle

} // end of class ReadShapes
