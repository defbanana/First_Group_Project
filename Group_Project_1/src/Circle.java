/**
 * The Circle class is defined here.  
 * @author Your name here.
 *
 */

class Circle extends Shape{ 
	private double radius;
	
	public Circle(int x, int y, double r){
		super(x, y);
		radius = r;
	}
	public Circle(int x, int y){
		super(x, y);
		radius = 0;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double r){
		radius = r;
	}
	public double area(){
		double area = Math.PI * radius * radius;
		return area;
	}
	public String toString(){
		return "Circle at (" + upperX + ", " + upperY + ") with radius = " + radius;
	}

}