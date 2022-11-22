package ForProgrammers;

public class ExtractNumber {

	public static void main(String[] args) {
	
			String answer = "";
			int result = 0;
			String my_string = "aAb1B2cC34oOp";
			
	        for(int i=0; i<my_string.length(); i++){
	           
	        	if(my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57)
	        	answer += my_string.charAt(i);
	        }
	        String[] arr1 = answer.split("");
	        
	        for(int j=0; j<arr1.length; j++){
	            result += Integer.valueOf(arr1[j]);
	        }
	        
	        
	        System.out.println(answer);
	        System.out.println(result);
	}
}