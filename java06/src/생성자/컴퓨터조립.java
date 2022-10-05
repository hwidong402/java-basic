package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 comp = new 컴퓨터(850000, "삼성", 30);
		
		System.out.println("컴퓨터의 가격은 " + comp.price + "원이고 컴퓨터 제조회사는 " + comp.com + "이며 모니터크기는 " + comp.size +"인치 입니다." );
		
		컴퓨터 comp2 = new 컴퓨터(950000, "애플", 27);
		System.out.println("컴퓨터의 가격은 " + comp2.price + "원이고 컴퓨터 제조회사는 " + comp2.com + "이며 모니터크기는 " + comp2.size +"인치 입니다." );
		
		// comp는 주소가 들어있음.
		// 컴퓨터 클래스에 toString()을 메서드를 생성해주면
		// 주소를 프린트할 때 toString() 메서드가 자동 호출 되어
		// return한 스트링을 주소대신에 프린트해준다.
		// 주소가 가르키는 힙 영역의 멤버 변수 값들을 프린트!!
		System.out.println(comp);
		System.out.println(comp2);
	}
	
	
	

}
