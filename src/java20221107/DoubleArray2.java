package java20221107;

public class DoubleArray2 {

	public static void main(String[] args) {
		
		int[][] arr1 = new int [4][4];
		int temp = 1;
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++)
			{
				arr1[i][j] = temp;
				System.out.print(arr1[i][j] + " ");
				temp++;
			}
			System.out.println();
		}
	}
	
}
