package java20221111;

interface ICalculatorInterface{
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int multi(int num1, int num2);
	int div(int num1, int num2);
}


class Calculator implements ICalculatorInterface{

	@Override
	public int add(int num1, int num2) { // 덧셈
		return num1+num2;
	}
	@Override
	public int sub(int num1, int num2) { // 뺄셈
		return num1-num2;
	}
	@Override
	public int multi(int num1, int num2) { // 곱셈
		return num1*num2;
	}
	@Override
	public int div(int num1, int num2) { // 나눗셈
		return num1/num2;
	}
}

public class ICalculator {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		System.out.println(c1.add(2,5));
		System.out.println(c1.div(20, 5));
		System.out.println(c1.multi(4, 5));
		System.out.println(c1.sub(3, 5));
	}
}
