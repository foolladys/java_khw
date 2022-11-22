package java20221118;

import javax.swing.JOptionPane;

public class ThreadExample {

	public static void main(String[] args) {
	
		ThreadEx2 th1 = new ThreadEx2();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 "+input+"입니다.");
	}
}

class ThreadEx2 extends Thread {
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i=10; i>0; i--) {
			System.out.print(i + " ");
			try {
				Thread.sleep(1000);	// 지금 스레드를 멈추고 다른 스레드에 순서를 돌려라
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}