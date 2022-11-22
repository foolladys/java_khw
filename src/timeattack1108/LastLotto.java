package timeattack1108;

public class LastLotto {

	public static void main(String[] args) {
		
		String word = "Hello.java";
		
		int index = word.indexOf(".");
		
		System.out.println(index);
		
		String left = word.substring(0, index);
		String right = word.substring(index, 10);
		
		System.out.println("파일 이름은"+left+"이며, 확장자는"+right+"입니다.");
		
	}
	
}
