package java20221121;

public class TattackThread {
	public static void main(String args[]) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {

	public void run() {
		for (int i = 0; i < 500; i++)
			System.out.printf("%s", new String("음악"));
	}
}

class Thread2 extends Thread {

	public void run() {
		for (int i = 0; i < 500; i++)
			System.out.printf("%s", new String("영화"));
	}
}