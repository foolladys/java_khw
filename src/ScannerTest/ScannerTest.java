package ScannerTest;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		System.out.println("가나다");
		Scanner sc = new Scanner(System.in);

		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average(math, science, english));
		System.out.println(me.getGrade(me.average(math, science, english)));

	}
}
