package app2;

import java.awt.EventQueue;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class JComponent06_JTable2_event extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponent06_JTable2_event frame = new JComponent06_JTable2_event();
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
	public JComponent06_JTable2_event() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 52, 134, 164);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		// 데이터 추가
//		Vector<String> v = new Vector<>();
		
		String [] header = {"deptno","dname","loc"};
		String [][] obj = {{"10","개발1", "서울1"},{"20","개발2", "서울2"},{"30","개발3", "서울3"}};
		
		DefaultTableModel dm = new DefaultTableModel(obj, header);
		table.setModel(dm);
		
		
		//이벤트 처리
		ListSelectionModel model = table.getSelectionModel();
		model.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel)e.getSource();
				int selectedIndex = lsm.getMinSelectionIndex();
				String [] v = obj[selectedIndex];
				System.out.println(v[0]+"\t"+v[1]+"\t"+v[2]);
				System.out.println(Arrays.toString(v));
			}
		});
		
	}

}
