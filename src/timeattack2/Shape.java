package timeattack2;

class Sha {
	double getArea() {
		return 0;
	}
}

class Circle extends Sha {
	
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	double getArea() {
		return radius*radius*Math.PI;
	}
}

class Rect extends Sha {
	
	int width;
	int height;
	Rect(int width, int height){
		this.width=  width;
		this.height = height;
	}
	
	double getArea() {
		return width*height;
	}
}

class Tria extends Sha {
	int width;
	int height;
	
	Tria(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width*height*0.5;
	}
}

public class Shape {

	public static void main(String[] args) {
		Sha[] shapes = {new Circle(10), new Rect(10, 10), new Tria(10, 10)};
	
		double sumArea = 0;
		for (Sha sha : shapes) {
			sumArea += sha.getArea();
		}
		
		System.out.println(sumArea);
	}
}
