package a;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		String[] str = new String[7];
		str[0] = new String("Java");
		str[1] = new String("System");
		str[2] = new String("Complier");
		str[3] = new String("Park");
		str[4] = new String("Tree");
		str[5] = new String("Dinner");
		str[6] = new String("Brunch Cafe");
		
		int cnum=0;
		for(int i=0; i<str.length; i++) {
			cnum += str[i].length();
		}
		
		System.out.println("총 문자의 수: "+cnum);
		
	}
	
}
