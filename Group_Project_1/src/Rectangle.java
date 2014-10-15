/**
 * The Rectangle class is defined here.  
 * @author Your name here.
 *
 */

class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(int x, int y, double l, double w){
		super(x, y);
		length = l;
		width = w;
	}
	public Rectangle(int x, int y){
		super(x, y);
		length = 0;
		width = 0;
	}
	public double getLength(){
		return length;
	}
	public void setLength(double l){
		length = l;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double w){
		width = w;
	}
	@Override
	public double area(){
		double area = length * width;
		return area;
	}
	@Override
	public String toString(){
		return "Rectangle at (" + upperX + ", " + upperY + ") with legnth = " + length + " and width = " + width;
	}
}