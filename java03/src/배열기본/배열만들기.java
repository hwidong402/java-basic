package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// 배열을 생성할 때, 값을 이미 알고 있는 경우
		int[] s = { 1, 2, 3, 4, 5, 6, 7 };
		// 변수의 개수 ==> 길이값까지 9
		System.out.println("s에 저장된 주소 >> " + s);
		System.out.println(s[0]);
		// 3번째, 6번째에 들어있는 값을 프린트
		System.out.println(s[2]);
		System.out.println(s[5]);
		System.out.println(s.length);
		

		// 배열을 생성할 때, 값을 아직 모르고 있는 경우
		int[] s2 = new int[5];
		// 변수의 개수 ==> 길이값까지 7
		System.out.println("s2에 저장된 주소 >> " + s2);
		System.out.println(s2.length);
		System.out.println(s2[0]);
		// 배열은 많은 양의 데이터를 쓸 때, 편하게 쓰라고 만들어놓은 특별한 부품
		// 빈 공간을 여러개 만들 때, 자동으로 초기화!!!
		// int -> 0, double -> 0.0, boolean -> false 
		// 배열은 자동초기화해줌!!
		
		// 배열의 각 인덱스에 값 대입!!
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		// 마지막 위치에 500을 대입
		s2[s2.length -1] = 500;
		
		System.out.println(s2[0]);
		System.out.println(s2[s2.length-1]);
		
	}

}



