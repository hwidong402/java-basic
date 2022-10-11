package 추상클래스인터페이스;

// 애플잭은 아이폰잭 인터페이스의 규칙에 따라 구현한다. (implements)
public class 애플잭 implements 아이폰잭 {

	@Override
	public void 납작하게만들다() { // 일반메서드
		System.out.println("흰색으로 납작하게 만들다.");
	}

	@Override
	public void 이센치로만들다() {
		System.out.println("긴 줄을 사용하여 이센티로 만들다.");
	}

}
