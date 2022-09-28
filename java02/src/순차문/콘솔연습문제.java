package 순차문;

import java.util.Scanner;

public class 콘솔연습문제 {

	public static void main(String[] args) {
		
		// 1번 문제
		// 입력 및 처리
		Scanner	sc = new Scanner(System.in);
		
		System.out.println("나에 대한 정보");
		System.out.println("-------------");
		System.out.print("이름 입력>> ");
		String name = sc.next(); // 단어하나.
		System.out.print("나이 입력>> ");
		int age = sc.nextInt();
		System.out.print("취미 입력>> ");
		String hob = sc.next();
		System.out.println("-------------");
		
		// 출력
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age + "세");
		System.out.println("나의 취미는 " + hob + "입니다.!");
		
		
		// 2번 문제
		// 입력 및 처리
//		Scanner	sc = new Scanner(System.in);
		System.out.print("나의 이름은? ");
		String name2 = sc.next();
		System.out.print("나의 키는? ");
		double height = sc.nextDouble();
		System.out.print("나의 몸무게는? ");
		double weight = sc.nextDouble();
		System.out.print("나는 저녁을 먹었나요? ");
		boolean din = sc.nextBoolean();
		sc.nextLine();
		System.out.print("나의 좌우명은? ");
		String left = sc.nextLine();
		System.out.println("-------------");
		
		// 출력
		System.out.println("내 이름은 " + name2 + "입니다.");
		System.out.println("내 내년 키는 " + (height + 10) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (weight - 10) + "입니다.");
		System.out.println("나는 저녁을 " + din + "했습니다.");
		System.out.println("나의 좌우명은 " + left + "입니다.");
	}
}
