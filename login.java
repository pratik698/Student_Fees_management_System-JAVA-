import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.SystemColor;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JPasswordField txt2;
	private JTextField txtClickOnSignup;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1354, 699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1363, 103);
		panel.setBackground(new Color(0, 51, 51));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Login");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\admin.png"));
		lblNewLabel.setBounds(515, 27, 274, 64);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		lblNewLabel_2.setBounds(515, 27, 105, 53);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-10, 102, 1373, 598);
		panel_1.setBackground(new Color(0, 102, 102));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter username :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(403, 153, 206, 36);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(403, 270, 206, 36);
		panel_1.add(lblNewLabel_1_1);
		
		txt1 = new JTextField();
		txt1.setBounds(643, 159, 179, 29);
		panel_1.add(txt1);
		txt1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\login.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// START MY CODE
				
				String uname = txt1.getText();
				String pass = txt2.getText();
			
				try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=false","root","root");
				PreparedStatement st1 = con.prepareStatement("select * from data where uname=? and pass=?");
				st1.setString(1, uname);
				st1.setString(2, pass);
				
				ResultSet rs = st1.executeQuery();
				if(rs.next()) {
					JOptionPane.showMessageDialog(null, "Login success");
					dispose();
					home ah = new home();
					ah.setVisible(true);
				} 
//				else if (uname.trim().equals("")||pass.trim().equals(""))
//				{
//					
//					lblError.setText("Please enter username and password");
//				}
				
				else{
					JOptionPane.showMessageDialog(null, "Please check username or password");
				}
				
				
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
				// END MY CODE
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(0, 51, 51));
		btnNewButton.setBounds(590, 411, 122, 36);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Signup");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\signup.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//START MY CODE
				dispose();
				Signup_page ah = new Signup_page();
				ah.setVisible(true);
				//END
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 51, 51));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(376, 412, 156, 35);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\exit.png"));
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1_1.setBackground(new Color(0, 51, 51));
		btnNewButton_1_1.setBounds(777, 412, 122, 35);
		panel_1.add(btnNewButton_1_1);
		
		txt2 = new JPasswordField();
		txt2.setEchoChar('*');
		txt2.setBounds(643, 284, 179, 29);
		panel_1.add(txt2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 204, 255));
		separator.setBounds(292, 375, 663, 10);
		panel_1.add(separator);
		
		JTextField txtDontHaveAccount = new JTextField();
		txtDontHaveAccount.setForeground(new Color(191, 205, 219));
		txtDontHaveAccount.setText("Don't have account ");
		txtDontHaveAccount.setBackground(new Color(0, 102, 102));
		txtDontHaveAccount.setBounds(745, 344, 101, 20);
		panel_1.add(txtDontHaveAccount);
		txtDontHaveAccount.setColumns(10);
		
		txtClickOnSignup = new JTextField();
		txtClickOnSignup.setText("Click on Signup");
		txtClickOnSignup.setForeground(SystemColor.textHighlight);
		txtClickOnSignup.setColumns(10);
		txtClickOnSignup.setBackground(new Color(0, 102, 102));
		txtClickOnSignup.setBounds(841, 344, 101, 20);
		panel_1.add(txtClickOnSignup);
	}
}
