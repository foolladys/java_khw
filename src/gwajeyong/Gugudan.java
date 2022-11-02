package gwajeyong;

public class Gugudan {

	public static void main(String[] args) {
		PrintGugudan gugudan = new PrintGugudan();

		gugudan.printGugu(10);
		gugudan.printGugu(20);
	}

}

class PrintGugudan {

	int number1;

	PrintGugudan() {
	}

	PrintGugudan(int number1) {
		this.number1 = number1;
	}

	public void printGugu(int dan) {

		for (int i = 1; i <= dan; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}
}