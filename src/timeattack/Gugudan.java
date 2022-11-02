package timeattack;

public class Gugudan {

	int dan;
	
	Gugudan() {}
	Gugudan(int dan){
		this.dan = dan;
	}
	
	void show(int dan) {

		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}
}
