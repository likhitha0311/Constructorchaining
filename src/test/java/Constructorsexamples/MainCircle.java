package Constructorsexamples;

public class MainCircle {

	public static void main(String[] args) 
	{
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.width= " + cylinder.getwidth());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());
		
		
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());

	}

}

class Circle{
	
	private double radius;

	public Circle(double radius) 
	{
		if(radius < 0)
			{this.radius = 0;}
		else{this.radius = radius;}
		
	}
	
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
}

class Cylinder extends Circle{
	private double width;
	
	
	public Cylinder(double radius, double width) {
		super(radius);
		
		if(width < 0)
		{this.width = 0;}
	else{this.width = width;}
		
	}

	public double getwidth()
	{
		return width;
	}
	
	public double getVolume()
	{
		return width*getArea();
	}
	
	
}

class Rectangle{
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		if(width < 0)
		{this.width = 0;}
	else{this.width = width;}
		
		if(length < 0)
		{this.length = 0;}
	else{this.length = length;}
		
		
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	public double getArea()
	{
		return width*length;
	}
	
	
}

class Cuboid extends Rectangle
{
	private double height;

	public Cuboid(double height,double width, double length) {
		super(width, length);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	
	public double getVolume()
	{
		return height*getArea();
	}
	
	
}
