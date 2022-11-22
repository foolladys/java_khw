package String;

public class BuildString {

	public static void main(String[] args) {
		
		StringBuilder stbuf = new StringBuilder("123");
		
		stbuf.append(45678);
		System.out.println(stbuf.toString());

		// 123 + 45678 => 12345678
		
		stbuf.delete(0, 2);
		System.out.println(stbuf.toString());
		
		// 12345678에서 [0] [1] 삭제 -> 345678
		
		stbuf.replace(0, 3, "AB");
		System.out.println(stbuf.toString());
		
		// 배열의 [0] [1] [2]를 "AB"로 대체시킴.
		// ->  AB678
		
		stbuf.reverse();
		System.out.println(stbuf.toString());
		
		// 배열을 반대로 돌림
		// -> 876BA
		
		
		String sub = stbuf.substring(2, 4);
		System.out.println(sub);
		// 배열의 [2](3번째 값)부터 처음부터 4번째 값까지 잘라내기
		// 6B
		
		
	}
	
}
