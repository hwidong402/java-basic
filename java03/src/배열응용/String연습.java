package 배열응용;

import java.util.Scanner;

public class String연습 {

	public static void main(String[] args) {
//		String sn = "931212-1035715";

		String s = "나는 프로그래머프야";
		String s5 = "진짜!!";
		System.out.println(s + s5); // 스트링 결합
		System.out.println(s.concat(s5)); // 스트링 결합
		System.out.println(s.charAt(0)); // 문자 1글자 추출
		System.out.println(s.endsWith("야")); // 특정한 문자로 끝나는지 확인
		System.out.println(s.substring(3)); // 인덱스 3 이후 글자들 모두 추출
		System.out.println(s.substring(3, 8)); // 인덱스 3~7까지 추출
		System.out.println(s.contains(s5)); // s에 s2가 포함되어 있는지?
		System.out.println(s.lastIndexOf("프")); // s중 프글자 위치
		System.out.println(s.toUpperCase()); // 대문자로
		System.out.println(s.toLowerCase()); // 소문자로
		System.out.println(s.length()); // 글자수
		System.out.println(s.replace("나", "너")); // "나"를 "너"로 바꾸기

		// 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력>> ");
		String tel = sc.next();

		// Q.1
		String tel1 = tel.trim(); // 양쪽 공백 제거
		System.out.println(tel1);

		// Q.2
		String s2 = "감자,고구마,양파";
		String[] s3 = s2.split(",");
		System.out.println(s3[0]);

		String[] tel2 = tel.split("-");
		if (tel2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		// Q.3
		String tel3 = tel.substring(0, 3);
		if (tel3.equals("011")) {
			System.out.println("SK");
		} else if (tel3.equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}

		// Q.4
		String tel4 = tel.substring(4, 7);
		if (tel4.length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		// Q.5
		if (tel.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
	}
}