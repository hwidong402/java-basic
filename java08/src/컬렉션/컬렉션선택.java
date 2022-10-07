package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션선택 {

	public static void main(String[] args) {
		// 1. set -> HashSet (중복x)
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("DB관리자");
		System.out.println(team);
		System.out.println(team.size());
		
		// 2. queue -> LinKedList (선입선출)
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println(milk);
		
		// 3. List -> ArrayList
		ArrayList ski = new ArrayList();
		ski.add("박스키"); // 0
		ski.add("송스키"); // 1
		ski.add("김스키"); // 2
		ski.add("정스키"); // 3
		ski.remove(1);
		System.out.println(ski);
		
	}

}
