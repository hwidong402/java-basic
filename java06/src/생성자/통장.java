package 생성자;

public class 통장 {
	// 멤버 변수
	// class 아래에 선언(class 전체에서 사용 가능, 전역변수)
	// 글로벌 변수(global)
	String name; // 사람이름
	String ssn; // 주민번호
	int money;
	
	// 메서드 이름을 클래스이름과 동일하게 void를 안씀
	// new 객체생성시 입력값을 자동초기화, 객체생성할 때 필요한 값을 한정시킬 수 있다.
	// 생성자 메서드(메서드 생략) => 생성자(constructor)
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	
}