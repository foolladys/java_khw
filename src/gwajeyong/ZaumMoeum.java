package gwajeyong;

import java.util.Scanner;

public class ZaumMoeum {

	public static void main(String[] args) {

		System.out.println("문자열을 입력하세요.");
		Scanner s1 = new Scanner(System.in);
		String in_string = s1.nextLine();

		int consonants = 0;
		int vowels = 0;

		for (int i = 0; i <= in_string.length() - 1; i++) {
			if (in_string.charAt(i) == 'a' || in_string.charAt(i) == 'e' || in_string.charAt(i) == 'i'
					|| in_string.charAt(i) == 'o' || in_string.charAt(i) == 'u') {
				vowels++;
			} else
				consonants++;
		}

		System.out.println("모음의 개수" + vowels);
		System.out.println("자음의 개수" + consonants);

	}
}
