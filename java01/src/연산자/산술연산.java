package 연산자;

public class 산술연산 {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;

		// - 기본 데이터: 정수, 실수, 문자1, 논리
		// int x = 100;
		// String name = "홍길동";
		// - 참조 데이터: 부품, 배열, String
		// ==> 부품을 사용하는 방법
		// 1) 대문자로 바로 쓰는 경우
		// 2) new 새로 만들어서 쓰는 경우
		// 논리 
		// - 논리데이터 : true/false
		// - 논리연산자 : 조건이 여러개일 때
		//             &&, ||, !
		System.out.println("더한 값은 " + (x + y));
		System.out.println("뺀 값은 " + (x - y));
		System.out.println("곱한 값은 " + (x * y));
		System.out.println("나눈 값은 " + (x / y));
		System.out.println("나눈 나머지는 " + (x % y));

	}

}
