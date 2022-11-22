package gwajeyong;
import java.util.Scanner;

public class JobClass {

	public static void main(String[] args) {
		System.out.printf("정수는 %d, 실수는 %f, 문자는 %c",12, 24.5, 'A');
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println();
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
	}
	
}
