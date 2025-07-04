package app2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JComponent04_JTextField extends JFrame {

	private JPanel contentPane;
	private JTextField tfDeptno;
	private JTextField tfDname;
	private JTextField tfLoc;
	JButton btnSave;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponent04_JTextField frame = new JComponent04_JTextField();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JComponent04_JTextField() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfDeptno = new JTextField();
		tfDeptno.setBounds(86, 54, 116, 21);
		contentPane.add(tfDeptno);
		tfDeptno.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("부서번호");
		lblNewLabel.setBounds(12, 57, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("부서명");
		lblNewLabel_1.setBounds(12, 88, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfDname = new JTextField();
		tfDname.setColumns(10);
		tfDname.setBounds(86, 85, 116, 21);
		contentPane.add(tfDname);
		
		JLabel lblNewLabel_2 = new JLabel("부서위치");
		lblNewLabel_2.setBounds(12, 125, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfLoc = new JTextField();
		tfLoc.setColumns(10);
		tfLoc.setBounds(86, 122, 116, 21);
		contentPane.add(tfLoc);
		
		btnSave = new JButton("저장");
		btnSave.setBounds(39, 179, 97, 23);
		contentPane.add(btnSave);
		
		//button 이벤트 처리
	    btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String deptno = tfDeptno.getText();
				String dname = tfDname.getText();
				String loc = tfLoc.getText();
				
				System.out.println(deptno+"\t"+dname+"\t"+loc);
				
			}
		});
		
		
		
	}
}
