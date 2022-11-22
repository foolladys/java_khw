package a;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		calculate(ar);
		
		System.out.println("배열의 합: "+ArraySum(ar));
	}

	public static int ArraySum(int[] ar) {
		int sum2 = 0;
		for(int e : ar) {
			sum2 += e;
		}
		return sum2;
	}
	
	static void calculate(int[] ar) {
		for (int e : ar) {
			System.out.print(e + " ");
		}
		System.out.println();

		int sum = 0;
		for (int e : ar) {
			sum += e;
		}
		System.out.println("sum : " + sum);
	}

}
