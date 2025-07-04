package app2;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class JComponent05_JList extends JFrame {

	private JPanel contentPane;
	JList Jlist;
	
	// JList에서 보여줄 데이터(모델)를 관리하는 클래스
	// java.util.Vector 상속받은 모델 클래스
	DefaultListModel<String> listModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponent05_JList frame = new JComponent05_JList();
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
	public JComponent05_JList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
		JList list = new JList();
		list.setBounds(69, 64, 1, 1);
		contentPane.add(Jlist);
		
		// Model 생성
		listModel = new DefaultListModel<>();
		listModel.addElement("홍길동1");
		listModel.addElement("홍길동2");
		listModel.addElement("홍길동3");
		listModel.addElement("홍길동4");
		listModel.addElement("홍길동5");
		
		JList.setModel(listModel);
	}
}
