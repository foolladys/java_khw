package java20221121;

import java.net.InetAddress;
import java.util.Scanner;

public class NetworkEx {

	public static void main(String[] args) {
		new InetAddressEx();
	}
	
}

class InetAddressEx {
	Scanner scanner;
	public InetAddressEx() {
		System.out.println("Host 이름을 입력해주세요");
		
		scanner = new Scanner(System.in);
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			
			System.out.println("Computer NAME : " + inetAddress.getHostName());
			System.out.println("Computer IP : " + inetAddress.getHostAddress());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}