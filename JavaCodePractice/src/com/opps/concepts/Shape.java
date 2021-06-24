package com.opps.concepts;

abstract class AbstractShape {

	//Example program for abstraction
	
	String color;
	
	abstract double area();
	public abstract String toString();
	
	AbstractShape(String color)
	{
		System.out.println("Super constructor called");
		this.color = color;
	}
	
	public String getColor() { return color; }
	
}


class Circle extends AbstractShape
{

	 double radius;
	 
	Circle(String color,double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
		 
	}
	

	@Override
	double area() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		 
		return "circle color is " +  super.getColor() + " Circle Area " + area() ;
	}
	
}


class Rectangle extends AbstractShape
{

	double width,height;
	
	Rectangle(String color,double width, double height) {
		
		super(color);
		System.out.println("Rectangle constructor called");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		 
		return  width * height;
	}

	@Override
	public String toString() {
		 
		return "Rectangle color is" + super.getColor() + "Rectangle area is: " + area() ;
		
	}
	
}

public class Shape
{
	
	public static void main(String[] args) {
		  {
			
			
			  AbstractShape s1 = new Circle("Black", 2.2);
			  AbstractShape s2 = new Rectangle("Red", 5, 3);
			
			System.out.println("Circler: " + s1.toString());
			System.out.println("Circler: " + s2.toString());
				
		}
	}
	
}




		


