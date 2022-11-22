package java20221111;

interface Shape {
	public double getArea();
}

class Rectangle implements Shape {
	int height;
	int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return height*width;
	}
}

class Triangle implements Shape {
	int height;
	int width;
	
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return height*width/2;
	}
}

class Circle implements Shape {
	
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
}

public class Re {
	
	public static void main(String[] args) {
		
		Shape[] shapes = {new Triangle(10, 10), new Rectangle(10, 10), new Circle(10)};
	
		double sumArea = 0;
		for (Shape shapeSum : shapes) {
			sumArea += shapeSum.getArea();
		}
		
		System.out.println(sumArea);
	
	}

}
