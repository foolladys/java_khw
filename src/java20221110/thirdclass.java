package java20221110;

class Cake {
	public String toString() {
		return "My Birthday Cake";
	}
}

class CheeseCake {
	public String toString() {
		return "My Birthday Cheese Cake";
	}
}

class CircletoString {
	
	private double r;
	
	CircletoString(double r){
		 this.r = r;
	}
	@Override
	public String toString() {
		// return r*r*Math.PI+ " ";
		return String.valueOf(r*r*Math.PI);
	}
	
}


public class thirdclass {

	public static void main(String[] args) {
		Cake c1 = new Cake();
		CheeseCake c2 = new CheeseCake();
		CircletoString c3 = new CircletoString(5);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c3);
	}
}
