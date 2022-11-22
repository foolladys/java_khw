package java20221107;

public class DoubleArray {

	public static void main(String[] args) {
		int [][] arr = {
				{11}, 
				{22, 33},
				{44, 55, 66}
		};
		
		for(int i=0; i<arr.length; i++) { // arr.length는 3개임
			for(int j=0; j<arr[i].length; j++) { // arr[i].length는 1,2,3개임
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
