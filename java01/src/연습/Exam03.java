package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력
		String telcom = JOptionPane.showInputDialog("통신사를 입력하세요.");
		String tel = JOptionPane.showInputDialog("전화번호를 입력하세요.");
		String name = JOptionPane.showInputDialog("가입자 이름을 입력하세요.");

		// 처리
		String finalName = name + "님은 " + telcom + "에 " + tel;  

		// 출력
		JOptionPane.showMessageDialog(null, finalName + "로 가입되셨습니다.");
	}

}
