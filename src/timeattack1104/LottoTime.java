package timeattack1104;

public class LottoTime {

	public static void main(String[] args) {
		
		int LottoArr[] = new int[6]; 
		
		for(int i=0; i<6; i++) {
			LottoArr[i] = (int)(Math.random()*45)+1;
		
			for(int j=0; j<i; j++) {
				if(LottoArr[i] == LottoArr[j]) {
				i--;
				break;
				}
			}
		
		}
		
		
		for(int e : LottoArr) {
			System.out.print(e+ " ");
		}
	}
	
}
