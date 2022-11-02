
public class Sensei {
	
	public static void main(String [] args) {
	
		StarPrint2 strPrint = new StarPrint2(5);
		strPrint.star_Print();
		
		
	}

}

class StarPrint2{
	int num;
	
	public StarPrint2(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void star_Print() {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void star_Print(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}