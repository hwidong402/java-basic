package 추상클래스인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 씨피유() {
		System.out.println("바나나 모양의 저성능 씨피유를 탑재하다.");

	}

	@Override
	public void 그래픽() {
		System.out.println("바나나 모양의 무거운 그래픽카드를 탑재하다.");

	}

	@Override
	public void 키보드() {
		System.out.println("바나나 모양의 입력 속도가 느린 키보드를 연결하다.");

	}

}
