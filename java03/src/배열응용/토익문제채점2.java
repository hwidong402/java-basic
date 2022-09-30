package 배열응용;

import java.util.Random;

public class 토익문제채점2 {

	public static void main(String[] args) {
		// 1. 답안지, 대답안 공간만들어라.
		int[] 답안지 = new int[990];
		int[] 대답안 = new int[990];

		// 2. 랜덤하게 만들어주는 부품을 만들어라.
		Random r = new Random();

		// 3. 990번 반복해서 답안지, 대답안에 숫자를 넣어라.
		// 1~4 범위
		for (int i = 0; i < 대답안.length; i++) {
			답안지[i] = r.nextInt(4) + 1;
			대답안[i] = r.nextInt(4) + 1;
		}

		// 4. 같은 인덱스끼리 990번 반복해서 비교
		// 비교하다가 숫자가 동일하면 점수를 1 늘려주세요.
		int sum = 0;
		for (int i = 0; i < 대답안.length; i++) {
			if (답안지[i] == 대답안[i]) {
				sum++;
			}
		}

		// 5. 내 점수 프린트!
		System.out.println("나의 점수는: " + sum);
	}

}
