import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.result.ResultSetImpl;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;

public class updateFees extends JFrame {

	private JPanel     contentPane;
	private JTextField txt_receiptNo;
	private JTextField txt_DDNo;
	private JTextField txt_BankName;
	private JTextField txt_ChequeNo;
	private JTextField txt_year1;
	private JTextField txt_year2;
	private JTextField txt_courseName;
	private JTextField txt_amount;
	private JTextField txt_cgst;
	private JTextField txt_sgst;
	private JTextField txt_total;
	private JTextField txt_total_words;
	private JTextField txt_receiverFrom;
	private JComboBox  comboCourse;
	private JTextField txt_rollNo;
	private JTextField txt_date;
	private JTextArea txt_remark;
	private JComboBox combo_PaymentMode;
	private JLabel txt_GSTNo;
	
	//START MY CODE //
	
	public boolean validation()
	{
		if(txt_receiverFrom.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this, "please enter user name");
			return false;
		}
		
		if(txt_amount.getText().equals("") || txt_amount.getText().matches("[0-9]+")== false) {
			JOptionPane.showMessageDialog(this, "please enter amount(in numbers)");
			return false;
		}
		
		 if (combo_PaymentMode.getSelectedItem().toString().equalsIgnoreCase("cheque")) {
	    	 
	    	 if(txt_ChequeNo.getText().equals("")) {
	    		 JOptionPane.showMessageDialog(this, "please enter cheque number");
	    		 return false;
	    		 
	    	 }
	    	 if(txt_BankName.getText().equals("")) {
	    		 JOptionPane.showMessageDialog(this, "please enter bank name");
	    		 return false;
	    	 }
	    	 
	     }
          		
		 if(combo_PaymentMode.getSelectedItem().toString().equalsIgnoreCase("dd"))
		 {

		  if(txt_DDNo.getText().equals("")) {
        	  JOptionPane.showMessageDialog(this, "please enter dd no ");
        	  return false;
          }
		 }
	     
	     
		 if(combo_PaymentMode.getSelectedItem().toString().equalsIgnoreCase("card")) {
	    	 if(txt_BankName.getText().equals("")) {
	    		 JOptionPane.showMessageDialog(this, "please enter bank name");
	    		 return false;
	    	 }
	     }
		
		//
		 
