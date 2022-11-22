package ForProgrammers;

public class StringConcat {

	public static void main(String[] args) {

		String st1 = "hello";
		int n = 5;
		
		
		String st2 = st1.substring(0,1);
		
		String new_char = " ";
		for(int i=1; i<=st1.length(); i++) { // 1~5까지 5번 반복
			for(int j=1; j<=n; j++) {	// 1~5 까지 반복
			new_char += st1.substring(i-1, i); // new_char에 st1의 첫번째, 두번째... 마지막 문자까지 n번씩 출력
			}
		}	
		
		
		System.out.println(new_char);
		System.out.println(st2);
	}
}
