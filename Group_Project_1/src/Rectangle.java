/**
 * The Rectangle class is defined here.  
 * @author Jesse and Amanda.
 *
 */

/**
* The rectangle object  
*/
class Rectangle extends Shape{
	
	/**
	 * The length of the rectangle
	 */
	private double length;
	
	/**
	 * The width of the rectangle
	 */
	private double width;
	
	/**
	 * The constructor  
	 * @param x - x-axis
	 * @param y - y-axis
	 * @param l - the length
	 * @param w - the width
	 */
	public Rectangle(int x, int y, double l, double w){
		super(x, y);
		length = l;
		width = w;
	}
	
	/**
	 * The constructor overloaded
	 * @param x - x-axis
	 * @param y - y-axis
	 */
	public Rectangle(int x, int y){
		super(x, y);
		length = 0;
		width = 0;
	}
	
	/**
	 * get the length 
	 * @return the value
	 */
	public double getLength(){
		return length;
	}
	
	/**
	 * Set the length value
	 * @param l the length
	 */
	public void setLength(double l){
		length = l;
	}
	
	/**
	 * get the width value
	 * @return the value
	 */
	public double getWidth(){
		return width;
	}
	
	/**
	 * Set the width value
	 * @param w the value
	 */
	public void setWidth(double w){
		width = w;
	}
	
	/**
	 * Override the area calculation for rectangles
	 * @return the area value
	 */
	@Override
	public double area(){
		double area = length * width;
		return area;
	}
	
	/**
	 * Provides a description of the rectangle as a string 
	 * @return the string
	 */
	@Override
	public String toString(){
		return "Rectangle at (" + upperX + ", " + upperY + ") with length = " + length + " and width = " + width;
	}
}