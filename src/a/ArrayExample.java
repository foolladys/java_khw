package a;

class box {
	private String conts;
	   
	   box(String cont) { this.conts = cont; }
	   public String toString() {
	      return conts;
	   }
	   // toString()함수 주석처리시 주소값이 반환됨

}

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		
		double[] arr2 = new double[7];
		
		float[] arr3;
		arr3 = new float[9];
		
		System.out.println("배열 arr1의 길이: " + arr1.length);
		System.out.println("배열 arr2의 길이: " + arr2.length);
		System.out.println("배열 arr3의 길이: " + arr3.length);
		
		box[] ar = new box[3];
		
		ar[0] = new box("First");
		ar[1] = new box("Second");
		ar[2] = new box("Third");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	
	}
	
}
