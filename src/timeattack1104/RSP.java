package timeattack1104;
import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		
		Scanner player = new Scanner(System.in);
		
		System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
		String player_rsp = player.nextLine();
		int player_value = 0;
		switch(player_rsp) {
		case "가위":
			player_value = 0;
			break;
		case "바위":
			player_value = 1;
			break;
		case "보":
			player_value = 2;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		String cpu_rsp;
		int cpu_value = (int)(Math.random()*3);
		if(cpu_value == 0) {
			cpu_rsp = "가위";
		}
		else if(cpu_value == 1) {
			cpu_rsp = "바위";
		}
		else {
			cpu_rsp ="보";
		}
		
		RPSGame rps = new RPSGame();
		System.out.println("플레이어가 낸 값 : " + player_rsp);
		System.out.println("CPU가 낸 값 : " +cpu_rsp);
		rps.rps_Game(player_value, cpu_value);
		
		
		
	}
	
}
