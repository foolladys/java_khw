package String;

public class CompString2 {

	public static void main(String[] args) {
		
		System.out.println("funny" + "camp");
		
		System.out.println("funny".concat("camp")); // 으로 자동 변환
		
		String str = "funny";
		
		str += "camp"; // str = str + "camp";
		str = str.concat("gogo");
		System.out.println(str);
	
		String str2 = "age: " + 17;
		
		// "age: ".concat(String.valueOf(17);과 같다.
		System.out.println(str2);
		
	}
	
}
