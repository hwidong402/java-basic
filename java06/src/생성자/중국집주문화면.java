package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중국집주문화면 {
	static int count; // int count = 0; 과 동일, 전역 범수는 자동초기화
	static final int PRICE = 5000; // 상수는 final을 붙여서 변경불가능으로 설정
	private static JTextField t1;
	static int 짬뽕count = 0;
	static int 우동count = 0;
	static int 짜장count = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(803, 606);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(400, 20, 70, 50);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		t1.setBounds(477, 20, 262, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel center = new JLabel("");
		// 라벨에 이미지를 변경하고 싶으면, 이미지부품을 만들고, 라벨에 셋팅
		ImageIcon img = new ImageIcon("짜장면.jpg");
		center.setIcon(img); // 주소
//		Font font = new Font("굴림", Font.BOLD, 20);
//		center.setFont(font);
		center.setFont(new Font("굴림", Font.BOLD, 20));
		center.setBounds(55, 99, 660, 328);
		f.getContentPane().add(center);
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBounds(55, 446, 660, 93);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 주문량을 현재 카운트에 하나 플러스
				짬뽕count++; // count = count + 1;
				// 현재 주문량을 변경
				f.setTitle("짬뽕 : " + 짬뽕count + "개, " + "우동 : " + 우동count + "개, " + "짜장 : " + 짜장count + "개" );
				// center 라벨에 있는 이미지 변경
				// 이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				center.setIcon(icon);
				// result 라벨에 있는 결제 금액 변경
				result.setText("결제금액: " + (짬뽕count * PRICE + 우동count * PRICE + 짜장count * PRICE) + "원");
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton.setBounds(12, 10, 107, 56);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문량을 현재 카운트에 하나 플러스
				우동count++; // count = count + 1;
				// 현재 주문량을 변경
				f.setTitle("짬뽕 : " + 짬뽕count + "개, " + "우동 : " + 우동count + "개, " + "짜장 : " + 짜장count + "개" );
				// center 라벨에 있는 이미지 변경
				// 이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("우동.jpg");
				center.setIcon(icon);
				// result 라벨에 있는 결제 금액 변경
				result.setText("결제금액: " + (짬뽕count * PRICE + 우동count * PRICE + 짜장count * PRICE) + "원");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(131, 10, 107, 56);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("짜장");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문량을 현재 카운트에 하나 플러스
				짜장count++; // count = count + 1;
				// 현재 주문량을 변경
				f.setTitle("짬뽕 : " + 짬뽕count + "개, " + "우동 : " + 우동count + "개, " + "짜장 : " + 짜장count + "개" );
				// center 라벨에 있는 이미지 변경
				// 이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("짜장면.jpg");
				center.setIcon(icon);
				// result 라벨에 있는 결제 금액 변경
				result.setText("결제금액: " + (짬뽕count * PRICE + 우동count * PRICE + 짜장count * PRICE) + "원");
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_1_1.setBackground(Color.CYAN);
		btnNewButton_1_1.setBounds(258, 10, 107, 56);
		f.getContentPane().add(btnNewButton_1_1);
		
		
		f.setVisible(true);
	}
}
