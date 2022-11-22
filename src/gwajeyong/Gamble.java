package gwajeyong;

import java.util.Scanner;

public class Gamble {

	public static void main(String[] args) {

		Person[] players = new Person[2];
		Person p1 = new Person("");
		Person p2 = new Person("");

		System.out.println("첫번째 플레이어 이름을 입력해주세요.");
		Scanner s1 = new Scanner(System.in);
		p1.name = s1.nextLine();
		System.out.println("두번째 플레이어 이름을 입력해주세요");
		Scanner s2 = new Scanner(System.in);
		p2.name = s2.nextLine();
		System.out.println("첫번째 선수 이름>> " + p1.name);
		System.out.println("두번째 선수 이름>> " + p2.name);

		while (true) {
			gambleGame(p1);
			gambleGame(p2);
			if (p1.win == true || p2.win == true) {
				break;
			}
		}
	}

	public static void gambleGame(Person player) {
		int[] Arr = new int[3];

		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = (int) (Math.random() * 3) + 1;
		}
		if (Arr[0] == Arr[1] && Arr[1] == Arr[2] && Arr[0] == Arr[2]) { // 
			player.win = true;
			System.out.println("[" + player.name + "]:");
			for (int i : Arr) {
				System.out.print(i + " ");
			}
			System.out.print(player.name + "님이 이겼습니다!");
		} else {
			player.win = false;
			System.out.println("[" + player.name + "]:");
			for (int i : Arr) {
				System.out.print(i + " ");
			}
			System.out.println(" 아쉽군요!");
		}

	}
}
