package app2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class JComponent03_JRadioButton extends JFrame implements ActionListener{

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton r1;
	JRadioButton r2;
	JRadioButton r3;
	JLabel lblResult;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponent03_JRadioButton frame = new JComponent03_JRadioButton();
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
	public JComponent03_JRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 r1 = new JRadioButton("야구");
		buttonGroup.add(r1);
		r1.setBounds(64, 59, 121, 23);
		contentPane.add(r1);
		
		 r2 = new JRadioButton("축구");
		buttonGroup.add(r2);
		r2.setBounds(64, 96, 121, 23);
		contentPane.add(r2);
		
		 r3 = new JRadioButton("농구");
		buttonGroup.add(r3);
		r3.setBounds(64, 142, 121, 23);
		contentPane.add(r3);
		
		 lblResult = new JLabel("New label");
		lblResult.setBounds(64, 191, 57, 15);
		contentPane.add(lblResult);
		
		//이벤트 설정
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String key  = e.getActionCommand();
		JRadioButton xxx = (JRadioButton)e.getSource();
		
		System.out.println(xxx.getText());
		lblResult.setText(xxx.getText());
	}
}
