/**
 * The Circle class is defined here.  
 * @author Jesse and Amanda.
 *
 */
class Circle extends Shape{ 
	
	/**
	 * The radius of the circle
	 */
	private double radius;
	
	/**
	 * The Circle constructor with radius.  
	 * @param x x-axis
	 * @param y y-axis
	 * @param r radius
	 */
	public Circle(int x, int y, double r){
		super(x, y);
		radius = r;
	}
	
	/**
	 * The Circle constructor overloaded.  
	 * @param x x-axis
	 * @param y y-axis
	 */
	public Circle(int x, int y){
		super(x, y);
		radius = 0;
	}
	
	/**
	 * Gets the radius  
	 * @return the radius value
	 */
	public double getRadius(){
		return radius;
	}
	
	/**
	 * Set the radius  
	 * @param set the radius value
	 */
	public void setRadius(double r){
		radius = r;
	}
	
	/**
	 * Overrides the area calculation for the circle 
	 * @return the area value
	 */
	@Override
	public double area(){
		double area = Math.PI * radius * radius;
		return area;
	}
	
	/**
	 * Provides a description of the circle as a string 
	 * @return the string
	 */
	@Override
	public String toString(){
		return "Circle at (" + upperX + ", " + upperY + ") with radius = " + radius;
	}

}