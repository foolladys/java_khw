package Timeattack1117;

import java.util.HashSet;

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "[" + age + "세]";
	}

	@Override
	public int hashCode() {
		return (name.hashCode() + age) / 2;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 n1 = (Person2)obj;
			if(this.name.equals(n1.name))
				return true;
		}
		
		return false;
	}
}

public class Ex36 {

	public static void main(String[] args) {
		HashSet<Person2> hSet = new HashSet<Person2>();
		hSet.add(new Person2("LEE", 10));
		hSet.add(new Person2("LEE", 10));
		hSet.add(new Person2("PARK", 35));
		hSet.add(new Person2("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
	}

}

/*
 * 8.아래와 같이 출력되도록 하시오. HashSet<Person> hSet = new HashSet<Person>();
 * hSet.add(new Person("LEE", 10)); hSet.add(new Person("LEE", 10));
 * hSet.add(new Person("PARK", 35)); hSet.add(new Person("PARK", 35));
 * 
 * System.onut.println("저장된 데이터 수: " + hSet.size()); System.out.println(hSet);
 * 
 * /* ============ 저장된 데이터 수: 2 [LEE(10세), PARK(35세)]
 */