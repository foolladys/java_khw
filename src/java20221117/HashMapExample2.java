package java20221117;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(45,  "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		Set<Integer> ks = map.keySet();
		
		for(Integer n : ks)
			System.out.println(n.toString() + '\t');
		System.out.println();
		
		for(Integer n : ks)
			System.out.println(map.get(n).toString() + '\t');
		System.out.println();
		
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.println(map.get(itr.next()) + '\t');
		System.out.println();
	}
}
