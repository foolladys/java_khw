package timeattack2;

import java.util.HashSet;
import java.util.Set;

public class SetLotto {

	public static void main(String[] args) {
		
		Set<Integer> Lotto = new HashSet<>();
		
		while(Lotto.size() != 6) {
			Lotto.add((int)(Math.random()*46)+1);
		}
		
		for (Integer i : Lotto) {
			System.out.print(i + " ");
		}
		
	}
	
}
