package java20221115;

import java.util.Arrays;

class INum {
	private int a;
	private Object num;

	INum(int a) {
		this.a = a;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((INum)obj).num)
	         return true;
	      else
	         return false;
		
	}

}

public class TA1115 {

	// "main 에서 아래를 넣고 돌아가도록 하시오. 출력 : true
	public static void main(String[] args) {
		INum iNum1 = new INum(3);
		INum iNum2 = new INum(3);

		System.out.println(iNum1.equals(iNum2));
		
		
		  INum[] ar1 = new INum[3];
		  INum[] ar2 = new INum[3];

		  ar1[0] = new INum(1); ar2[0] = new INum(1);
		  ar1[1] = new INum(2); ar2[1] = new INum(2);
		  ar1[2] = new INum(3); ar2[2] = new INum(3);
		  
		  System.out.println(Arrays.equals(ar1, ar2));
	}
}
