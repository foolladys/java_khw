package timeattack1109;
import java.util.Scanner;

public class PlayGame {

	public static void main() {
	
	Scanner s1 = new Scanner(System.in);
	
	System.out.print("1번째 선수 이름>>");
	String name = s1.next();
	Person p1 = new Person(name);
	
	System.out.print("2번째 선수 이름>>");
	name = s1.next();
	Person p2 = new Person(name);
	
	String buffer = s1.nextLine();
	
	while(true) {
		System.out.print("["+p1.getName()+"]:<Enter>");
		buffer = s1.nextLine();
		
		if(p1.game()) {
			System.out.println(p1.getName()+"님이 이겼습니다!");
			break;
		}
		System.out.println("아쉽군요!");
	}
	}
}
