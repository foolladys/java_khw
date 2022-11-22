package java20221111;

abstract class ACalculator { // 하나 이상의 추상 메소드가 있다면 추상 클래스로 선언해 주어야한다.
	protected int num1, num2;

	private static final int COUNT = 0;
	
	public ACalculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	private void show () {
		System.out.println("AAA");
	}
	
	public abstract int add();
}

class AbstractCalculator extends ACalculator {

	public AbstractCalculator(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int add() {
		return num1 + num2;
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		AbstractCalculator abstractCalculator = new AbstractCalculator(1, 1);
	
		abstractCalculator.add();
	}
}
