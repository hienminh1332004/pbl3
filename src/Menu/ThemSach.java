package Menu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import gdDN.*;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;

public class ThemSach extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane,panelMenu;
	private jT txtTieude,txtTacgia,txtNhaXB,txtNamXB,txtSoluong;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemSach frame = new ThemSach();
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
	public ThemSach() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 686);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(73, 167, 151));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelMenu = new JPanel();
		panelMenu.setBackground(new Color(63, 133, 124));
		panelMenu.setBounds(0, 0, 248, 649);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lbl1 = new JLabel("Quản lý thư viện");
		lbl1.setForeground(new Color(255, 255, 255));
		
		lbl1.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\manager man.png"));
		lbl1.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setVerticalTextPosition(SwingConstants.BOTTOM); // Hiển thị văn bản phía dưới icon
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1.setBounds(33, 23, 148, 124);
		panelMenu.add(lbl1);
		
		JLabel lbl4 = new JLabel("Quản lý mượn-trả sách");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl4.setForeground(new Color(255, 255, 255));
		lbl4.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\icons8-list-48.png"));
		lbl4.setBounds(10, 348, 227, 41);
		panelMenu.add(lbl4);
		
		JLabel lbl2 = new JLabel("Trang chủ");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\home.png"));
		lbl2.setForeground(new Color(255, 255, 255));
		lbl2.setBackground(new Color(255, 255, 255));
		lbl2.setBounds(10, 185, 227, 50);
		panelMenu.add(lbl2);
		
		JLabel lbl3 = new JLabel("Quản lý kho sách");
		lbl3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lbl3.setForeground(new Color(255, 255, 255));
		lbl3.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\book stack.png"));
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl3.setBounds(10, 263, 207, 55);
		panelMenu.add(lbl3);
		
		JLabel lbl5 = new JLabel("Quản lý người mượn");
		lbl5.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\people manage.png"));
		lbl5.setForeground(new Color(255, 255, 255));
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl5.setBounds(10, 420, 227, 55);
		panelMenu.add(lbl5);
		
		JLabel lbl6 = new JLabel("Đăng  xuất");
		lbl6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
	});
	lbl6.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\log out.png"));
	lbl6.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lbl6.setForeground(new Color(255, 255, 255));
	lbl6.setBounds(10, 584, 207, 55);
	panelMenu.add(lbl6);
	
	JLabel lblNewLabel = new JLabel("Thêm sách mới");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblNewLabel.setBounds(269, 30, 210, 39);
	contentPane.add(lblNewLabel);
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(250, 250, 250));
	panel.setBounds(286, 123, 685, 368);
	contentPane.add(panel);
	panel.setLayout(null);
	
	JLabel lblNewLabel_1 = new JLabel("Thông tinh sách");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_1.setBounds(184, 10, 249, 42);
	panel.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("Tiêu đề sách :");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblNewLabel_2.setBounds(16, 89, 106, 42);
	panel.add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("Tác giả :");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblNewLabel_3.setBounds(16, 163, 75, 42);
	panel.add(lblNewLabel_3);
	
	JLabel lblNewLabel_4 = new JLabel("Thể loại :");
	lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblNewLabel_4.setBounds(16, 247, 80, 47);
	panel.add(lblNewLabel_4);
	
	JLabel lblNewLabel_5 = new JLabel("Số lượng :");
	lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblNewLabel_5.setBounds(368, 97, 93, 27);
	panel.add(lblNewLabel_5);
	
	JLabel lblNewLabel_6 = new JLabel("Nhà xuất bản :");
	lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblNewLabel_6.setBounds(368, 163, 111, 27);
	panel.add(lblNewLabel_6);
	
	JLabel lblNewLabel_7 = new JLabel("Năm xuất bản :");
	lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblNewLabel_7.setBounds(368, 247, 111, 42);
	panel.add(lblNewLabel_7);
	
	txtTieude = new jT();
	txtTieude.setFont(new Font("Tahoma", Font.PLAIN, 16));
	txtTieude.setBackground(new Color(250, 250, 250));
	txtTieude.setBorder(new EmptyBorder(20, 3, 5, 30));
	txtTieude.setBounds(120, 79, 208, 45);
	panel.add(txtTieude);
	txtTieude.setColumns(10);
	
	txtTacgia = new jT();
	txtTacgia.setFont(new Font("Tahoma", Font.PLAIN, 16));
	txtTacgia.setBackground(new Color(250, 250, 250));
	txtTacgia.setBorder(new EmptyBorder(20, 3, 5, 30));
	txtTacgia.setBounds(120, 155, 208, 45);
	panel.add(txtTacgia);
	txtTacgia.setColumns(10);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setBounds(120, 262, 208, 21);
	panel.add(comboBox);
	
	txtNhaXB = new jT();
	txtNhaXB.setFont(new Font("Tahoma", Font.PLAIN, 16));
	txtNhaXB.setBackground(new Color(250, 250, 250));
	txtNhaXB.setBorder(new EmptyBorder(20, 3, 5, 30));
	txtNhaXB.setBounds(480, 145, 186, 45);
	panel.add(txtNhaXB);
	txtNhaXB.setColumns(10);
	
	txtNamXB = new jT();
	txtNamXB.setFont(new Font("Tahoma", Font.PLAIN, 16));
	txtNamXB.setBackground(new Color(250, 250, 250));
	txtNamXB.setBorder(new EmptyBorder(20, 3, 5, 30));
	txtNamXB.setBounds(480, 236, 186, 45);
	panel.add(txtNamXB);
	txtNamXB.setColumns(10);
	
	txtSoluong = new jT();
	txtSoluong.setBackground(new Color(250, 250, 250));
	txtSoluong.setBorder(new EmptyBorder(20, 3, 5, 30));
	txtSoluong.setFont(new Font("Tahoma", Font.PLAIN, 18));
	txtSoluong.setBounds(480, 79, 186, 45);
	panel.add(txtSoluong);
	txtSoluong.setColumns(10);
	
	JButton btnThem = new JButton("Thêm");
	btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
	btnThem.setBackground(new Color(250, 250, 250));
	btnThem.setBounds(731, 535, 105, 39);
	contentPane.add(btnThem);
	
	JButton btnNewButton_1 = new JButton("Hủy");
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	btnNewButton_1.setBackground(new Color(250, 250, 250));
	btnNewButton_1.setBounds(866, 535, 105, 39);
	contentPane.add(btnNewButton_1);

	}
}

