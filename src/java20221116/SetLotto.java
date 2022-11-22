package java20221116;

import java.util.HashSet;
import java.util.Set;

public class SetLotto {

	public static void main(String[] args) {

		Set<Integer> Lotto = new HashSet<>();

		// ctrl+shift+o로 자동 import
		
		while(Lotto.size() != 6) {
			Lotto.add((int) (Math.random() * 46+1));
		}
		
		for(Integer i : Lotto)
			System.out.print(i + " ");
	}

}
