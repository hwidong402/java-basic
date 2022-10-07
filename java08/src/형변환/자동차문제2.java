
package 형변환;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차문제2 {
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
				Object name = e.getActionCommand();
				System.out.println(name);
				자동차문제2.show(name);
			}
		});
		yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object name = e.getActionCommand();
				System.out.println(name);
				자동차문제2.show(name);
			}
		});
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object name = e.getActionCommand();
				System.out.println(name);
				자동차문제2.show(name);
			}
		});

		f.setVisible(true);
	} // main

	public static void show(Object name) {
		String img = "";
		if (name.equals("---차1---")) {
			img = "car01.png";
		} else if (name.equals("---차2---")) {
			img = "car02.png";
		} else {
			img = "car03.png";
		}
		ImageIcon icon = new ImageIcon(img);
		JLabel label = new JLabel();
		label.setIcon(icon);
		f.add(label);
		f.setVisible(true);
	}

}