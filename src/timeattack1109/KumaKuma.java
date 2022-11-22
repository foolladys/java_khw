package timeattack1109;

import java.util.Scanner;

interface Calc {
	void setValue(int a, int b);
	int calculate();
}

class Add implements Calc {
	int a, b;

	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		return a+b;
	}
	
}
class Sub implements Calc {
	
	int a,b;
	
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		return a-b;
	}
	
}

class Mul implements Calc {

	int a,b;
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}

class Div implements Calc {
	
	int a, b;
	
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	@Override
	public int calculate() {
		return a/b;
	}
	
}

public class KumaKuma {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("두 수와 연산자를 입력하세요");
		
		int num1 = s1.nextInt();
		int num2 = s1.nextInt();
		char calc = s1.next().charAt(0);
		
		switch(calc) {
		
		case '+':
			Calc c1 = new Add();
			c1.setValue(num1, num2);
			System.out.println("결과값은 " + c1.calculate());
			System.out.println(num1 + " "+num2 + " " + calc);
			break;
		case '-':
			Calc c2 = new Sub();
			c2.setValue(num1,  num2);
			System.out.println("결과값은 " + c2.calculate());
			System.out.println(num1 + " "+num2 + " " + calc);
			break;
		case '*':
			Calc c3 = new Mul();
			c3.setValue(num1, num2);
			System.out.println("결과값은 " + c3.calculate());
			System.out.println(num1 + " "+num2 + " " + calc);
			break;
		case '/':
			Calc c4 = new Div();
			c4.setValue(num1, num2);
			System.out.println("결과값은 " + c4.calculate());
			System.out.println(num1 + " "+num2 + " " + calc);
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
}
