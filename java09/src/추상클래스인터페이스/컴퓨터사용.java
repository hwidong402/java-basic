package 추상클래스인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		BananaComputer banana = new BananaComputer();
		
		apple.그래픽();
		apple.씨피유();
		apple.키보드();
		
		banana.그래픽();
		banana.씨피유();
		banana.키보드();

	}

}
