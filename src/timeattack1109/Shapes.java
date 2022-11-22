package timeattack1109;

class Shape {
	double getArea() {return 0;}
}

class Circle extends Shape {

	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius *Math.PI;
	}
}

class Triangle extends Shape {

	int width;
	int height;

	Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height / 2.0;
	}
}

class RectAngle extends Shape {

	int width;
	int height;

	RectAngle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}
}

public class Shapes {

	public static void main(String[] args) {

		double sumArea=0;
		Shape[] shape = { new Circle(10), new Triangle(10, 10), new RectAngle(10, 10) };

		for (Shape s : shape) {
			sumArea += s.getArea();
		}
		System.out.println(sumArea);

	}
}
