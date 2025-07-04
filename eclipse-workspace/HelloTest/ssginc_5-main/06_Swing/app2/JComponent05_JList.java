package app2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JComponent05_JList extends JFrame {

	private JPanel contentPane;
	JList jList;
	
	// JList에서 보여줄 데이터(모델)를 관리하는 클래스
	// java.util.Vector 상속받은 모델 클래스.
	DefaultListModel<String> listModel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField;
	
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
		
		jList = new JList();
		jList.setBounds(32, 36, 172, 198);
		//contentPane.add(jList);
		
		// Model 생성
		listModel = new DefaultListModel<>();
		listModel.addElement("홍길동1");
		listModel.addElement("홍길동2");
		listModel.addElement("홍길동3");
		listModel.addElement("홍길동4");
		listModel.addElement("홍길동5");
	
		
		jList.setModel(listModel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(233,36,172,198);
		contentPane.add(scrollPane);
		
		// JScrollPane에 JList 추가
		scrollPane.setViewportView(jList);
		
		btnNewButton = new JButton("저장");
		btnNewButton.setBounds(50, 51, 97, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("삭제");
		btnNewButton_1.setBounds(50, 97, 97, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(50, 147, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//저장
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				listModel.addElement(name);
			}
		});
		
		//삭제
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				if(listModel.contains(name)) {
					listModel.removeElement(name);
				}
			}
		});
		
		
		
		
		
		
		//이벤트 처리
		jList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				JList<String> jList = (JList)e.getSource();
				System.out.println(jList.getSelectedIndex()+"\t"+ jList.getSelectedValue());
			}
		});
		
		
	}
}
