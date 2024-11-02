package assignment_Inheritance;

public abstract class Shape {

	private String name;
	
	Shape(String name){
		this.name = name;
	}
	
	public abstract double area();
	
	public abstract double perimeter();
	
	public String getName() {
		return name;
	}
	
	public void displayShapeDetails() {
		System.out.println("Shape Name : "+getName());
		System.out.println("Area : "+area());
		System.out.println("Perimeter : "+perimeter());
	}
	
	public static void main(String[] args) {
		Shape circle = new Circle("Circle",5);
		Shape rectangle = new Rectangle("Rectangle",3,3);
		
		circle.displayShapeDetails();
		rectangle.displayShapeDetails();
	}
	
}

class Circle extends Shape{
	
	private double radius;

	Circle(String name,double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public void displayShapeDetails() {
		super.displayShapeDetails();
		System.out.println("Radius : "+radius);
	}
	
}

class Rectangle extends Shape{
	private double width;
	private double height;

	Rectangle(String name,double height,double width) {
		super(name);
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width*height;
	}

	@Override
	public double perimeter() {
		return 2 * (width+height);
	}
	
	public void displayShapeDetails() {
		super.displayShapeDetails();
		System.out.println("Height : "+height);
		System.out.println("Width : "+width);
	}
	
}


