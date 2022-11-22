package java20221107;

public class LottoNo {

	public static int[] makeLotto() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
				arr[i] = (int) (Math.random() * 46 + 1);
					}
		}
		
	}
		return arr;
	}	
	public static double sumCircles(Circle[] circles) {
		
		double area = 0;
		for(Circle circle : circles) {
			area += circle.getArea();
		}
		
		return area;
	}

	public static void main(String[] args) {

		for (String arg : args) {
			System.out.println(arg);
		}
		
		int[] LottoProgram = makeLotto();
		
		for(int num : LottoProgram) {
			System.out.print(num + " ");
		}
		System.out.println();

		Circle[] arrCircle = {new Circle(10), new Circle(20)};	
		double sumArea = sumCircles(arrCircle);
		System.out.println("원의 넓이의 합은: " + sumArea);

	}
}

class Circle{
	
	int radius;
	
	Circle () {}
	Circle (int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}