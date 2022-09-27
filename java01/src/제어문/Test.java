package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("중간");
		btnNewButton_2.setForeground(new Color(255, 0, 0));
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setBackground(new Color(0, 255, 0));
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
	}
}
