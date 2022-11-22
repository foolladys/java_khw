package String;

public class ImmutableString {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";

		String str3 = new String("Simple String");
		String str4 = new String("Simple String");

		String str = "two";
		
		switch (str) {
		
		case "one":
			System.out.println("문자열 1 입니다");
		case "two":
			System.out.println("문자열 2 입니다.");
			break;
		case "three":
			System.out.println("문자열 3 입니다.");
			break;
		default:
			break;
		}
		
		if (str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");

		if (str3 == str4)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");
	
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
	
		String str5 = str1.concat(str2);
		String str6 = "Simple StringSimple String";
		System.out.println(str5);
		
		
		System.out.println(str5.equals(str6));
		if(str5 == str6)
			System.out.println("같습니다");
		else
			System.out.println("서로 틀립니다");
		
		String str7 = "abcdefg";
		String str9 = str7.substring(2);
		// n부터 끝까지 반환
		System.out.println(str7);
		System.out.println(str9);
		
		String str8 = "abcdefg";
		String str10 = str8.substring(2, 4);
		// 배열의 n ~ m-1까지 반환
		System.out.println(str8);
		System.out.println(str10);
	}

}
