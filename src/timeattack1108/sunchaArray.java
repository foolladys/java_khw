package timeattack1108;

public class sunchaArray {

	public static void main(String[] args) {
		int[][] Arr1 = new int[4][4];
		int count = 1;
		
		for(int i =0; i<Arr1.length; i++) {
			for(int j = 0; j<Arr1[i].length; j++) {
				Arr1[i][j] = count++;
				System.out.print(Arr1[i][j] + " ");
			}
			System.out.println();
		}
		
	/*	for(int k =0; k<Arr1.length; k++) {
			for(int l=0; l<Arr1[k].length; l++) {
				System.out.print(Arr1[k][l]+ " ");
			}
			System.out.println();
			}
*/		
		
	}
	
}
