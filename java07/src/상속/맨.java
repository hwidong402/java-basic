package 상속;

public class 맨 extends 사람{
	// 멤버변수 2개
	int size;
	
	// 멤버메서드 10개
	public void 달리다() {
		System.out.println("빨리 달리다.");
	}

	// 부모로부터 상속받은 메서드와
	// 동일한 메서드를 재정의 하는 경우
	// 덮어써버리게 됨 ==> 오버라이드(재정의)
	@Override
	public String toString() {
		return "맨 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
}
