import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.dao.productDAO;
import com.dao.salesDAO;
import com.dto.productDTO;
import com.dto.salesDTO;
import com.service.productService;
import com.service.productServiceImpl;
import com.service.salesService;
import com.service.salesServiceImpl;

public class newJFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnYear;
    private JButton btnMonth;
    private JButton btnDay;
    private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newJFrame frame = new newJFrame();
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
	public newJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(181, 49, 243, 163);
		contentPane.add(table);
		
		btnYear = new JButton("YEAR");
		btnYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salesService service = new salesServiceImpl();
				service.setDao(new salesDAO());
				List<salesDTO> list = service.findTy();
				Object[][] data = new Object[list.size()][];
		        for (int i = 0; i < list.size(); i++) {
		        	salesDTO dto = list.get(i);
		            data[i] = new Object[] { dto.getSale_date(), dto.getSum()};
		            Object[] columnNames = { "YEAR", "TOTAL" };
		            DefaultTableModel dm = new DefaultTableModel(data, columnNames);
		    		table.setModel(dm);
		        }
			}
		});
		btnYear.setBounds(27, 49, 142, 37);
		contentPane.add(btnYear);
		
		btnMonth = new JButton("MONTH");
		btnMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salesService service = new salesServiceImpl();
				service.setDao(new salesDAO());
				List<salesDTO> list = service.findTm();
				Object[][] data = new Object[list.size()][];
		        for (int i = 0; i < list.size(); i++) {
		        	salesDTO dto = list.get(i);
		            data[i] = new Object[] { dto.getSale_date(), dto.getSum()}; 
		            Object[] columnNames = { "MONTH", "TOTAL" };
		            DefaultTableModel dm = new DefaultTableModel(data, columnNames);
		    		table.setModel(dm);
		        }
			}
		});
		btnMonth.setBounds(27, 112, 142, 37);
		contentPane.add(btnMonth);
		
		btnDay = new JButton("DAY");
		btnDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salesService service = new salesServiceImpl();
				service.setDao(new salesDAO());
				List<salesDTO> list = service.findTd();
				Object[][] data = new Object[list.size()][];
		        for (int i = 0; i < list.size(); i++) {
		        	salesDTO dto = list.get(i);
		            data[i] = new Object[] { dto.getSale_date(), dto.getSum()}; 
		            Object[] columnNames = { "DAYs", "TOTAL" };
		            DefaultTableModel dm = new DefaultTableModel(data, columnNames);
		    		table.setModel(dm);
		        }
			}
		});
		btnDay.setBounds(27, 175, 142, 37);
		contentPane.add(btnDay);
		
		btnBack = new JButton("뒤로가기");
		btnBack.setBounds(333, 230, 91, 23);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("매출 확인");
		lblNewLabel.setBounds(167, 10, 111, 29);
		contentPane.add(lblNewLabel);
		
		/*
		productService service= new productServiceImpl();
		service.setDao(new productDAO());
		
		List<productDTO> list = service.findAll();
		
		Object[][] data = new Object[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            productDTO dto = list.get(i);
            data[i] = new Object[] { dto.getProduct_id(), dto.getProduct_name(), dto.getPrice(), dto.getDescription(), dto.getStock() }; // 예시로 id, name, price를 넣어주세요.
        }
        Object[] columnNames = { "ID", "Name", "Price","Description","Stock" }; // 열 이름을 필요에 따라 수정해주세요.
		
		
		DefaultTableModel dm = new DefaultTableModel(data, columnNames);
		table.setModel(dm);
		*/
		
	}
}
