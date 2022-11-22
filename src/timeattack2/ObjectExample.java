package timeattack2;

class CircleEx {
	
	int radius;
	
	CircleEx(int radius){
		this.radius = radius;
	}
	public String toString() {
		return String.valueOf(radius*radius*Math.PI);
	}
}

public class ObjectExample {
	
	public static void main(String[] args) {
	CircleEx c1 = new CircleEx(10);
	System.out.println(c1);
	
	}

}
