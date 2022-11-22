package java20221116;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext())
			System.out.print(itr.next() + ' ');

		System.out.println();

		itr = list.iterator();

		String str;
		while (itr.hasNext()) {
			str = itr.next();

			if (str.equals("Box"))
				itr.remove();
		}

		// 반복자 다시 획득
		itr = list.iterator();

		// 삭제 후 결과 확인
		while (itr.hasNext())
			System.out.print(itr.next() + '\t');

		System.out.println();

	}

}
