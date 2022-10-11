package 추상클래스인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class 인터페이스그래픽 {
	public static void main(String[] args) {
		JFrame f = new JFrame("이벤트를 인터페이스로 처리");
		f.setSize(500, 600);
		f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("버튼1을 클릭");
		JButton b2 = new JButton("버튼2를 클릭");
		
		f.add(b1); // 업캐스팅(자동형변환)
		f.add(b2); // 업캐스팅(자동형변환)
		
		버튼1처리클래스 act1 = new 버튼1처리클래스();
		버튼2처리클래스 act2 = new 버튼2처리클래스();
		
		b1.addActionListener(act1);
		b2.addActionListener(act2);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
		JTextArea area = new JTextArea(6, 10);
		area.setFont(font);
		f.add(area);
		area.setBackground(Color.yellow);
		
		f.setVisible(true); // 맨 마지막줄!!!
		
	}
}
