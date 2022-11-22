package Timeattack1117;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class P41 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("대상 파일 : ");
		String org = sc1.next();
		System.out.println("사본 이름 : ");
		String cop = sc1.next();
		
		try(InputStream in = new FileInputStream(org); OutputStream out = new FileOutputStream(cop)){
			while(true) {
			int data;
			data = in.read();
			if(data == -1)
				break;
			out.write(data);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
