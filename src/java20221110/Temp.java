package java20221110;



public class Temp {
	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
	}

}
/*
6:45 start
3. 다음을 만족하는 클래스 Temporary를 작성하시오.

- 클래스 Temporary는 위 클래스 Employee의 하위 클래스
- 필드 : 일한 시간, 시간당 보수를 선언하고 시간당 보수의 초기 값으로 10000 저장
- 생성자 : 이름, 나이, 주소, 부서를 지정하는 상위 생성자 호출
- Setter : 일한 시간을 지정하면서 급여를 일한 시간 * 시간당 보수로 계산하여 저장
- 메소드 printInfo() : 인자는 없고 "비정규직"이라는 정보와 일한 시간과 급여를 출력
- 또한 다음 프로그램으로 클래스 Temporary를 점검하는 프로그램 실행

*/