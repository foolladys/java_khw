package java20221121;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class URLConEx {

	public URLConEx() {
		String code = null;
		System.out.println("웹 주소를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String address = scanner.next();
		
		try {
			URL url = new URL(address);
			
			URLConnection con = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("C:\\FoolLady\\websrc\\java_khw\\file.html", false);
			
			while((code = webData.readLine()) != null) {
				fw.write(code);
			}
			System.out.println("The end");
			
			fw.close();
			webData.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

