package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력
		String square = JOptionPane.showInputDialog("가로를 입력하세요.");
		String square2 = JOptionPane.showInputDialog("세로를 입력하세요.");
		
		// 처리
		int intSquare = Integer.parseInt(square);
		int intSquare2 = Integer.parseInt(square2);
		
		int area = intSquare * intSquare2;
		
		// 출력
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + area + " 입니다.");

	}

}
