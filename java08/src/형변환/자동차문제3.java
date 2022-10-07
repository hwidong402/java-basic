
package 형변환;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차문제3 {
	static JFrame f;

	public static void main(String[] args) {
		f = new JFrame();
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
				자동차문제3.show("car01.png");
			}
		});
		yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				자동차문제3.show("car02.png");
			}
		});
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				자동차문제3.show("car03.png");
			}
		});

		f.setVisible(true);
	} // main

	public static void show(String name) {
		ImageIcon icon = new ImageIcon(name);
		JLabel label = new JLabel();
		label.setIcon(icon);
		f.add(label);
		f.setVisible(true);
	}

}