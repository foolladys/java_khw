package java20221114;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//함수에서 checked exception을 던지면 무조건 받아서 예외처리를 해줘야함.

public class ErrorExample {
	public static void main(String[] args) throws IOException{
	
		
		try {
			
			System.out.println(add(3,5));
			md1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int add(int a, int b) throws IOException {
		return a+b;
	}
	
	public static void md1() throws IOException { // IOException 예외 넘긴다고 명시!
		md2();
	}

	public static void md2() throws IOException { // IOException 예외 넘긴다고 명시!
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		writer = Files.newBufferedWriter(file); // IOException 발생 가능
		writer.write('A'); // IOException 발생 가능
		writer.write('Z'); // IOException 발생 가능

		if (writer != null)
			writer.close(); // IOException 발생 가능
	}

}
