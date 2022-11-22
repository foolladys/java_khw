package java20221109;

class Shape {
	public double getArea() {
		return 0.0;
	}
}

class Cake {
	public void yummy() {
		System.out.println("서윗");
	};
}

class CheeseCake extends Cake {
	@Override
	public void yummy() {
		System.out.println("서윗 서윗 치즈");
	};
}

public class CakeInfo {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		
		c1.yummy();
		c2.yummy();
	
		double sumArea = 0;
		Circle circle = new Circle(10);
		Triangle triangle = new Triangle(10, 10);
		
		sumArea = circle.getArea() + triangle.getArea();
		
		System.out.println("고객님 넓이는 "+sumArea+" 입니다.");
	
		Shape[] shape = {new Circle(10),new Triangle(10, 10)};
		
		for (Shape s : shape) {
			sumArea += s.getArea();
		}
		
		System.out.println("고객님 넓이는 "+sumArea +" 입니다");
	
	}

}


class Circle extends Shape {
	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	@Override
	public double getArea() {
		return r*r*Math.PI;
	}
}


class Triangle extends Shape {
	private int width, height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width*height/2.0;
	}
}