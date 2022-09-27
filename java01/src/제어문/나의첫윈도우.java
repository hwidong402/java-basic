package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		// 1. JFrame 부품을 새로 만들어주자.
		JFrame f = new JFrame();
		
		// 2. 새로 만든 부품의 크기를 결정
		f.setSize(528, 500);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\java-workspace\\java01\\009.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("돌아간다");
		f.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		// 3. 새로 만든 부품 "보여주세요" 설정
		f.setVisible(true);
	}

}
