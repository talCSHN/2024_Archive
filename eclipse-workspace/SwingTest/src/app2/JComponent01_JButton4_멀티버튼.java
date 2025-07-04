package app2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class JComponent01_JButton4_멀티버튼 extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnOK;
	JButton btnCancel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponent01_JButton4_멀티버튼 frame = new JComponent01_JButton4_멀티버튼();
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
	public JComponent01_JButton4_멀티버튼() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnOK = new JButton("OK");
		contentPane.add(btnOK);
		
		JButton btnCancel = new JButton("cancel");
		contentPane.add(btnCancel);
		
		btnOK.addActionListener(this);
		btnCancel.addActionListener(this);
		
		

	}//end 생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getActionCommand());
		//System.out.println(e.getSource());
		
		if("OK".equals(e.getActionCommand())) {
			System.out.println("OK");
		}else {
			System.out.println("Cancel");
			// 버튼의 레이블 변경
			JButton xxx = (JButton)e.getSource();
			xxx.setText("CANCEL");
			xxx.setBackground(Color.RED);
		}
		
	}

}
