package 상속;

public class 우먼 extends 사람{
	int size;
	
	public void 섬광() {
		System.out.println("너무 눈 부시다.");
	}

	@Override
	public String toString() {
		return "우먼 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
}
