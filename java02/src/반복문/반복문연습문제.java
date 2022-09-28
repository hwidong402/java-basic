package 반복문;

import java.util.Scanner;

public class 반복문연습문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pre = 0; // 앞이 큰 경우 카운트
		int post = 0; // 뒤가 큰 경우 카운트
		// 변수는 초기값을 반드시 시켜주는 습관이 좋습니다.
		
		while (true) {
			System.out.print("숫자 입력1>> ");
			int num1 = sc.nextInt();
			System.out.print("숫자 입력2>> ");
			int num2 = sc.nextInt();
			if (num1 > num2) {
				System.out.println("앞 숫자가 더 큽니다.");
				pre++;
			} else if (num1 == num2) {
				System.out.println("숫자가 동일함");
			} else {
				System.out.println("뒷 숫자가 더 큽니다.");
				post++;
			}
			System.out.print("더 하시겠습니까? 종료(x), 계속(o)>> ");
			String exit = sc.next();
			char exit2 = exit.charAt(0); // 첫번째 문자 1개 가져오기
			if (exit2 == 'x') {
				System.out.println("게임을 종료합니다.!!");
				System.out.println("앞 숫자가 더 큰 횟수는 " + pre + "회");
				System.out.println("뒷 숫자가 더 큰 횟수는 " + post + "회");
				System.exit(0);
			}
		}
	}
}