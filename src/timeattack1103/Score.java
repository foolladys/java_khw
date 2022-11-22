package timeattack1103;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		int math;
		int science;
		int english;

		System.out.println("수학 점수를 입력하세요");
		Scanner s1 = new Scanner(System.in);
		math = s1.nextInt();

		System.out.println("과학 점수를 입력하세요");
		Scanner s2 = new Scanner(System.in);
		science = s2.nextInt();

		System.out.println("영어 점수를 입력하세요");
		Scanner s3 = new Scanner(System.in);
		english = s3.nextInt();

		Grade student1 = new Grade(math, science, english);

		System.out.println("당신의 평균 점수는 " + student1.average(math, science, english) + " 점 입니다.");
		System.out.println("당신의 성적은 " + student1.getGrade(student1.average(math, science, english)) + "입니다.");

	}

}
