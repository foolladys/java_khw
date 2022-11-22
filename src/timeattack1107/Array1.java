package timeattack1107;

public class Array1 {

	// 아래의 배열들의 총 문자 갯수를 계산하도록 하시오.
	public static void main(String[] args) {

		String[] sr = new String[7];

		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Park");
		sr[4] = new String("Tree");
		sr[5] = new String("Dinner");
		sr[6] = new String("Brunch Cafe");

		int sum = 0;
		
		for(int i=0; i<sr.length; i++) {
			sum += sr[i].length();
		}
		
		System.out.println("총 합은 :  "+sum);
		
	}
}
