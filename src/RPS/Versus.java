package RPS;
import java.util.Scanner;

public class Versus {
	
	public static void main(String[] args) {
		
		RockPaperScissors PLAY = new RockPaperScissors(); // 가위바위보 객체생성
		Scanner Player = new Scanner(System.in); // 스캐너 객체 생성
		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		String player_Value = Player.nextLine(); // 플레이어 문자열 받아오기
		int player_value_const = 0;
		
		switch(player_Value) {
		case "가위":
			player_value_const = 0;
			break;
		case "바위":
			player_value_const = 1;
			break;
		case "보":
			player_value_const = 2;
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}
		
		
		String cpu_Value; // CPU의 문자열 저장 변수
		int cpu_random_value = (int) (Math.random() * 3);
		// CPU의 값을 랜덤으로 받기 (0~2까지의 값을 랜덤으로 출력한 뒤 나머지 출력)
		
		if(cpu_random_value == 0) {
			cpu_Value ="가위";
		}
		else if(cpu_random_value == 1) {
			cpu_Value ="바위";
		}
		else {
			cpu_Value="보";
		}
		
		System.out.println("플레이어의 입력값 : " + player_Value);
		System.out.println("컴퓨터의 값 : " + cpu_Value);
		
		PLAY.RPS(player_value_const, cpu_random_value);
	}
	
}
