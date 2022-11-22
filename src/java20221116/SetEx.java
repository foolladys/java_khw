package java20221116;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Robot");
		set.add("Box");
		set.add("Box");
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		for(String s : set) 
			System.out.print(s + '\t');
		System.out.println();
		
	}
}
