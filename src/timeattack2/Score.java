// commit test

package timeattack2;

import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {

	System.out.println("국어 성적을 입력해주세요");
	Scanner s1 = new Scanner(System.in);
	int kor_value = s1.nextInt();
	
	System.out.println("영어 성적을 입력해주세요");
	Scanner s2 = new Scanner(System.in);
	int eng_value = s2.nextInt();
	
	System.out.println("수학 성적을 입력해주세요");
	Scanner s3 = new Scanner(System.in);
	int math_value = s3.nextInt();
	
	Grade g1 = new Grade();
	g1.num1 = kor_value;
	g1.num2 = eng_value;
	g1.num3 = math_value;
	
	System.out.println("당신의 성적 평균은 " + g1.avg(g1.num1, g1.num2, g1.num3)+ "점 입니다.");
	
	System.out.println("당신의 성적 등급은 " +g1.avg_grade(g1.avg(g1.num1, g1.num2, g1.num3))+ "입니다.");
	
	
	}
}
