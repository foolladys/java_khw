package timeattack1114;

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
		return a + b;
	}
}

class Sub implements Calc {
	int a, b;

	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		return a - b;
	}

}

class Mul implements Calc {
	int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a * b;
	}
}

class Div implements Calc {
	int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a / b;
	}
}

public class CalcEx {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.print("두 수와 연산자를 입력해주세요.");
		int a = s1.nextInt();
		int b = s1.nextInt();
		char c = s1.next().charAt(0);
		

		switch (c) {

		case '+': {
			Calc c1 = new Add();
			c1.setValue(a, b);
			System.out.println(a + " " + b + " " + c);
			System.out.println("연산 결과는" + c1.calculate());
			break;

		}
		case '-': {
			Calc c2 = new Sub();
			c2.setValue(a, b);
			System.out.println(a + " " + b + " " + c);
			System.out.println("연산 결과는" + c2.calculate());
			break;

		}

		case '*': {
			Calc c3 = new Mul();
			c3.setValue(a, b);
			System.out.println(a + " " + b + " " + c);
			System.out.println("연산 결과는" + c3.calculate());
			break;
		}

		case '/': {
			Calc c4 = new Div();
			c4.setValue(a, b);
			System.out.println(a + " " + b + " " + c);
			System.out.println("연산 결과는" + c4.calculate());
			break;
		}
		default:
			System.out.println("잘못된 입력입니다.");
			return;
		}

	}
}
/*
 * 
 * 철수 학생은 다음 3개의 필드와 메소드를 가진 4개의 클래스 Add, Sub, Mul, Div를 작성하려고 한다
 * 
 * int 타입의 a, b 필드: 2개의 피연산자 void setValue(int a, int b): 피연산자 값을 객체 내에 저장한다.
 * int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다. 곰곰 생각해보니, Add, Sub, Mul, Div
 * 클래스에 공통된 필드와 메소드가 존재하므로 새로운 추상 클래스 Calc를 작성하고 Calc를 상속받아 만들면 되겠다고 생각했다. 그리고
 * main() 메소드에서 다음 실행 사례와 같이 2개의 정수와 연산자를 입력받은 후, Add, Sub, Mul, Div 중에서 이 연산을
 * 처리할 수 있는 객체를 생성하고 setValue() 와 calculate()를 호출하여 그 결과 값을 화면에 출력하면 된다고 생각하였다.
 * 철수처럼 프로그램을 작성하라. 두 정수와 연산자를 입력하시오 >> 5 7 +
 * 
 */