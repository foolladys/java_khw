package timeattack;

public class NumberSum {

	int num;
	int sum;
	
	NumberSum(){
	}
	
	NumberSum(int num){
		this.num = num;
	}
	
	public int Sum(int number) {
	
		for(int i=1; i<=number; i++) {
			sum +=i;
		}
		return sum;
	}

	
}
