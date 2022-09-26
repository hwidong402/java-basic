package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력
		String height = JOptionPane.showInputDialog("몸무게를 입력하세요.");

		// 처리
		double aveHeight = Double.parseDouble(height);
		double ave = (aveHeight - 100) * 0.9;

		// 출력
		JOptionPane.showMessageDialog(null, "적정 몸무게는 " + ave + " 입니다.");
	}

}
