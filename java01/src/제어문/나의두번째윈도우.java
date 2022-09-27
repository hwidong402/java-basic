package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class 나의두번째윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		// jframe, 크기정하고, 보여라. ==> windowbuilder로!
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 24, 99, 44);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 128, 255));
		textField.setFont(new Font("굴림", Font.BOLD, 20));
		textField.setBounds(133, 25, 286, 37);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 78, 99, 44);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("주소");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(22, 130, 86, 44);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(78, 225, 109, 67);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBackground(new Color(128, 255, 128));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(281, 225, 109, 67);
		f.getContentPane().add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 128, 255));
		textField_1.setFont(new Font("굴림", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(133, 85, 286, 37);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 128, 255));
		textField_2.setFont(new Font("굴림", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(133, 137, 286, 37);
		f.getContentPane().add(textField_2);
		f.setVisible(true);
		
	}
}
