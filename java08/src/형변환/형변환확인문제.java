package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		// Object <-자동형변환-- Integer <-오토박싱-- int
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		// 1. 전체 목록을 프린트
		for (int i = 0; i < me.size(); i++) {
			// toString();
			System.out.print(me.get(i) + " " );
		}
		
		System.out.println();
		
		// 2. 돈 1000을 꺼내서 2000을 더해 프린트
		int money = (int)me.get(0);
		System.out.println(money + 2000);
		// int <-오토언박싱-- Integer <-강제형변환-- Object
		
		// 3. 키 189.1을 꺼내서 10을 더해 프린트
		double height = (double)me.get(1);
		System.out.println(height + 10);
		
		// 4. 아침여부 false를 꺼내서 아침을 먹었으면 배불러요. 아니면 배고파요.
		boolean frist = (boolean)me.get(2);
		if (frist == true) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		// 5. 성별 "남" 꺼내서 남이면 주민번호 1,3이에요, 아니면 주민번호는 2,4예요.
		char gender = (char)me.get(3);
		if (gender == '남') {
			System.out.println("주민번호 1,3이에요");
		} else {
			System.out.println("주민번호 2,4에요");
		}
		
		// 6. 2~3에서 형변환(업캐스팅, 다운캐스팅), 오토박싱, 오토언박싱과정을 순서대로 작성해주세요.
		// Object <-자동형변환-- Integer <-오토박싱-- int
		// int <-오토언박싱-- Integer <-강제형변환-- Object
	}

}
