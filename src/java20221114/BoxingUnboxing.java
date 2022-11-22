package java20221114;

public class BoxingUnboxing {
	public static void main(String[] args) {

		Integer iObj = 10; // (오토) 박싱 = new Integer(10);과 같다.
		Double dObj = 3.14; // 자동적으로 컴파일러가 해 준다.
		
		int num1 = iObj.intValue(); // (오토) 언박싱
		double num2 = dObj.doubleValue();
		
		num1++; // new Integer(num1.intValue() + 1) 다시 객체 생성을 해서 추가해줌(final이기 때문에)
		num2 += 2.5; // new Double(num2.doubleValue() + 2.5)
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(dObj.intValue());
	}
}
