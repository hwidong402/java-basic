package 조건문;

import java.util.Scanner;

public class SwitchCase연습문제 {

	public static void main(String[] args) {
		
		// 1번
		Scanner sc = new Scanner(System.in);
		System.out.print("암호를 대시오: ");
		String pw = sc.nextLine();
		
		if (pw.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		
		// 3번
		System.out.print("당신이 먹고 싶은 메뉴는? (짜장면, 라면, 회): ");
		String lunch = sc.nextLine();
		
		if (lunch.equals("짜장면")) {
			System.out.println("중국집으로 가요.");
		} else if (lunch.equals("라면")) {
			System.out.println("분식집으로 가요.");
		} else if (lunch.equals("회")) {
			System.out.println("횟집으로 가요.");
		} else {
			System.out.println("그냥 안먹어요.");
		}

	}

}
