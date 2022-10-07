package 컬렉션;

import java.util.LinkedList;

public class 큐확인문제 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// 일정순서 ==> 국,수,영,컴
		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("컴퓨터");
		System.out.println("시험 순서는 : " + list);
		
		// 시험을 치면 한 과목씩 사라짐. 국 -> 수 -> 영 -> 컴
		for (int i = 0; i <= list.size(); i++) {
			list.remove();
			System.out.println((i + 1) + "일차: 시험본 후 남은 과목 : " + list);
		}

	}

}
