package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNew = new JLabel("");
		lblNew.setIcon(new ImageIcon("D:\\java-workspace\\java04\\일기장.jpg"));
		lblNew.setBounds(30, 10, 421, 270);
		f.getContentPane().add(lblNew);
		
		JLabel lblNewLabel = new JLabel("아이디:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(30, 300, 149, 53);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBackground(Color.YELLOW);
		t1.setBounds(191, 300, 261, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(30, 363, 149, 53);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setBackground(Color.YELLOW);
		t2.setColumns(10);
		t2.setBounds(191, 363, 261, 53);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText(); // id
				String s2 = t2.getText(); // pw
				
				// id = "root", pw = "1234"이면 일기쓰는 화면을 띄우고
				// 아니면 JOptionPane으로 "입력값이 달라 로그인 실패입니다."
				// 저 일기쓰기화면창을 띄워라!!
				if (s1.equals("root") && s2.equals("1234")) {
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();	
				} else {
					JOptionPane.showMessageDialog(f, "입력값이 달라 로그인 실패입니다.");
//					t1.setText("");
//					t2.setText("");
				}
//				일기쓰기화면 diary = new 일기쓰기화면();
//				diary.open();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\java-workspace\\java04\\로그인3.png"));
		btnNewButton.setBounds(47, 449, 185, 91);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\java-workspace\\java04\\리셋2.png"));
		btnNewButton_1.setBounds(252, 449, 199, 91);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		f.setVisible(true);
	}
}
