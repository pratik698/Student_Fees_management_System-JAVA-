import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrintReceipt extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel_6 = new JLabel("Print Receipt");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintReceipt frame = new PrintReceipt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 ```*/
	public PrintReceipt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1384, 740);
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
		panelHome.setBounds(39, 11, 289, 44);
		panelsideBar.add(panelHome);
		
		JLabel btnHome = new JLabel("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home H = new home();
				H.setVisible(true);
				//this.dispose();
				
			}
		});
		btnHome.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\home.png"));
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnHome.setBounds(48, 0, 212, 44);
		panelHome.add(btnHome);
		
		JPanel panelSearch = new JPanel();
		panelSearch.setLayout(null);
		panelSearch.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelSearch.setBackground(new Color(0, 51, 51));
		panelSearch.setBounds(39, 72, 289, 51);
		panelsideBar.add(panelSearch);
		
		JLabel lblNewLabel_1 = new JLabel("Search");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				searchRecord sr = new searchRecord();
				sr.setVisible(true);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\search2.png"));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(31, 0, 248, 51);
		panelSearch.add(lblNewLabel_1);
		
		JPanel panelEdit = new JPanel();
		panelEdit.setLayout(null);
		panelEdit.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelEdit.setBackground(new Color(0, 51, 51));
		panelEdit.setBounds(39, 148, 289, 44);
		panelsideBar.add(panelEdit);
		
		JLabel btnEdit = new JLabel("Edit Courses");
		btnEdit.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\edit.png"));
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnEdit.setBounds(10, 0, 269, 41);
		panelEdit.add(btnEdit);
		
		JPanel panelCourseList = new JPanel();
		panelCourseList.setLayout(null);
		panelCourseList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelCourseList.setBackground(new Color(0, 51, 51));
		panelCourseList.setBounds(39, 223, 289, 44);
		panelsideBar.add(panelCourseList);
		
		JLabel btnCourseList = new JLabel("Course List");
		btnCourseList.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\list_1.png"));
		btnCourseList.setForeground(Color.WHITE);
		btnCourseList.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnCourseList.setBounds(31, 0, 212, 48);
		panelCourseList.add(btnCourseList);
		
		JPanel panelViewAllRecord = new JPanel();
		panelViewAllRecord.setLayout(null);
		panelViewAllRecord.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelViewAllRecord.setBackground(new Color(0, 51, 51));
		panelViewAllRecord.setBounds(39, 303, 289, 44);
		panelsideBar.add(panelViewAllRecord);
		
		JLabel btnViewAllRecord = new JLabel("View All Records");
		btnViewAllRecord.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\view all record.png"));
		btnViewAllRecord.setForeground(Color.WHITE);
		btnViewAllRecord.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnViewAllRecord.setBounds(31, 0, 258, 48);
		panelViewAllRecord.add(btnViewAllRecord);
		
		JPanel panelBack = new JPanel();
		panelBack.setLayout(null);
		panelBack.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelBack.setBackground(new Color(0, 51, 51));
		panelBack.setBounds(39, 379, 289, 44);
		panelsideBar.add(panelBack);
		
		JLabel btnBack = new JLabel("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddFees af = new AddFees();
				af.setVisible(true);
			}
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\back-button.png"));
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnBack.setBounds(31, 0, 258, 44);
		panelBack.add(btnBack);
		
		JPanel panelLogout = new JPanel();
		panelLogout.setLayout(null);
		panelLogout.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelLogout.setBackground(new Color(0, 51, 51));
		panelLogout.setBounds(39, 457, 289, 44);
		panelsideBar.add(panelLogout);
		
		JLabel btnLogout = new JLabel("Logout");
		btnLogout.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\logout.png"));
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnLogout.setBounds(31, 0, 212, 38);
		panelLogout.add(btnLogout);
		
		JPanel panelLogout_1 = new JPanel();
		panelLogout_1.setLayout(null);
		panelLogout_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelLogout_1.setBackground(new Color(0, 51, 51));
		panelLogout_1.setBounds(39, 530, 289, 44);
		panelsideBar.add(panelLogout_1);
		
		JLabel buttPrint = new JLabel("Print");
		buttPrint.addMouseListener(new MouseAdapter() {
		});
		
		buttPrint.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\printer-.png"));
		buttPrint.setForeground(Color.WHITE);
		buttPrint.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		buttPrint.setBounds(31, 0, 212, 38);
		panelLogout_1.add(buttPrint);
		
		JPanel panelLogout_1_1 = new JPanel();
		panelLogout_1_1.setLayout(null);
		panelLogout_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(255, 255, 255), null, null));
		panelLogout_1_1.setBackground(new Color(0, 51, 51));
		panelLogout_1_1.setBounds(39, 600, 289, 51);
		panelsideBar.add(panelLogout_1_1);
		
		JLabel btn_edit_1 = new JLabel("Edit");
		btn_edit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updateFees update = new updateFees();
				update.setVisible(true);
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btn_edit_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\edit.png"));
		btn_edit_1.setForeground(Color.WHITE);
		btn_edit_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn_edit_1.setBounds(10, 0, 269, 58);
		panelLogout_1_1.add(btn_edit_1);
		
		JPanel printpage = new JPanel();
		printpage.setBounds(376, 38, 982, 652);
		contentPane.add(printpage);
		printpage.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Dr D. Y. Patil College , Pune");
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel_4.setBounds(371, 39, 376, 42);
		printpage.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Near railway Station , varale road, talegaon");
		lblNewLabel_5.setForeground(Color.DARK_GRAY);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(371, 92, 334, 27);
		printpage.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\clg_1.png"));
		lblNewLabel.setBounds(162, 0, 194, 161);
		printpage.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 102));
		panel.setBounds(10, 172, 972, 5);
		printpage.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Receipt no :");
		lblNewLabel_2.setForeground(new Color(102, 0, 102));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(31, 188, 113, 20);
		printpage.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Payment Mode :");
		lblNewLabel_2_1.setForeground(new Color(102, 0, 102));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(30, 219, 131, 20);
		printpage.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("cheque_dd :");
		lblNewLabel_2_2.setForeground(new Color(102, 0, 102));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_2.setBounds(31, 250, 113, 20);
		printpage.add(lblNewLabel_2_2);
		
		JLabel txt_cheque_dd = new JLabel("chequeNo :");
		txt_cheque_dd.setForeground(new Color(102, 0, 102));
		txt_cheque_dd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_cheque_dd.setBounds(192, 250, 113, 20);
		printpage.add(txt_cheque_dd);
		
		JLabel txt_cheque_dd_1 = new JLabel("Bank Name :");
		txt_cheque_dd_1.setForeground(new Color(102, 0, 102));
		txt_cheque_dd_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_cheque_dd_1.setBounds(31, 281, 113, 20);
		printpage.add(txt_cheque_dd_1);
		
		JLabel txt_cheque_dd_2 = new JLabel("Receive From :");
		txt_cheque_dd_2.setForeground(new Color(102, 0, 102));
		txt_cheque_dd_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_cheque_dd_2.setBounds(31, 312, 113, 20);
		printpage.add(txt_cheque_dd_2);
		
		JLabel txt_cheque_dd_3 = new JLabel("The following payment in the college office for the year");
		txt_cheque_dd_3.setForeground(new Color(102, 0, 102));
		txt_cheque_dd_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_cheque_dd_3.setBounds(10, 354, 413, 20);
		printpage.add(txt_cheque_dd_3);
		
		JLabel txt_cheque_dd_4 = new JLabel("2023 -");
		txt_cheque_dd_4.setForeground(new Color(102, 0, 153));
		txt_cheque_dd_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_cheque_dd_4.setBounds(446, 354, 56, 20);
		printpage.add(txt_cheque_dd_4);
		
		JLabel txt_cheque_dd_5 = new JLabel("2024");
		txt_cheque_dd_5.setForeground(new Color(102, 0, 153));
		txt_cheque_dd_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_cheque_dd_5.setBounds(512, 354, 50, 20);
		printpage.add(txt_cheque_dd_5);
		
		JLabel txt_bankName = new JLabel("Bank name");
		txt_bankName.setForeground(new Color(102, 0, 102));
		txt_bankName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_bankName.setBounds(192, 281, 113, 20);
		printpage.add(txt_bankName);
		
		JLabel txt_receivedFrom = new JLabel("Receive from");
		txt_receivedFrom.setForeground(new Color(102, 0, 102));
		txt_receivedFrom.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_receivedFrom.setBounds(192, 312, 113, 20);
		printpage.add(txt_receivedFrom);
		
		JLabel txt_cheque_dd_6 = new JLabel("Date :");
		txt_cheque_dd_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_cheque_dd_6.setBounds(701, 213, 47, 20);
		printpage.add(txt_cheque_dd_6);
		
		JLabel txt_cheque_dd_7 = new JLabel("GSTIN :");
		txt_cheque_dd_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_cheque_dd_7.setBounds(701, 256, 64, 20);
		printpage.add(txt_cheque_dd_7);
		
		JLabel txt_date = new JLabel("Date :");
		txt_date.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_date.setBounds(787, 213, 64, 20);
		printpage.add(txt_date);
		
		JLabel txt_gstin = new JLabel("GSTIN :");
		txt_gstin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_gstin.setBounds(787, 256, 101, 20);
		printpage.add(txt_gstin);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(102, 0, 102));
		separator.setBounds(10, 385, 972, 42);
		printpage.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Sr No");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(25, 399, 56, 20);
		printpage.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Heads");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(346, 399, 56, 20);
		printpage.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Amount(rs)");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(752, 399, 68, 20);
		printpage.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("1");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(31, 438, 56, 20);
		printpage.add(lblNewLabel_3_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(102, 0, 102));
		separator_1.setBounds(10, 422, 972, 5);
		printpage.add(separator_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("1");
		lblNewLabel_3_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(346, 438, 56, 20);
		printpage.add(lblNewLabel_3_3_1);
		
		JLabel txt_cgst = new JLabel("sgst (9%)");
		txt_cgst.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txt_cgst.setBounds(346, 500, 64, 20);
		printpage.add(txt_cgst);
		
		JLabel txt_sgst = new JLabel("cgst (9%)");
		txt_sgst.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txt_sgst.setBounds(346, 469, 77, 20);
		printpage.add(txt_sgst);
		
		JLabel txt_initialAmount = new JLabel("1");
		txt_initialAmount.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txt_initialAmount.setBounds(752, 438, 56, 20);
		printpage.add(txt_initialAmount);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("1");
		lblNewLabel_3_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3_3.setBounds(752, 473, 56, 20);
		printpage.add(lblNewLabel_3_3_3);
		
		JLabel lblNewLabel_3_3_4 = new JLabel("1");
		lblNewLabel_3_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_3_4.setBounds(752, 504, 56, 20);
		printpage.add(lblNewLabel_3_3_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(725, 535, 148, 5);
		printpage.add(separator_2);
		
		JLabel txt_total = new JLabel("Total");
		txt_total.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txt_total.setBounds(752, 535, 56, 20);
		printpage.add(txt_total);
		
		JLabel txt_sgst_1 = new JLabel("Total in Words :");
		txt_sgst_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txt_sgst_1.setBounds(10, 562, 101, 20);
		printpage.add(txt_sgst_1);
		
		JLabel txt_totalInWords = new JLabel("IN WORDS");
		txt_totalInWords.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txt_totalInWords.setBounds(144, 562, 549, 20);
		printpage.add(txt_totalInWords);
		
		JLabel txt_sgst_2 = new JLabel("Receiver Signature");
		txt_sgst_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txt_sgst_2.setBounds(725, 621, 135, 20);
		printpage.add(txt_sgst_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(725, 608, 148, 5);
		printpage.add(separator_2_1);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
//				PrinterJob.job = PrinterJob.getPrinterJob();
//				job.setJobName("Print Date");
//				
//				job.setPrintable(new Printable(){
//					public int print(Grephics pg,PageFormate pf, int pageNum) {
//						pf.setOrientation(pageFormate.LANDSCAPE);
//						if(pageNum > 0) {
//							return Printable.NO_SUCH_PAGE;
//						}
//						
//						
//						Graphics2D g2 = (Graphics2D)pg;
//						g2.translate((pg.getImageableX(), pf.getImageableY());
//						g2.scale(0, 47,0,47);
//						
//						panel_print.print(g2);
//						
//						return Printable.PAGE_EXISTS;
//						}
//					}
//				}
				
			}
		});
		btnNewButton.setBackground(new Color(0, 204, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(408, 614, 110, 33);
		printpage.add(btnNewButton);
		
		JLabel lblNewLabel_2_3 = new JLabel("Receipt no :");
		lblNewLabel_2_3.setForeground(new Color(102, 0, 102));
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_3.setBounds(177, 188, 113, 20);
		printpage.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Payment Mode :");
		lblNewLabel_2_1_1.setForeground(new Color(102, 0, 102));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(174, 219, 131, 20);
		printpage.add(lblNewLabel_2_1_1);
		lblNewLabel_6.setForeground(new Color(0, 0, 51));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_6.setBounds(690, -4, 166, 31);
		contentPane.add(lblNewLabel_6);
		
		
	}
}
