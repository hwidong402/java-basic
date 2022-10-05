package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		// 변수는 선언된 위치를 포함한 괄호안에서만 사용 가능
		// day1, day2, day3는 메서드 안에서만 쓸 수 있음
		// main 안에서만 쓸 수 있는 지역변수(local변수)
		// 지역변수의 <--> 전역변수
		// 지역변수는 자동초기화X
		// 지역변수는 프로그래머가 초기화시켜야 한다
		Day day1 = new Day("잠을 잤다", 14, "방 침대");
		System.out.println(day1); // 주소 대신 toSting이 찍힘
		System.out.println(Day.count); // static!!
		System.out.println("전체 시간>> " + Day.timeC + "시간");
		
		Day day2 = new Day("목욕", 1, "목욕탕");
		System.out.println(day2); // 주소 대신 toSting이 찍힘
		System.out.println(Day.count);
		System.out.println("전체 시간>> " + Day.timeC + "시간");
		
		Day day3 = new Day("데이트", 4, "송정");
		System.out.println(day3); // 주소 대신 toSting이 찍힘
		System.out.println(Day.count);
		System.out.println("전체 시간>> " + Day.timeC + "시간");
		System.out.println("평균 시간>> " + Day.getAvg());
		

	}

}
