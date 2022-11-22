package gwajeyong;

import java.util.Scanner;

public class UpDownGame {

	static int play_count = 10;
	
	public static void main(String[] args) {

		gameStart();
		
		int random_Number = (int) (Math.random() * 100) + 1;

		while (play_count > 0) { // play_count가 0이 될때까지 감소하면서 반복
			
			gamePlay(insertNumber(), random_Number);
		}
		System.out.println("게임에서 졌습니다.");
		System.out.println("랜덤 숫자는"+random_Number+"였습니다.");
	}

	public static int insertNumber() { // 숫자를 입력받는 함수
		Scanner insert_number = new Scanner(System.in);
		System.out.println("1~100 사이의 숫자를 입력해주세요.");
		return insert_number.nextInt();
	}
	
	public static void gameStart() { // 게임 시작, 종료 함수
		System.out.println("게임시작 : 1");
		System.out.println("게임종료 : 2");
		
		Scanner play_Onoff = new Scanner(System.in);
		
		int game_startnum =  play_Onoff.nextInt();
		
		if (game_startnum == 1) {
			System.out.println(">>");
			System.out.println("게임을 시작합니다.");
			
		} else if (game_startnum == 2) {
			System.out.println("게임을 종료합니다.");
			play_Onoff.close();
			
		} else {
			System.out.println("잘못된 입력입니다.");
			play_Onoff.close();
		}
		
	}

	public static void gamePlay(int inserted_Number, int random_Number) {
		if (inserted_Number == random_Number) { // 같을때
			System.out.println("숫자가 일치합니다. 축하합니다.");
			System.out.println("게임을 재시작합니다.");
			play_count = 10;					// 플레이카운트 10 초기화
			gameStart();			                // 게임 재시작
		} else if (inserted_Number > random_Number) {
			System.out.println("입력한 숫자가 정답보다 큽니다." + (play_count--) + "번 남았습니다.");
			return;
		} else if (inserted_Number < random_Number) {
			System.out.println("입력한 숫자가 정답보다 작습니다." + (play_count--) + "번 남았습니다.");
			return;
		} else {
			System.out.println("게임이 잘못된듯 합니다.");
		}
	}

}
