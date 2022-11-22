package java20221116;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyLinkedList {
	int i;

	MyLinkedList myLinkedList; // 데이터타입이 MyLinkedList인것을 가져오는것
}

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		MyLinkedList list1 = new MyLinkedList();
		list1.i = 1;

		MyLinkedList list2 = new MyLinkedList();
		list2.i = 2;

		list1.myLinkedList = list2;

		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();
		list.remove(0);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();

		/*
		 * for (String str : list ) { System.out.print(str + '\t'); } 으로도 가능하다.
		 */

	}

}
