package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] yyear = new String[3];
		String[] tyear = new String[3];

		// 1. 작년에 가고 싶었던 곳 세곳 입력받기. 제주도, 양양, 속초
		for (int i = 0; i < tyear.length; i++) {
			System.out.print((i + 1) + ": " + "작년에 가고 싶었던 곳 세 곳을 순위에 따라 입력하세요.: ");
			yyear[i] = sc.next();

		}

		// 2. 올해에 가고 싶었던 곳 세곳 입력받기. 제주도, 부산, 울산
		for (int i = 0; i < tyear.length; i++) {
			System.out.print((i + 1) + ": " + "올해에 가고 싶었던 곳 세 곳을 순위에 따라 입력하세요.: ");
			tyear[i] = sc.next();
		}

		// 3. 작년과 올해 가고 싶은 곳이 동일한 곳은 몇 곳인가?
		int sum = 0;
		for (int i = 0; i < tyear.length; i++) {
			if (yyear[i].equals(tyear[i])) {
				sum++;
			}
		}
		System.out.println("작년과 올해 가고싶은 순위가 같은 장소는: " + sum + "개 입니다");

	}

}
