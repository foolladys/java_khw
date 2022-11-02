package a;

public class Circletest {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		// 인스턴스 생성
		circle.radius = 10;
		System.out.println(circle.getArea());
		
		Circle circle2 = new Circle();
		
		circle2.radius = 5;
		System.out.println(circle2.getArea());
		
		Circle circle3 = new Circle();
		
		circle3.radius = 7;
		System.out.println(circle3.getArea());
		
	}
}
