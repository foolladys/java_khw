package timeattack1109;

public class Person {

	private String name;
	private int[] arrNum;
	
	static int player_num = 1;
	
	Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean game() {
		
		arrNum = new int[3];
		
		for (int i=0; i<arrNum.length; i++) {
			arrNum[i] = (int)Math.random()*3 + 1;
		}
		
		if((arrNum[0] == arrNum[1]) && (arrNum[1] == arrNum[2])) {
			return  true;
		}
		else
			return false; 
	}
	
}
