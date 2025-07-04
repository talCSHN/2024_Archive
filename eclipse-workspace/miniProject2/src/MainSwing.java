import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

import com.dao.UserProductDAO;
import com.dto.UserProductDTO;
import com.service.UserProductService;
import com.service.UserProductServiceImpl;
import javax.swing.JToolBar;
import javax.swing.JScrollBar;

public class MainSwing extends JFrame {

    private JPanel contentPane;
    private JTextField tfProductName;
    private JButton btnShowAll;
    private JButton btnSearch;
    private JTextArea textArea;
    private UserProductService productService;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainSwing frame = new MainSwing();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainSwing() {
        productService = new UserProductServiceImpl(); // UserProductService 인스턴스 생성 및 초기화
        productService.setDao(new UserProductDAO()); // UserProductDAO 객체 설정
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 932, 407);
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblProductName = new JLabel("상품 이름");
        lblProductName.setBounds(6, 109, 80, 20);
        contentPane.add(lblProductName);

        tfProductName = new JTextField();
        tfProductName.setBounds(6, 139, 116, 32);
        contentPane.add(tfProductName);
        tfProductName.setColumns(10);

        btnShowAll = new JButton("전체 상품 조회");
        btnShowAll.setBounds(6, 10, 116, 52);
        contentPane.add(btnShowAll);

        btnSearch = new JButton("상품 검색");
        btnSearch.setBounds(6, 181, 116, 58);
        contentPane.add(btnSearch);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(183, 10, 716, 347);
        contentPane.add(scrollPane);
        
                textArea = new JTextArea();
                scrollPane.setViewportView(textArea);
                
                JButton btnNewButton = new JButton("장바구니 담기");
                btnNewButton.setBounds(6, 272, 116, 52);
                contentPane.add(btnNewButton);

        // 버튼 클릭 이벤트 처리
        btnShowAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayAllProducts();
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchProduct();
            }
        });
    }

    private void displayAllProducts() {
        List<UserProductDTO> products = productService.findAllProduct();
        if (products.isEmpty()) {
            textArea.setText("상품이 존재하지 않습니다.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("전체 상품 목록:\n");
            for (UserProductDTO product : products) {
                sb.append(product.toString()).append("\n");
            }
            textArea.setText(sb.toString());
        }
    }

    private void searchProduct() {
        String productName = tfProductName.getText();
        List<UserProductDTO> products = productService.findByProductName(productName);
        if (products.isEmpty()) {
            textArea.setText("검색된 상품이 존재하지 않습니다.");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("검색된 상품 목록:\n");
            for (UserProductDTO product : products) {
                sb.append(product.toString()).append("\n");
            }
            textArea.setText(sb.toString());
        }
    }
}
