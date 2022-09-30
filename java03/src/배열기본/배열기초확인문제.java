package 배열기본;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// 1번
		int[] ary = new int[5];

		// 2번
		System.out.println(ary.length);

		// 3번
		ary[0] = 100;
		System.out.println(ary[0]);

		// 4번
		ary[ary.length - 1] = 500;
		System.out.println(ary[ary.length - 1]);
		
		// 5번
		ary[2] = 200;
		System.out.println(ary[2]);
		
		// 6번
		for (int a : ary) {
			System.out.println(a);
		}
		
		// 7번
		for (int i = 0; i < ary.length; i++) {
			System.out.println(i + "번째 인덱스는: " + ary[i]);
		}

	}

}
