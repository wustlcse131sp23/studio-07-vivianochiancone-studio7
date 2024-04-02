package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle 
{

	private double length;
	private double width;
	
	public Rectangle(double l, double w)
	{
		this.length = l;
		this.width = w;
	}
	
	public double area()		// we are not using public static bc static methods are used when a method does not need to be called on an instance of the class. Here, all of these methods must work on the Rectangle instances (objects) of the Rectangle class
	{
		return this.length*this.width;
	}
	
	public double perimeter()   
	{
		return 2*(this.length + this.width);
	}
	
	public boolean compareSize(Rectangle other)
	{
		return (this.area() < other.area());
	}
	
	public boolean isSquare()
	{
		return (this.length == this.width);
	}
	
	public void draw(double x, double y)
	{
		StdDraw.rectangle(x, y, (1.0/2)*(this.width), (1.0/2)*(this.length));
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(0.25,0.25);
		Rectangle r2 = new Rectangle(0.25,0.5);
		
		System.out.println(r1.isSquare());
		r2.draw(0.5,0.5);

	}

}
