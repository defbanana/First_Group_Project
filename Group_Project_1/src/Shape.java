

/**
 * The Shape class is defined here.  
 * @author Your name here.
 *
 */

public abstract class Shape {
	protected int upperX;
	protected int upperY;
	public static int XMAX =  500; //add frozen?
	public static int YMAX = 500;
	
	public Shape(int x, int y){
		upperX = x;
		upperY = y;
	}
	public int getX(){
		return upperX;
	}
	public int getY(){
		return upperY;
	}
	abstract public double area();
	
}