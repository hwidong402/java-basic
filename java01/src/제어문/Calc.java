package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(400, 450);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\java-workspace\\java01\\calc.jpg"));
		lblNewLabel.setBounds(0, 0, 384, 243);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setBackground(new Color(255, 128, 128));
		lblNewLabel_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_1.setBounds(22, 252, 75, 38);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_1_1.setBackground(new Color(255, 128, 128));
		lblNewLabel_1_1.setBounds(22, 298, 75, 38);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(109, 253, 227, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(109, 298, 227, 38);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("더하기");
		plus.addActionListener(new ActionListener() {
			// 버튼을 클릭했을 때 actionPerformed() 함수가 사용
			public void actionPerformed(ActionEvent arg0) {
				// plus버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다.
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				// 1. 두수를 가지고 오세요. (String)
				String n1 = t1.getText(); // "100" 
				String n2 = t2.getText(); // "200"
				
				// 2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				// 3. 결과를 출력
				// JOptionPane.showMessageDialog(f, n11 + n22);
				f.setTitle("더한 결과는 " + (n11 + n22));
				// result.setText("더한 결과는 " + (n11 + n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
				t1.setForeground(Color.red);
			}
		});
		plus.setBackground(Color.BLACK);
		plus.setForeground(new Color(255, 0, 0));
		plus.setFont(new Font("굴림", Font.BOLD, 27));
		plus.setBounds(32, 348, 128, 53);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("빼기");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// minus버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다.
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요");
				// 1. 두수를 가지고 오세요. (String)
				String m1 = t1.getText(); // "100" 
				String m2 = t2.getText(); // "200"
				
				// 2. 숫자로 변경해서 정수변수에 넣어주세요.
				int m11 = Integer.parseInt(m1);
				int m22 = Integer.parseInt(m2);
				
				// 3. 결과를 출력
				JOptionPane.showMessageDialog(f, m11 - m22);
			}
		});
		minus.setForeground(Color.RED);
		minus.setFont(new Font("굴림", Font.BOLD, 27));
		minus.setBackground(Color.BLACK);
		minus.setBounds(208, 346, 128, 53);
		f.getContentPane().add(minus);
		f.setVisible(true);
	}
}
