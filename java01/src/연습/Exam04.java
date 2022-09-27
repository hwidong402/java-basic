package 연습;

import javax.swing.JOptionPane;

public class Exam04 {

	public static void main(String[] args) {
		
		// 1번 문제
		char pw = 'p';
		String pw2 = JOptionPane.showInputDialog("로그인 암호");
		char pw3 = pw2.charAt(0);
		
		if (pw == pw3) {
			JOptionPane.showMessageDialog(null, "PASS!");
		} else {
			JOptionPane.showMessageDialog(null, "재입력!");
		}
		
		// 2번 문제
		String yester = JOptionPane.showInputDialog("어제 몸무게는?");
		String today = JOptionPane.showInputDialog("오늘 몸무게는?");
		
		double yester2 = Double.parseDouble(yester);
		double today2 = Double.parseDouble(today);
		
		double total = yester2 - today2;
		
		if (total > 2) {
			JOptionPane.showMessageDialog(null, "다이어트 성공!");
		} else {
			JOptionPane.showMessageDialog(null, "다이어트 실패!");
		}
		
		// 3번 문제
		if (pw == pw3 && total >2) {
			JOptionPane.showMessageDialog(null, "오늘은 성공!");
		} else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전!");
		}
		
		
		// 4번 문제
		int p = 66;
		int m = 77;
		int e = 88;
		int k = 99;
		
		// int ssum = p + m + e + k;
		// double sum = Double.parseDouble(sum);
		// 정수와 정수 계산은 무조건 정수이다. 실수여도 실수를 잘라서 정수로 나타낸다.
		
		int sum = p + m + e + k;
		double tot = sum / 4.0; // 둘 중 하나를 실수로 만들어라.
		// 다른 언어에 비해 연산자(기호)수가 적다.
		System.out.println(tot);

		
		// 5번 문제
		final double PI = 3.14;
		double r = 2.2;
		double calc = PI * r * r;
		System.out.printf("원의 면적은 %.2f" , calc);	
		
	}
}