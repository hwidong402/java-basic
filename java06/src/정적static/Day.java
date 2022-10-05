package 정적static;

public class Day {
	// 객체 생성시, heap 영역에 복사될 변수들
	// 변수들에 해당 실제 값이 들어감(실제변수, 인스턴스변수)
	String doing;
	int time;
	String location;
	static int count; // 전역 변수는 자동초기화(0)
	static int timeC;
	
	// 객체 생성시, 3개 데이터 반드시 넣어서 객체생성해라.
	public Day(String doing, int time, String location) {
		count++;
		timeC += time; // timeC = timeC + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	// 일반메서드는 객체생성후, "주소로 접근"해서 호출해야한다.
	// 일반메서드는 객체생성후, 호출(사용)할 수 있다.
	// 평균을 객체 생성과 상관없이 아무때나 구하고 싶다.
	// 객체생성과 상관없이 기능을 정의하고 싶으면, "static"으로 만들어라
	public static double getAvg() {
		// static메서드안에 들어가는 전역변수는
		// 객체생성하지 않아도 접근가능해야 하므로
		// static변수만 가능
		return timeC / (double)count;
	}
	

	// 객체 생성 후 생성된 객체의 주소가 아니라 
	// 그 주소가 가르키는 인스턴스 변수의 값들을 가지고 String으로 만들어주세요
	@Override
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
	
	
	
}
