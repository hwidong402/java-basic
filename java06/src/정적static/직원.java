package 정적static;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int ageT;
	
	public 직원(String name, int age, String gender) {
		count++;
		ageT += age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public static double getAvg() {
		return ageT / (double)count;
	}

	@Override
	public String toString() {
		return "우리 회사 직원의 [이름=" + name + ", 나이=" + age + ", 성별=" + gender + "]";
	}
	
	
	
	
}
