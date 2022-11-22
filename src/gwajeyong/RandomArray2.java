package gwajeyong;
import java.util.Scanner;

public class RandomArray2 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("행의 개수입니다. 반드시 1~10 중의 정수중 하나를 입력하세요.");
		int row = s1.nextInt();
		
		if(row > 10 || row<0) {
			System.out.println("잘못된 행수의 입력입니다.");
		}
		
		System.out.println("열의 개수입니다. 반드시 1~10 중의 정수중 하나를 입력하세요.");
		int col = s2.nextInt();
		
		if(col > 10 || col<0) {
			System.out.println("잘못된 열수의 입력입니다.");
		}
		
		int[][] arr = new int[row][col];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[row-1].length; j++) {
				arr[i][j] = (int)(Math.random()*26)+65;
			}
		}
		
		for(int k=0; k<arr.length; k++) {
			for(int l=0; l<arr[row-1].length; l++) {
				System.out.print((char)arr[k][l] +" ");
			}
			System.out.println();
		}
		
	}
}

/*

## 9. 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)

실행화면
==================================
행 크기 : 5
열 크기 : 4
T P M B
U I H S
Q M B H
H B I X
G F X I


*/