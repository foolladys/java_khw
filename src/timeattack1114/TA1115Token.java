package timeattack1114;

import java.util.StringTokenizer;

public class TA1115Token {

	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("PM:08:45",":");
		
		while(st1.hasMoreTokens()) {
			System.out.print(st1.nextToken()+ ' ');
		}
	}
}
