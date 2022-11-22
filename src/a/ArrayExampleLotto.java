package a;

public class ArrayExampleLotto {

	public static void main(String[] args) {

		int[] Lotto = new int[6];

		for (int i = 0; i <Lotto.length; i++) {
			Lotto[i] = (int) (Math.random() * 45)+1;
			for(int j=0; j<i; j++) {
				if(Lotto[i] == Lotto[j]) {
					i--;
					break;
				}
			}
		}
		//배열 검사 (0,1)부터 (0,5) ~ (5,0) (5,4)까지 검사해야함
		for (int e : Lotto) {
			System.out.print(e+" ");
		}
	}
}
