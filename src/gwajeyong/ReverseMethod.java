package gwajeyong;

public class ReverseMethod {

	public static void main(String[] args) {
		
		//StringBuilder str1 = new StringBuilder("abcde");
		//str1.reverse();
		//System.out.println(str1);
	
		
		String str = "abcde";
		int str_leng = str.length();
		for(int i=str_leng-1; i>=0; i--) { // 4부터 0까지 반복 4,3,2,1,0
			char out=' ';
			out = str.charAt(str_leng-1);
			System.out.print(out); // charAt 함수로 4,3,2,1,0번째 값을 출력
			str_leng--;
		}
	}
}
