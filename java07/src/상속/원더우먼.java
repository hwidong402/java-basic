package 상속;

public class 원더우먼 extends 우먼{
	int height;
	
	public void 버티다() {
		System.out.println("버틸만하다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [height=" + height + ", size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
}
