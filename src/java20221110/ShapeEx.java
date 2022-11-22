package java20221110;

class Shape {
		public double getArea() {return 0;}
}
class Circle extends Shape {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}
}

class Triangle extends Shape {
	int height;
	int width;
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public double getArea() {
		return height*width/2.0;
	}
}
class Rectangle extends Shape {
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

public class ShapeEx {

	public static void main(String[] args){
		
		double sumArea=0;
	
		Shape[] Shape = {new Rectangle(10, 10), new Triangle(10, 10), new Circle(10)};
	
		for (Shape s : Shape) {
			sumArea += s.getArea();
		}
	
		System.out.println(sumArea);
	}
}
