package 상속;

public class 매니저사용 {

	public static void main(String[] args) {
		매니저 ma = new 매니저();
		ma.address = "부산광역시";
		ma.bonus = 55;
		ma.name = "홍길동";
		ma.rrn = 212345;
		ma.salary = 60;
		
		ma.test();
		System.out.println(ma);

	}

}
