package java20221115;

import java.math.BigDecimal;
import java.util.Random;

public class Exceptest {

	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("1.6");
		BigDecimal d2 = new BigDecimal("0.1");
		System.out.println("덧셈 결과: " + d1.add(d2));
		System.out.println("곱셈 결과: " + d1.multiply(d2));

		Random rand = new Random();
		for (int i = 0; i < 7; i++) {
			System.out.println(rand.nextInt(1000));
		}
		System.out.println();
		Random rand2 = new Random(12);
		for (int k = 0; k < 7; k++) {
			System.out.println(rand2.nextInt(1000));
		}
	}
}
