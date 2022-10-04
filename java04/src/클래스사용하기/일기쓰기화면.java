package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	// 멤버 변수
	private static JTextField t1;
	private static JTextField t2;
	private static JTextArea t3;

	// 멤버 메서드
	 public void open() {
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘 날짜:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 28));
		lblNewLabel.setBounds(29, 28, 149, 53);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBackground(Color.GREEN);
		t1.setBounds(190, 28, 261, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("오늘 제목:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 28));
		lblNewLabel_1.setBounds(29, 91, 149, 53);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setBackground(Color.GREEN);
		t2.setColumns(10);
		t2.setBounds(190, 91, 261, 53);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				// 자바프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할 때는
				// 프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				// 반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야 한다.
				// try~catch
				try {
					// file.txt와 자바프로그램간 스트림(강물, 연결통로)를 만들어라!
					FileWriter file = new FileWriter(s1 + ".txt");
					// 스트림을 통해서 데이터를 보내라.
					file.write(s1 + "\n"); // \n : 엔터를 넣어준다.
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					// 스트림이 닫힐 때 데이터를 다 보냈다고 인식함.
					file.close();
				} catch (Exception e1) {
					System.out.println("파일에 저장 중 에러발생함.!!!");
				}
			}
		});
		
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(56, 349, 363, 102);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘 내용:");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(29, 154, 149, 53);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextArea();
		t3.setBackground(Color.GREEN);
		t3.setFont(new Font("Monospaced", Font.BOLD, 25));
		t3.setBounds(190, 167, 261, 166);
		f.getContentPane().add(t3);
		

		f.setVisible(true);
	}
}
