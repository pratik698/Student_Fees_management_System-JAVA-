import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EditCourse extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditCourse frame = new EditCourse();
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
	public EditCourse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 762);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelsideBar = new JPanel();
		panelsideBar.setLayout(null);
		panelsideBar.setBackground(new Color(0, 51, 51));
		panelsideBar.setBounds(991, 0, 379, 723);
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
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(0, 0, 993, 723);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(384, 102, 559, 470);
		panel.add(table);
	}

}
