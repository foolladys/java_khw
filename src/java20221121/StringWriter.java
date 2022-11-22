package java20221121;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) {
		String ks = "오늘 점심과 저녁메뉴를 정해줬으면 좋겠다.";
		String es = "朝ごはんも昼ごはんもパン";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))) {
			bw.write(ks, 0, ks.length());
			bw.newLine();
			bw.write(es, 0, es.length());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
