package java20221118;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamExample {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.dat");
		
		InputStream in = new FileInputStream("data.dat");
		
		out.write(7);
		out.close();
		
		int dat = in.read();
		in.close();
		System.out.println(dat);
	}
}
