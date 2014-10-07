/**
 * This is a tester file used to see if Shape, Circle and Rectangle are defined 
 * correctly.  If so, this should compile and run.
 * 
 * No need to modify this file at all.  
 * @author guinnc
 *
 */
public class TestCircleAndRectangle {

	/**
	 * Creates some circles and rectangles.  Calls some of their methods.
	 * @param args Ignored.
	 */
	public static void main(String[] args) {

		// let's make some circles and squares
		
		Circle c1 = new Circle(10, 20, 50);
		System.out.println("First  " + c1);
		System.out.println("The first circle has an area of " + c1.area());
		System.out.println();
		
		Circle c2 = new Circle(33, 12);
		System.out.println("Second  " + c2);
		System.out.println("The Second circle has an area of " + c2.area());
		System.out.println("Let's change its radius to 1");
		c2.setRadius(1);
		System.out.println("Now, the second circle has an area of " + c2.area());
		System.out.println();	
		
		
		Rectangle rec1 = new Rectangle(200, 100);
		System.out.println("First  " + rec1);
		System.out.println("The first rectangle has an area of " + rec1.area());
		System.out.println("Let's change its length to 2 and its width to 5");
		rec1.setLength(2);
		rec1.setWidth(5);
		System.out.println("Now, the first rectangle has an area of " + rec1.area());
		System.out.println();	
		
		System.out.println("The maximum value for the x- and y-coordinates are " +
				Shape.XMAX + " and " + Shape.YMAX);
		
		// some random shapes
		Shape [] fiveShapes = new Shape[5];
		for (int i = 0; i < fiveShapes.length; i++) {
			int ranX = (int) (Shape.XMAX * Math.random());
			int ranY = (int) (Shape.YMAX * Math.random());
			double temp = Shape.XMAX * Math.random() / 10;
			double temp2 = Shape.XMAX * Math.random() / 10;
			if (Math.random() < 0.5) { // make a circle
				Circle c = new Circle(ranX, ranY, temp);
				fiveShapes[i] = c;
			} 
			else { // make a square
				Rectangle sq = new Rectangle(ranX, ranY, temp, temp2);
				fiveShapes[i] = sq;
			}
		}

		// print out those random shapes
		for (Shape s : fiveShapes) {
			System.out.println(s + " with area " + s.area());
		}
	}

}
