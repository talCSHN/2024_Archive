package app2;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class JComponent02_JCheckBox extends JFrame implements ItemListener {

	private JPanel contentPane;
	JCheckBox ch1;
	JCheckBox ch2;
	JCheckBox ch3;
	JLabel lblResult;
	Set<String> set;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponent02_JCheckBox frame = new JComponent02_JCheckBox();
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
	public JComponent02_JCheckBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 ch1 = new JCheckBox("야구");
		ch1.setBounds(34, 34, 115, 23);
		contentPane.add(ch1);
		
		 ch2 = new JCheckBox("축구");
		ch2.setBounds(34, 74, 115, 23);
		contentPane.add(ch2);
		
		 ch3 = new JCheckBox("농구");
		ch3.setBounds(34, 119, 115, 23);
		contentPane.add(ch3);
		
		lblResult = new JLabel("New label");
		lblResult.setBounds(34, 176, 279, 15);
		contentPane.add(lblResult);
		
		//이벤트 설정
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		
		
		set = new HashSet<>();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox xxx =(JCheckBox)e.getSource();
		System.out.println(xxx.getActionCommand()+"\t"+e.getStateChange());
		String key = xxx.getActionCommand();
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			set.add(key);
		}else {
			set.remove(key);
		}
	
		lblResult.setText(set.toString());
		
	}
}


