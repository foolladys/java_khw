package gwajeyong;

import java.util.Scanner;

class Player {
	private String name; // Player 이름
	private int[] arrNum; // 3개의 수를 저장해둘 배열

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name; // private로 선언된 name을 가져올 함수
	}

	public boolean game() {
		arrNum = new int[3];

		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int) (Math.random() * 3 + 1); // 랜덤으로 3개의 값 넣어줌
		}

		System.out.print(arrNum[0] + " " + arrNum[1] + " " + arrNum[2] + " ");

		if ((arrNum[0] == arrNum[1]) && (arrNum[1] == arrNum[2])) {
			return true; // 세 숫자가 모두 같은지 검사
		}

		return false;
	}

}

public class GambleGameTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("겜블링 게임에 참여할 선수 숫자>>");
		int playerCount = scanner.nextInt();
		Player[] Players = new Player[playerCount];

		for (int i = 0; i < playerCount; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력해주세요 >> ");
			String name = sc.nextLine();
			System.out.println((i + 1) + "번째 선수 이름>>" + name);
			Players[i] = new Player(name);
		}

		String buffer = scanner.nextLine();

		while (true) {
			
			boolean game_win = false;
			for (int j = 0; j < playerCount; j++) {
				System.out.print("[" + Players[j].getName() + "]:<Enter>");
				buffer = scanner.nextLine();

				if (Players[j].game()) {
					System.out.println(Players[j].getName() + "님이 이겼습니다.");
					game_win = true;
					break;
				}
				System.out.println("아쉽군요!");
			}
			if(game_win) {
				break;
			}
		}
	}
}