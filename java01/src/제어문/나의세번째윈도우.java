package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의세번째윈도우 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(400, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("먹고 싶은 음식");
		lbl1.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl1.setBounds(12, 22, 176, 34);
		f.getContentPane().add(lbl1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBackground(Color.ORANGE);
		t1.setBounds(193, 22, 179, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btn1 = new JButton("어디로 갈까?");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String where = t1.getText();
				if (where.equals("홍차")||where.equals("아메리카노")||where.equals("라떼")) {
					JOptionPane.showMessageDialog(f, "카페로 갑시다.");
					t1.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요.");
					t1.setText("");
				}
			}
		});
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("굴림", Font.PLAIN, 24));
		btn1.setBounds(12, 66, 360, 39);
		f.getContentPane().add(btn1);
		
		JLabel lbl2 = new JLabel("당신의 나이는");
		lbl2.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl2.setBounds(12, 115, 176, 34);
		f.getContentPane().add(lbl2);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBackground(Color.PINK);
		t2.setBounds(193, 115, 179, 34);
		f.getContentPane().add(t2);
		
		JButton btn2 = new JButton("나의 내년 나이는?");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int s22 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, "당신의 내년 나이는 " + (s22+1));
				t2.setText("");
			}
		});
		btn2.setBackground(Color.WHITE);
		btn2.setFont(new Font("굴림", Font.PLAIN, 24));
		btn2.setBounds(12, 159, 360, 39);
		f.getContentPane().add(btn2);
		
		JLabel lbl3 = new JLabel("국어 점수");
		lbl3.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl3.setBounds(12, 208, 176, 34);
		f.getContentPane().add(lbl3);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setColumns(10);
		t3.setBackground(Color.CYAN);
		t3.setBounds(193, 208, 179, 34);
		f.getContentPane().add(t3);
		
		JLabel lbl4 = new JLabel("수학 점수");
		lbl4.setFont(new Font("Dialog", Font.BOLD, 25));
		lbl4.setBounds(12, 252, 176, 34);
		f.getContentPane().add(lbl4);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 20));
		t4.setColumns(10);
		t4.setBackground(Color.CYAN);
		t4.setBounds(193, 252, 179, 34);
		f.getContentPane().add(t4);
		
		JButton btn3 = new JButton("두 과목 점수의 평균은?");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String av = t3.getText();
				String av2 = t4.getText();
				int av3 = Integer.parseInt(av);
				int av4 = Integer.parseInt(av2);
				double avg = (av3 + av4) / 2.0;
				JOptionPane.showMessageDialog(f, "두 과목의 평균은 " + avg);
				t3.setText("");
				t4.setText("");
			}
		});
		btn3.setFont(new Font("굴림", Font.PLAIN, 24));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(12, 318, 360, 39);
		f.getContentPane().add(btn3);
		f.setVisible(true);
	}
}