package 반복문;

import java.util.Scanner;

public class 반복문연습문제2 {

	public static void main(String[] args) {
		int iu = 0;
		int you = 0;
		int bts = 0;
		Scanner	sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력(1)아이유, (2)유재석, (3)방탄 (4)종료>> ");
			int choice = sc.nextInt(); // 
			if (choice == 4) {
				System.out.println("종료합니다.");
				System.out.println("투표 결과는");
				System.out.println("아이유 " + iu +"표");
				System.out.println("유재석 " + you +"표");
				System.out.println("방탄 " + bts +"표");
				break;
			} else if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				you++;
			} else if (choice == 3) {
				bts++;
			} else {
				System.out.println("없는 번호입니다.");
			} 
			
			/*
			System.out.print("더 하시겠습니까? o, x >> ");
			String con = sc.next();
			if (con.equals("x")) {
				System.out.println("종료합니다.");
				System.out.println("투표 결과는");
				System.out.println("아이유 " + iu +"표");
				System.out.println("유재석 " + you +"표");
				System.out.println("방탄 " + bts +"표");
				System.exit(0);
			} 
			*/
		}
	}
}