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


		ArrayList<CommandStruct> listOfOrders = new ArrayList<CommandStruct>();
				
		// read in the data file "shapes.txt"
		BufferedReader reader = new BufferedReader(new FileReader("shapes.txt"));
		String line = null;
		
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split("\\s");
			CommandStruct tempOrder = new CommandStruct();
			
			for (String part : parts) {
			    try
			    {
			    	tempOrder.values.add(Double.parseDouble(part));
			    }
			    catch(NumberFormatException e)
			    {
					tempOrder.setCommand(part);
			    }
			}
			
			listOfOrders.add(tempOrder);    
		}
		
		// once it is read in, you should be able to print it out
		System.out.println("Here is the list of shapes: ");
		// Some code here to print out the list		
		for (CommandStruct element : listOfOrders){
			System.out.println(element.getCommand() + element.printValues());
		}

		System.out.print("\nThe rectangle with the greatest area is ");
		Rectangle biggest = findBiggestRectangle(listOfOrders);
		System.out.println(biggest);
		System.out.println();

	} // end main method

	/**
	 * Iterates through the list of shapes and returns the rectangle with the
	 * largest area.
	 * 
	 * @return The Rectangle with the largest area.
	 */
	public static Rectangle findBiggestRectangle(ArrayList<CommandStruct> listOfOrders) {

		Rectangle biggest = null;
		// put some code here to find the biggest in area
		double largestArea = 0;
		
		for (CommandStruct tempOrder : listOfOrders){
			
			String command = tempOrder.getCommand();
			if (command.compareTo("RECTANGLE") == 0){
				int x = (int)Math.round(tempOrder.values.get(0));
				int y = (int)Math.round(tempOrder.values.get(1));
				double l = tempOrder.values.get(2);
				double w = tempOrder.values.get(3);
				
				Rectangle tempRectangle = new Rectangle(x, y, l, w);
				
				// not worried about a negative area
				if (tempRectangle.area() > largestArea){
					biggest = tempRectangle;
				}
			}
		}

		return biggest;
	} // end of method findBiggestRectangle

} // end of class ReadShapes
