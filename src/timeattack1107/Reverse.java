package timeattack1107;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("변환할 문자열을 입력하세요.");
		String str1 = s1.nextLine();
		String str2 = "";
		
		for(int i=str1.length(); i>0; i--) {
			str2 += str1.charAt(i-1);
		}
		
		System.out.println(str2);
		
	}
	
}
