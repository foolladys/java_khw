package timeattack1104;

public class RPSGame {

	int a, b;
	
	RPSGame () {}
	RPSGame (int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void rps_Game(int a, int b) {
		
		if(a == b) {
			System.out.println("비겼습니다.");
		}
		
		else if(a == 0 && b == 1) {
			System.out.println("졌습니다.");
		}
		else if(a == 1 && b == 2) {
			System.out.println("졌습니다.");
		}
		else if(a == 2 && b == 0) {
			System.out.println("졌습니다.");
		}
		else {
			System.out.println("이겼습니다.");
	
		}
	}	
}
