package RPS;

public class RockPaperScissors {

	int Player_Value;
	int CPU_Value;
	
	public void RPS(int Player_Value, int CPU_Value) {
		
		if(Player_Value == CPU_Value) {
			System.out.println("비겼습니다.");
		}
		else if((Player_Value == 0) && (CPU_Value == 1)) {
			System.out.println("졌습니다.");
		}
		else if(Player_Value == 1 && CPU_Value == 2) {
			System.out.println("졌습니다.");
		}
		else if(Player_Value == 2 && CPU_Value == 0) {
			System.out.println("졌습니다.");
		}
		else {
			System.out.println("이겼습니다.");
		}
	}
	
}
