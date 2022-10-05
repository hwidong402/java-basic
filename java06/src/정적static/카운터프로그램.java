package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 카운터프로그램 {
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(337, 300);
		f.getContentPane().setLayout(null);
		
		JLabel t1 = new JLabel("");
		t1.setForeground(Color.RED);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.BOLD, 77));
		t1.setBounds(0, 56, 309, 195);
		f.getContentPane().add(t1);
		
		JButton btnNewButton = new JButton("1더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				t1.setText(count+ "");
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(0, 10, 89, 36);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0으로초기화");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("0");
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setBounds(101, 10, 107, 36);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1빼기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				t1.setText(count + "");
			}
		});
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(220, 10, 89, 36);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);

	}
}
