import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class searchRecord extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	
	 DefaultTableModel model;	
	 private JTextField txt_search;
	 
	 //MY CODE
	
	public void setRecordsToTable() {
		
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
	        PreparedStatement pst = con.prepareStatement("select * from fees_details");
	      ResultSet rs = pst.executeQuery();
	      
	      while(rs.next()) {
	    	  String receiptNo = rs.getString("reciept_no");
	    	  String rollno = rs.getString("rollno");
	    	  String studentName = rs.getString("student_name");
	    	  String paymentMode = rs.getString("payment_mode");
	    	  
	    	  Object [] obj = {receiptNo, rollno, studentName, paymentMode};
	    	  
	    	  model = (DefaultTableModel)table.getModel();
	    	  model.addRow(obj);
	    	  
	      }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void search(String str) {
		model = (DefaultTableModel) table.getModel();
		TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
		table.setRowSorter(trs);
		trs.setRowFilter(RowFilter.regexFilter(str));
		
	}

	/**	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchRecord frame = new searchRecord();
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
	public searchRecord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1430, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelsideBar = new JPanel();
		panelsideBar.setLayout(null);
		panelsideBar.setBackground(new Color(0, 51, 51));
		panelsideBar.setBounds(0, 0, 379, 694);
		contentPane.add(panelsideBar);
		
		JPanel panelHome = new JPanel();
		panelHome.setLayout(null);
		panelHome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelHome.setBackground(new Color(0, 51, 51));
		panelHome.setBounds(39, 11, 289, 59);
		panelsideBar.add(panelHome);
		
		JLabel btnHome = new JLabel("HOME");
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnHome.setBounds(48, 0, 212, 59);
		panelHome.add(btnHome);
		
		JPanel panelSearch = new JPanel();
		panelSearch.setLayout(null);
		panelSearch.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelSearch.setBackground(new Color(0, 51, 51));
		panelSearch.setBounds(39, 105, 289, 70);
		panelsideBar.add(panelSearch);
		
		JLabel lblNewLabel_1 = new JLabel("Search");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(31, 0, 248, 70);
		panelSearch.add(lblNewLabel_1);
		
		JPanel panelEdit = new JPanel();
		panelEdit.setLayout(null);
		panelEdit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelEdit.setBackground(new Color(0, 51, 51));
		panelEdit.setBounds(39, 224, 289, 65);
		panelsideBar.add(panelEdit);
		
		JLabel btnEdit = new JLabel("Edit Courses");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnEdit.setBounds(10, 0, 269, 65);
		panelEdit.add(btnEdit);
		
		JPanel panelCourseList = new JPanel();
		panelCourseList.setLayout(null);
		panelCourseList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelCourseList.setBackground(new Color(0, 51, 51));
		panelCourseList.setBounds(39, 333, 289, 59);
		panelsideBar.add(panelCourseList);
		
		JLabel btnCourseList = new JLabel("Course List");
		btnCourseList.setForeground(Color.WHITE);
		btnCourseList.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnCourseList.setBounds(31, 0, 212, 59);
		panelCourseList.add(btnCourseList);
		
		JPanel panelViewAllRecord = new JPanel();
		panelViewAllRecord.setLayout(null);
		panelViewAllRecord.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelViewAllRecord.setBackground(new Color(0, 51, 51));
		panelViewAllRecord.setBounds(39, 428, 289, 70);
		panelsideBar.add(panelViewAllRecord);
		
		JLabel btnViewAllRecord = new JLabel("View All Records");
		btnViewAllRecord.setForeground(Color.WHITE);
		btnViewAllRecord.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnViewAllRecord.setBounds(31, 0, 258, 70);
		panelViewAllRecord.add(btnViewAllRecord);
		
		JPanel panelBack = new JPanel();
		panelBack.setLayout(null);
		panelBack.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelBack.setBackground(new Color(0, 51, 51));
		panelBack.setBounds(39, 536, 289, 70);
		panelsideBar.add(panelBack);
		
		JLabel btnBack = new JLabel("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnBack.setBounds(31, 0, 258, 70);
		panelBack.add(btnBack);
		
		JPanel panelLogout = new JPanel();
		panelLogout.setLayout(null);
		panelLogout.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelLogout.setBackground(new Color(0, 51, 51));
		panelLogout.setBounds(39, 632, 289, 51);
		panelsideBar.add(panelLogout);
		
		JLabel btnLogout = new JLabel("Logout");
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnLogout.setBounds(31, 0, 212, 48);
		panelLogout.add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(378, 0, 992, 694);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Receipt no", "Roll no", "Student Name ", "Course"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Receipt no", "Roll no", "Student Name", "Course"
			}
		));
		table.setBounds(45, 124, 937, 559);
		panel.add(table);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setBounds(804, 59, 112, 33);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Search here");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 25));
		lblNewLabel.setBounds(457, 11, 201, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Search String : ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(329, 70, 154, 26);
		panel.add(lblNewLabel_2);
		
		txt_search = new JTextField();
		txt_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String searchString = txt_search.getText();
				search(searchString);
			}
		});
		txt_search.setBounds(489, 72, 224, 20);
		panel.add(txt_search);
		txt_search.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setRecordsToTable();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 153, 153));
		btnNewButton_1.setForeground(new Color(51, 153, 153));
		btnNewButton_1.setBounds(10, 11, 11, 20);
		panel.add(btnNewButton_1);
	}
}
