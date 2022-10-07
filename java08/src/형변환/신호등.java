package 형변환;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 신호등 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setSize(618, 692);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btn1 = new JButton("빨간 신호");
		btn1.setFont(new Font("굴림", Font.BOLD, 30));
		btn1.setBackground(Color.red);
		f.getContentPane().add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 라벨을 하나 만든다.
				JLabel img = new JLabel();
				
				//이미지 아이콘을 하나 만든다.
				ImageIcon icon = new ImageIcon("r.png");

				// 라벨에 이미지를 낀다.
				img.setIcon(icon);
				
				// f에 라벨을 낀다.
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton btn2 = new JButton("노란 신호");
		btn2.setFont(new Font("굴림", Font.BOLD, 30));
		btn2.setBackground(Color.yellow);
		f.getContentPane().add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 라벨을 하나 만든다.
				JLabel img = new JLabel();
				
				//이미지 아이콘을 하나 만든다.
				ImageIcon icon = new ImageIcon("y.png");
				
				// 라벨에 이미지를 낀다.
				img.setIcon(icon);
				
				// f에 라벨을 낀다.
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton btn3 = new JButton("초록 신호");
		btn3.setFont(new Font("굴림", Font.BOLD, 30));
		btn3.setBackground(Color.blue);
		f.getContentPane().add(btn3);
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 라벨을 하나 만든다.
				JLabel img = new JLabel();
				
				//이미지 아이콘을 하나 만든다.
				ImageIcon icon = new ImageIcon("g.png");
				
				// 라벨에 이미지를 낀다.
				img.setIcon(icon);
				
				// f에 라벨을 낀다.
				f.add(img);
				f.setVisible(true);
			}
		});
		
		f.setVisible(true);
		
		

	}

}
