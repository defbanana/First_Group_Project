

/**
 * The Shape class is defined here.  
 * @author Jesse and Amanda.
 *
 */

/**
*
* Provides a foundation data type for the description of shapes
*  
*/
public abstract class Shape {
	/**
	 * The x-axis value
	 */
	protected int upperX;
	/**
	 * The y-axis value
	 */
	protected int upperY;
	
	/**
	 * The upper limit for the x-axis value
	 */
	public static final int XMAX = 500;
	
	/**
	 * The upper limit for the y-axis value
	 */
	public static final int YMAX = 500;
	
	/**
	 * Constructor for the shape object
	 * @param x x-axis
	 * @param y y-axis
	 */
	public Shape(int x, int y){
		upperX = x;
		upperY = y;
	}
	
	/**
	 * Provides the x-axis value
	 * @return the value
	 */
	public int getX(){
		return upperX;
	}
	
	/**
	 * Provides the y-axis value
	 * @return the value
	 */
	public int getY(){
		return upperY;
	}
	
	/**
	 * The area value for the object
	 * Should be overloaded by subclass
	 * @return the area value.
	 */
	abstract public double area();
	
}