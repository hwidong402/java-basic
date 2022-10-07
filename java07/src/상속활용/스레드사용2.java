package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드사용2 extends JFrame {

	static 스레드사용2 f;
	JLabel lbl1, lbl2, lbl3;
	스레드1 t1;
	스레드2 t2;
	스레드3 t3;
	
	public class 스레드1 extends Thread {
		@Override
		public void run() {
			String[] name = {"홍길동", "김길동", "최길동", "박길동", "고길동"};
			for (int i = 0; i < name.length; i++) {
				lbl1.setText("이름>> " + name[i]);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public class 스레드2 extends Thread {
		@Override
		public void run() {
			String[] img = {"car01.png","car02.png","car03.png"};
			for (int i = 0; i < img.length; i++) {
//				lbl2.setText("이름>> " + img[i]);
				ImageIcon image = new ImageIcon(img[i]);
				lbl2.setIcon(image);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public class 스레드3 extends Thread {
		@Override
		public void run() {
			
			for (int i = 0; i < 5; i++) {
				Date date = new Date();
				lbl3.setText("시각 >> " + date);

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public 스레드사용2() {
		getContentPane().setBackground(Color.cyan);
		setSize(500, 500);
		
		lbl1 = new JLabel();
		lbl2 = new JLabel();
		lbl3 = new JLabel();
		
		add(lbl1, BorderLayout.CENTER);
		add(lbl2, BorderLayout.NORTH);
		add(lbl3, BorderLayout.EAST);
		
		t1 = new 스레드1();
		t2 = new 스레드2();
		t3 = new 스레드3();
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		setVisible(true);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		f = new 스레드사용2();

	}

}
