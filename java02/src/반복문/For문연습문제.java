package 반복문;

public class For문연습문제 {

	public static void main(String[] args) {
		// 문제1
		int sum = 0;
		for (int i = 33; i <= 222; i++) {
			sum = sum + i;
			// 33 = 0 + 33
			// 67 = 33 + 45
			// 102 = 67 + 35
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
	
		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);
		
		// 문제2
		int sum4 = 0;
		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum4 > 100) {
				break;
				// break를 포함하고 있는 블록을 중단하라.
			} // if종료
			if (i % 5 == 0) {
				// 5의 배수는 그냥 skip 해버려
				continue;
			}
			sum4 = sum4 + i;
		} // for종료
		System.out.println(sum4);
	} // 메인 종료
} // 클래스 종료