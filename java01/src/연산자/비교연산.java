package 연산자;

public class 비교연산 {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		
		// 자동완성
		// System.out.println(""); // alert(), print()
		// syso + ctrl + space
		// 비교연산자의 결과는 논리데이터(true/false)
		// 한줄복사 : 컨트롤 + 알트 + 화살표아래
		System.out.println("일치?? " + ( x == y));
		System.out.println("불일치?? " + ( x != y));
		System.out.println("이상?? " + ( x >= y)); // 이하
		System.out.println("초과?? " + ( x > y)); // 미만
	}

}
