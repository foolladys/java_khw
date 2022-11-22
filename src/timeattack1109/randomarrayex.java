package timeattack1109;

public class randomarrayex {

	public static void main(String[] args) {
		int[][] Arr = new int[5][3];
		
		for(int i=0; i<Arr.length; i++) {
			for(int j=0; j<Arr[i].length; j++) {
				Arr[i][j] = (char)(Math.random()*26+65);
				System.out.print(((char)Arr[i][j]) + " ");
			}
			System.out.println();
		}
		
	}
	
}
