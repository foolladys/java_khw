
public class SumExample {

	public static void main(String[] args) {
		SumMethod s1 = new SumMethod();

		System.out.println(s1.getSum(6));
	}
}

class SumMethod {

	int sum = 0;

	public int getSum(int number) {

		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
}