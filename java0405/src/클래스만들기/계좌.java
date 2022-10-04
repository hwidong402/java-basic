package 클래스만들기;

public class 계좌 {
	// 멤버 변수
	public String 이름;
	public String 계좌이름;
	public int 금액;
	
	// 멤버 메서드
	public void 적금하다() {
		System.out.println("계좌 [이름=" + 이름 + ", 계좌이름=" + 계좌이름 + ", 금액:" + 금액 + "] 적금완료");
	}
	
	public void 예금하다() {
		System.out.println("계좌 [이름=" + 이름 + ", 계좌이름=" + 계좌이름 + ", 금액:" + 금액 + "] 예금완료");
	}
	
	
}
