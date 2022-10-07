package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의주식크롤링 {
	private static JTextField t1;
	// 버튼을 누를 때마다 TextArea 부분에 결과를 넣어주려면
	// 아무 곳에서나 접근이 가능해야함.
	// 전역변수로 선언해주어야함.
	static JTextArea ta1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(390, 600);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("CODE:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(82, 211, 202, 47);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBackground(Color.GREEN);
		t1.setBounds(37, 268, 296, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		ta1 = new JTextArea();
		ta1.setForeground(Color.BLUE);
		ta1.setFont(new Font("굴림", Font.BOLD, 26));
		ta1.setBounds(22, 382, 340, 169);
		f.getContentPane().add(ta1);

		JButton btnNewButton = new JButton("모 나 미");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005360");
				ta1.setText(result);
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(50, 10, 266, 47);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("삼성전자");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// code를 주면서 크롤링 해달라고 하자.
				// 크롤링연습6의 naver(code)호출!!
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005930");
				ta1.setText(result);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(50, 74, 266, 47);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("셀트리온");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("068270");
				ta1.setText(result);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setBounds(50, 143, 266, 47);
		f.getContentPane().add(btnNewButton_2);

		JButton b1 = new JButton("크롤링시작");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력한 코드를 가지고 와라!!
				// textField에 입력한 거!!!
				String code = t1.getText(); // 보고자 하는 코드 (ex.035420)
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver(code);
				ta1.setText(result);
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 27));
		b1.setBounds(68, 325, 216, 47);
		f.getContentPane().add(b1);
		f.setVisible(true);

	}
}
