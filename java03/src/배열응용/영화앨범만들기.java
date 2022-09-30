package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class 영화앨범만들기 {

	// 전체영역에서 특정한 변수를 사용하려면 
	// 클래스 아래에 선언해야한다.
	static int start = 2; // 전역변수
	
	public static void main(String[] args) {
		// 영화
		String[] title = {"인생은 아름다워", "정직한 후보2", "공조2:인터내셔날", "극장판 헬로카봇:수상한 마술단의 비밀", "극장판 짱구는 못말려: 수수께끼! 꽃피는 천하 떡잎 학교"};
		
		// 포스터파일(파일이름)
		String[] img = {"인생.jpg", "정직.jpg", "공조.jpg", "카봇.jpg", "짱구.jpg"};
		
		// 평점
		double[] jumsu = {8.87, 7.85, 8.03, 9.09, 9.44};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setBackground(Color.WHITE);
		f.setSize(730, 560);
		
		JLabel top = new JLabel("공조2:인터내셔날");
		top.setBackground(Color.YELLOW);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel("8.03");
		under.setBackground(Color.YELLOW);
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// <<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면,
				// actionPerformed() 함수안에 넣어주세요.
				// 제목이 표시된 라벨에 제목을 변경해야함.
				
				if (start > 0) {
					start = start - 1; // 1 = 2 - 1
					top.setText(title[start]); // title[1]
					under.setText(jumsu[start] + "점");
					// 변경된 이미지 부품 다시 만들어야 함.
					// 가운데 라벨에 변경된 이미지 부품을 넣으세요.
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝입니다.");
				}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (start < 4) {
					start++; // start = start + 1;
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					// 변경된 이미지 부품 다시 만들어야 함.
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다.");
				}
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
		

	}

}
