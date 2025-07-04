package app2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


public class JComponent01_JButton3_익명클래스 extends JFrame {

	private JPanel contentPane;
	JButton btnOK;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponent01_JButton3_익명클래스 frame = new JComponent01_JButton3_익명클래스();
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
	public JComponent01_JButton3_익명클래스() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		btnOK = new JButton("ok");
		contentPane.add(btnOK);
		
		//3. 익명 클래스로 이벤트 처리
		// 이벤트소스.addXXXListener(값);
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>>"+ e.getActionCommand());
				System.out.println("OK");
			}
		});
		
		//btnOK.addActionListener(e -> System.out.println("OK2"));
	}//end 생성자


}