		return true;
	}
	 
	// COMBO BOX CONNECTIVITY **
	
	void loadcombo() {
	    try {
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
	        PreparedStatement st1 = con.prepareStatement("select CNAME from course");

	        ResultSet rs = st1.executeQuery();
	        comboCourse.removeAllItems();

	        while (rs.next()) {
	            comboCourse.addItem(rs.getString("CNAME"));
	        }
	        comboCourse.setSelectedItem("");
	        rs.close();
	        st1.close();
	        con.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}	
		//*//
	
	public void setRecords() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=false","root","root");
			PreparedStatement pst = con.prepareStatement("select * from fees_details order by reciept_no desc limit 1");
			ResultSet rs = pst.executeQuery();
			rs.next();
			//txt_reciept_no.setText(rs.getString("receipt_no"));
			}catch(Exception e){
				e.printStackTrace();
		}
	
	}
	
	//END MY CODE
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateFees frame = new updateFees();
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
	public updateFees() {	
		
		
		// MY CODE
		// int receipt_no = getRecieptNo();
        //receipt_no.setText(Integer.toString(receipt_no));
		//END CODE
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelsideBar = new JPanel();
		panelsideBar.setBackground(new Color(0, 51, 51));
		panelsideBar.setBounds(0, 0, 379, 694);
		contentPane.add(panelsideBar);
		panelsideBar.setLayout(null);
		
		JPanel panelHome = new JPanel();
		panelHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,153,153);
				panelHome.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,103,103);
				panelHome.setBackground(clr);
			}
		});
		panelHome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelHome.setBackground(new Color(0, 51, 51));
		panelHome.setBounds(39, 11, 289, 59);
		panelsideBar.add(panelHome);
		panelHome.setLayout(null);
		
		JLabel btnHome = new JLabel("HOME");
		btnHome.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\home.png"));
		btnHome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnHome.setForeground(Color.WHITE);
		btnHome.setBounds(48, 0, 212, 59);
		panelHome.add(btnHome);
		
		JPanel panelSearch = new JPanel();
		panelSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,153,153);
				panelSearch.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,103,103);
				panelSearch.setBackground(clr);
			}
		});
		panelSearch.setLayout(null);
		panelSearch.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelSearch.setBackground(new Color(0, 51, 51));
		panelSearch.setBounds(39, 105, 289, 70);
		panelsideBar.add(panelSearch);
		
		JLabel lblNewLabel_1 = new JLabel("Search");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\search2.png"));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(31, 0, 248, 70);
		panelSearch.add(lblNewLabel_1);
		
		JPanel panelEdit = new JPanel();
		panelEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,103,103);
				panelEdit.setBackground(clr);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,153,153);
				panelEdit.setBackground(clr);
			}
		});
		panelEdit.setLayout(null);
		panelEdit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelEdit.setBackground(new Color(0, 51, 51));
		panelEdit.setBounds(39, 224, 289, 65);
		panelsideBar.add(panelEdit);
		
		JLabel btnEdit = new JLabel("Edit Courses");
		btnEdit.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\edit.png"));
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnEdit.setBounds(10, 0, 269, 65);
		panelEdit.add(btnEdit);
		
		JPanel panelCourseList = new JPanel();
		panelCourseList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,153,153);
				panelCourseList.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,103,103);
				panelCourseList.setBackground(clr);
			}
		});
		panelCourseList.setLayout(null);
		panelCourseList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelCourseList.setBackground(new Color(0, 51, 51));
		panelCourseList.setBounds(39, 333, 289, 59);
		panelsideBar.add(panelCourseList);
		
		JLabel btnCourseList = new JLabel("Course List");
		btnCourseList.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\list_1.png"));
		btnCourseList.setForeground(Color.WHITE);
		btnCourseList.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnCourseList.setBounds(31, 0, 212, 59);
		panelCourseList.add(btnCourseList);
		
		JPanel panelViewAllRecord = new JPanel();
		panelViewAllRecord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,153,153);
				panelViewAllRecord.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,103,103);
				panelViewAllRecord.setBackground(clr);
			}
		});
		panelViewAllRecord.setLayout(null);
		panelViewAllRecord.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelViewAllRecord.setBackground(new Color(0, 51, 51));
		panelViewAllRecord.setBounds(39, 428, 289, 70);
		panelsideBar.add(panelViewAllRecord);
		
		JLabel btnViewAllRecord = new JLabel("View All Records");
		btnViewAllRecord.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\view all record.png"));
		btnViewAllRecord.setForeground(Color.WHITE);
		btnViewAllRecord.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnViewAllRecord.setBounds(31, 0, 258, 70);
		panelViewAllRecord.add(btnViewAllRecord);
		
		JPanel panelBack = new JPanel();
		panelBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,153,153);
				panelBack.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,103,103);
				panelBack.setBackground(clr);
			}
		});
		panelBack.setLayout(null);
		panelBack.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelBack.setBackground(new Color(0, 51, 51));
		panelBack.setBounds(39, 536, 289, 70);
		panelsideBar.add(panelBack);
		
		JLabel btnBack = new JLabel("Back");
		btnBack.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\back-button.png"));
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnBack.setBounds(31, 0, 258, 70);
		panelBack.add(btnBack);
		
		JPanel panelLogout = new JPanel();
		panelLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,153,153);
				panelLogout.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,103,103);
				panelLogout.setBackground(clr);
			}
		});
		panelLogout.setLayout(null);
		panelLogout.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelLogout.setBackground(new Color(0, 51, 51));
		panelLogout.setBounds(39, 632, 289, 51);
		panelsideBar.add(panelLogout);
		
		JLabel btnLogout = new JLabel("Logout");
		btnLogout.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\logout.png"));
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnLogout.setBounds(31, 0, 212, 48);
		panelLogout.add(btnLogout);
		
		JPanel panelParent = new JPanel();
		panelParent.setBackground(new Color(0, 102, 102));
		panelParent.setBounds(379, 0, 1001, 694);
		contentPane.add(panelParent);
		panelParent.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Receipt No :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(51, 11, 93, 17);
		panelParent.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Mode Of Payment :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(51, 51, 132, 17);
		panelParent.add(lblNewLabel_2);
		
		JLabel lbl_DDno = new JLabel("DD No :");
		lbl_DDno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_DDno.setBounds(51, 91, 100, 17);
		panelParent.add(lbl_DDno);
		
		JLabel lbl_chequeNo = new JLabel("Cheque No :");
		lbl_chequeNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_chequeNo.setBounds(51, 91, 110, 17);
		panelParent.add(lbl_chequeNo);
		
		JLabel lbl_bankName = new JLabel("Bank Name :");
		lbl_bankName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_bankName.setBounds(51, 129, 110, 17);
		panelParent.add(lbl_bankName);
		
		JLabel date1 = new JLabel("Date :");
		date1.setFont(new Font("Tahoma", Font.BOLD, 14));
		date1.setBounds(518, 35, 54, 17);
		panelParent.add(date1);
		
		JLabel lblNewLabel_2_3 = new JLabel("GST :");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(518, 82, 82, 17);
		panelParent.add(lblNewLabel_2_3);
		
		txt_GSTNo = new JLabel("tuvyju");
		txt_GSTNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt_GSTNo.setBounds(594, 82, 132, 17);
		panelParent.add(txt_GSTNo);
		
		txt_receiptNo = new JTextField();
		txt_receiptNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_receiptNo.setColumns(10);
		txt_receiptNo.setBounds(194, 8, 146, 20);
		panelParent.add(txt_receiptNo);
		
		txt_DDNo = new JTextField();
		txt_DDNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_DDNo.setColumns(10);
		txt_DDNo.setBounds(199, 88, 141, 20);
		panelParent.add(txt_DDNo);
		
		txt_BankName = new JTextField();
		txt_BankName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_BankName.setColumns(10);
		txt_BankName.setBounds(194, 126, 144, 20);
		panelParent.add(txt_BankName);
		
		txt_ChequeNo = new JTextField();
		txt_ChequeNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_ChequeNo.setColumns(10);
		txt_ChequeNo.setBounds(194, 88, 137, 20);
		panelParent.add(txt_ChequeNo);
		
		JComboBox combo_PaymentMode = new JComboBox();
		combo_PaymentMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//START MY CODE //
				if(combo_PaymentMode.getSelectedIndex()==0)
				{
					lbl_DDno.setVisible(true);
					txt_DDNo.setVisible(true);
					lbl_chequeNo.setVisible(false);
					txt_ChequeNo.setVisible(false);
					lbl_bankName.setVisible(true);
					txt_BankName.setVisible(true);
					
					}
				
				if(combo_PaymentMode.getSelectedIndex()==1)
				{
					lbl_DDno.setVisible(false);
					txt_DDNo.setVisible(false);
					lbl_chequeNo.setVisible(true);
					txt_ChequeNo.setVisible(true);
					lbl_bankName.setVisible(true);
					txt_BankName.setVisible(true);
					
					}
				
				if(combo_PaymentMode.getSelectedIndex()==2)
				{
					lbl_DDno.setVisible(false);
					txt_DDNo.setVisible(false);
					lbl_chequeNo.setVisible(false);
					txt_ChequeNo.setVisible(false);
					lbl_bankName.setVisible(false);
					txt_BankName.setVisible(false);
					
					}
				
				if(combo_PaymentMode.getSelectedIndex()==3)
				{
					lbl_DDno.setVisible(false);
					txt_DDNo.setVisible(false);
					lbl_chequeNo.setVisible(false);
					txt_ChequeNo.setVisible(false);
					lbl_bankName.setVisible(true);
					txt_BankName.setVisible(true);
					
					}
				
				
				//END MY CODE
			}
		});
		combo_PaymentMode.setFont(new Font("Tahoma", Font.PLAIN, 17));
		combo_PaymentMode.setModel(new DefaultComboBoxModel(new String[] {"DD", "Cheque", "Cash", "Card"}));
		combo_PaymentMode.setSelectedIndex(2);
		combo_PaymentMode.setBounds(193, 47, 147, 22);
		panelParent.add(combo_PaymentMode);
		
		JPanel panelChild = new JPanel();
		panelChild.setBounds(0, 157, 991, 537);
		panelParent.add(panelChild);
		panelChild.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Received From :");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(49, 26, 110, 17);
		panelChild.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("The following payment in the college office for the year ");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(49, 73, 386, 17);
		panelChild.add(lblNewLabel_2_1_1_1);
		
		txt_year1 = new JTextField();
		txt_year1.setBounds(470, 73, 86, 20);
		panelChild.add(txt_year1);
		txt_year1.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("to");
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_2.setBounds(574, 76, 28, 17);
		panelChild.add(lblNewLabel_2_1_1_2);
		
		txt_year2 = new JTextField();
		txt_year2.setColumns(10);
		txt_year2.setBounds(612, 73, 86, 20);
		panelChild.add(txt_year2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Course");
		lblNewLabel_2_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3.setBounds(61, 123, 70, 17);
		panelChild.add(lblNewLabel_2_1_1_3);
		
		comboCourse = new JComboBox();
		loadcombo();
		comboCourse.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboCourse.setBounds(167, 123, 243, 29);
		
		panelChild.add(comboCourse);
		
		JLabel lblNewLabel_2_1_1_3_1 = new JLabel("Roll No :");
		lblNewLabel_2_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3_1.setBounds(556, 126, 70, 17);
		panelChild.add(lblNewLabel_2_1_1_3_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 176, 991, 17);
		panelChild.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 213, 991, 17);
		panelChild.add(separator_1);
		
		JLabel lblNewLabel_2_1_1_3_2 = new JLabel("Sr.No :");
		lblNewLabel_2_1_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3_2.setBounds(10, 186, 70, 17);
		panelChild.add(lblNewLabel_2_1_1_3_2);
		
		JLabel lblNewLabel_2_1_1_3_3 = new JLabel("Head");
		lblNewLabel_2_1_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3_3.setBounds(250, 186, 70, 17);
		panelChild.add(lblNewLabel_2_1_1_3_3);
		
		JLabel lblNewLabel_2_1_1_3_4 = new JLabel("Amount");
		lblNewLabel_2_1_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3_4.setBounds(806, 189, 70, 17);
		panelChild.add(lblNewLabel_2_1_1_3_4);
		
		txt_courseName = new JTextField();
		txt_courseName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_courseName.setText(comboCourse.getSelectedItem().toString());
			}
		});
		txt_courseName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_courseName.setColumns(10);
		txt_courseName.setBounds(250, 228, 306, 20);
		panelChild.add(txt_courseName);
		
		txt_amount = new JTextField();
		txt_amount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float amnt = Float.parseFloat(txt_amount.getText());
				
				Float cgst = (float)(amnt * 0.09);
				Float sgst = (float)(amnt * 0.09);
				
				txt_cgst.setText(cgst.toString());
				txt_sgst.setText(sgst.toString());
				
				float total = amnt + cgst + sgst;
				
				
				txt_total.setText(Float.toString(total));
				
				txt_total_words.setText(NumberToWordsConverter.convert((int)total)+" Only");
				
			}
		});
		txt_amount.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_amount.setColumns(10);
		txt_amount.setBounds(746, 228, 154, 20);
		panelChild.add(txt_amount);
		
		txt_cgst = new JTextField();
		txt_cgst.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_cgst.setColumns(10);
		txt_cgst.setBounds(746, 262, 154, 20);
		panelChild.add(txt_cgst);
		
		txt_sgst = new JTextField();
		txt_sgst.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_sgst.setColumns(10);
		txt_sgst.setBounds(746, 304, 154, 20);
		panelChild.add(txt_sgst);
		
		txt_total = new JTextField();
		txt_total.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_total.setColumns(10);
		txt_total.setBounds(746, 354, 154, 20);
		panelChild.add(txt_total);
		
		JLabel lblNewLabel_2_1_1_3_5 = new JLabel("CGST 9%");
		lblNewLabel_2_1_1_3_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3_5.setBounds(286, 259, 70, 17);
		panelChild.add(lblNewLabel_2_1_1_3_5);
		
		JLabel lblNewLabel_2_1_1_3_6 = new JLabel("SGST 9%");
		lblNewLabel_2_1_1_3_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3_6.setBounds(286, 307, 70, 17);
		panelChild.add(lblNewLabel_2_1_1_3_6);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(705, 335, 211, 10);
		panelChild.add(separator_2);
		
		txt_total_words = new JTextField();
		txt_total_words.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_total_words.setColumns(10);
		txt_total_words.setBounds(250, 389, 431, 20);
		panelChild.add(txt_total_words);
		
		JLabel lblNewLabel_2_1_1_3_7 = new JLabel("Total in Words :");
		lblNewLabel_2_1_1_3_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3_7.setBounds(72, 392, 110, 17);
		panelChild.add(lblNewLabel_2_1_1_3_7);
		
		JLabel lblNewLabel_2_1_1_3_6_1 = new JLabel("Remark :");
		lblNewLabel_2_1_1_3_6_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3_6_1.setBounds(72, 471, 70, 17);
		panelChild.add(lblNewLabel_2_1_1_3_6_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(727, 448, 211, 2);
		panelChild.add(separator_2_1);
		
		JLabel lblNewLabel_2_1_1_3_6_2 = new JLabel("Receiver Signature");
		lblNewLabel_2_1_1_3_6_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_3_6_2.setBounds(777, 474, 129, 17);
		panelChild.add(lblNewLabel_2_1_1_3_6_2);
		
		JButton btn_print = new JButton("Submit");
		btn_print.setBackground(UIManager.getColor("Button.disabledForeground"));
		btn_print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				
			
				
				String recieptNo = txt_receiptNo.getText();
				String studentName = txt_receiverFrom.getText();
				String rollNo = txt_rollNo.getText();
				String paymentMode = combo_PaymentMode.getSelectedItem().toString();
				String chequeNo = txt_ChequeNo.getText();
				String bankName = txt_BankName.getText();
				String ddNo = txt_DDNo.getText();
				String courseName = txt_courseName.getText();
				String gstin = txt_GSTNo.getText();
				String totalAmount = txt_total.getText();
				String date = txt_date.getText();
				String iniAmount = txt_amount.getText();
				String cgst = txt_cgst.getText();
				String sgst = txt_sgst.getText();
				String totalInWords = txt_total_words.getText();
				String remark = txt_remark.getText();
				String year1 = txt_year1.getText();
				String year2 = txt_year2.getText();
				
				
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=false","root","root");
					PreparedStatement pst = con.prepareStatement("insert into fees_details(reciept_no,student_name,payment_mode,cheque_no,bank_name,dd_no,courses,gstin,total_amount,amount,cgst,sgst,toatl_in_words,remark,year1,year2,date,rollno) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					
					pst.setString(1, recieptNo);
					pst.setString(2,studentName);
					pst.setString(3, paymentMode);
					pst.setString(4, chequeNo);
					pst.setString (5,bankName);
					pst.setString(6, ddNo);
					pst.setString(7,courseName);
					pst.setString(8, gstin);
					pst.setString(9, totalAmount);
					pst.setString(10,iniAmount);
					pst.setString(11,cgst);
					pst.setString(12,sgst);
					pst.setString(13,totalInWords);
					pst.setString(14,remark);
					pst.setString(15, year1);
					pst.setString(16, year2);
					pst.setString(17,date);
					pst.setString(18, rollNo);

					int i = pst.executeUpdate();
					if(i==1) {
						
					 validation();

					    JOptionPane.showMessageDialog(null, "Registration successful");
						
						PrintReceipt pp = new PrintReceipt();
						pp.setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(null, "Registration not successful");
					}
					con.close();
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				 
			}
		});
		btn_print.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_print.setBounds(483, 468, 97, 36);
		panelChild.add(btn_print);
		
		txt_remark = new JTextArea();
		txt_remark.setBackground(UIManager.getColor("Button.shadow"));
		txt_remark.setBounds(167, 458, 223, 46);
		panelChild.add(txt_remark);
		
		txt_receiverFrom = new JTextField();
		txt_receiverFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_receiverFrom.setColumns(10);
		txt_receiverFrom.setBounds(192, 26, 388, 20);
		panelChild.add(txt_receiverFrom);
		
		txt_rollNo = new JTextField();
		txt_rollNo.setBounds(636, 123, 86, 20);
		panelChild.add(txt_rollNo);
		txt_rollNo.setColumns(10);
		
		txt_date = new JTextField();
		txt_date.setBounds(582, 35, 144, 20);
		panelParent.add(txt_date);
		txt_date.setColumns(10);
		
	}
}
