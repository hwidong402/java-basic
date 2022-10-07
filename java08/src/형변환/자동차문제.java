package 형변환;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 800);
		f.setLayout(new FlowLayout());
		
		JButton red = new JButton("---차1---");
		JButton yellow = new JButton("---차2---");
		JButton blue = new JButton("---차3---");
		f.add(red);
		f.add(yellow);
		f.add(blue);
		
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("car01.png");
				JLabel label = new JLabel();
				label.setIcon(icon);
				f.add(label);
				f.setVisible(true);
			}
		});
		yellow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("car02.png");
				JLabel label = new JLabel();
				label.setIcon(icon);
				f.add(label);
				f.setVisible(true);
			}
		});
		blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("car03.png");
				JLabel label = new JLabel();
				label.setIcon(icon);
				f.add(label);
				f.setVisible(true);
			}
		});
		
		
		f.setVisible(true);
	} //main
	

}