package java20221114;

class Circle {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return radius * radius * Math.PI + "";
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Object obj = new Circle(10);
		System.out.println(obj);
	}
}
