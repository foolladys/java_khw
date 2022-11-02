
public class StarPrint {

	public static void main(String[] args) {

		PrintStar sp1 = new PrintStar(3);
		sp1.printTriangle(3);
		System.out.println();
		sp1.printReverseTriangle(3);
	}

}

class PrintStar {

	int num1;

	public PrintStar(int num1) {
		this.num1 = num1;
	}

	public void printTriangle(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printReverseTriangle(int number) {
		for (int i = number; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}