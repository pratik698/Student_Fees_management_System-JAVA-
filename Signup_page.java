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
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JRadioButton;

public class Signup_page extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt6;
	private JPasswordField txt4;
	private JPasswordField txt5;
	

	/**
	 * Launch the application.
	 */
	
	//for ID

	
	// For Validation of all fields **
	
	String lname,uname,fname,password,con_pass,contact_no;
	
	boolean validation() {
		
		fname=txt1.getText();
		lname=txt2.getText();
		uname=txt3.getText();
		password=txt4.getText();
		con_pass=txt5.getText();
		contact_no=txt6.getText();
		
		
		if(fname.equals(""))
		{
			JOptionPane.showConfirmDialog(this, "please Enter firstname");
			return false;
		}
		if(lname.equals(""))
		{
			JOptionPane.showConfirmDialog(this, "please Enter lastname");
			return false;
		}
		if(uname.equals(""))
		{
			JOptionPane.showConfirmDialog(this, "please Enter username");
			return false;
		}
		if(password.equals(""))
		{
			JOptionPane.showConfirmDialog(this, "please enter the password");
			return false;
		} if(password.length()<8)
	         {
			JOptionPane.showConfirmDialog(this, "password should be 8 digit");
			 return false;
	         }
		
		if(con_pass.equals(""))
		{
			JOptionPane.showConfirmDialog(this, "please Enter confirm password");
			return false;
		}
		if(contact_no.equals(""))
		{
			JOptionPane.showConfirmDialog(this, "please Enter contact");
			return false;
		}
		 if(!contact_no.matches("\\d{10}"))
	        {
			 JOptionPane.showConfirmDialog(this, "Contact should be 10 digit");
			 return false;
	        }
		
		if(!password.equals(con_pass))
		{
			JOptionPane.showConfirmDialog(this, "password does not matched");
			return false;
		}
//		 if(password.length()<8)
//         {
//			 password_error.setText("password should be 8 digit");
//         }
//         if(!password.equals(con_pass))
//         {
//             JOptionPane.showMessageDialog(this, "password is not match");
//             return false;
//         }
		
		return true;
	}
	
	
	
//	public void checkContactNo()
//    {
//        contact_no=txt5.getText();
//        if(contact_no.length()==10)
//        {
//        	lbl_contact_error.setText("");
//        }
//        else
//        {
//            lbl_contact_error.setText("Contact should be 10 digit");
//        }
//    }
	
	//MAIN **
	public static void main(String[] args) {
      
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup_page frame = new Signup_page();
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
	
	
	
	
	public Signup_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 729);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-88, 23, 1458, 92);
		panel.setBackground(new Color(0, 51, 51));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("SignUp");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel.add(lblNewLabel);
		
		JPanel panal = new JPanel();
		panal.setBounds(0, 114, 1370, 589);
		panal.setBackground(new Color(0, 102, 102));
		contentPane.add(panal);
		SpringLayout sl_panal = new SpringLayout();
		panal.setLayout(sl_panal);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname :");
		sl_panal.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 39, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, lblNewLabel_1, 540, SpringLayout.WEST, panal);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panal.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lastname :");
		sl_panal.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 92, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, lblNewLabel_1_1, 540, SpringLayout.WEST, panal);
		sl_panal.putConstraint(SpringLayout.EAST, lblNewLabel_1_1, 650, SpringLayout.WEST, panal);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panal.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Username :");
		sl_panal.putConstraint(SpringLayout.NORTH, lblNewLabel_1_2, 162, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, lblNewLabel_1_2, 540, SpringLayout.WEST, panal);
		sl_panal.putConstraint(SpringLayout.SOUTH, lblNewLabel_1_2, 190, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.EAST, lblNewLabel_1_2, 670, SpringLayout.WEST, panal);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panal.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Password :");
		sl_panal.putConstraint(SpringLayout.NORTH, lblNewLabel_1_3, 223, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, lblNewLabel_1_3, 540, SpringLayout.WEST, panal);
		sl_panal.putConstraint(SpringLayout.EAST, lblNewLabel_1_3, 650, SpringLayout.WEST, panal);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panal.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Confirm Password :");
		sl_panal.putConstraint(SpringLayout.NORTH, lblNewLabel_1_4, 282, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, lblNewLabel_1_4, 541, SpringLayout.WEST, panal);
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panal.add(lblNewLabel_1_4);
		
		txt1 = new JTextField();
		sl_panal.putConstraint(SpringLayout.NORTH, txt1, 47, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, txt1, 791, SpringLayout.WEST, panal);
		sl_panal.putConstraint(SpringLayout.SOUTH, txt1, 66, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.EAST, txt1, 947, SpringLayout.WEST, panal);
		panal.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		sl_panal.putConstraint(SpringLayout.NORTH, txt2, 100, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, txt2, 791, SpringLayout.WEST, panal);
		sl_panal.putConstraint(SpringLayout.SOUTH, txt2, 119, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.EAST, txt2, 947, SpringLayout.WEST, panal);
		txt2.setColumns(10);
		panal.add(txt2);
		
		txt3 = new JTextField();
		sl_panal.putConstraint(SpringLayout.NORTH, txt3, 171, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, txt3, 791, SpringLayout.WEST, panal);
		sl_panal.putConstraint(SpringLayout.SOUTH, txt3, 190, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.EAST, txt3, 947, SpringLayout.WEST, panal);
		txt3.setColumns(10);
		panal.add(txt3);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Contact No. :");
		sl_panal.putConstraint(SpringLayout.NORTH, lblNewLabel_1_5_1, 54, SpringLayout.SOUTH, lblNewLabel_1_4);
		sl_panal.putConstraint(SpringLayout.WEST, lblNewLabel_1_5_1, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_panal.putConstraint(SpringLayout.SOUTH, lblNewLabel_1_5_1, 392, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.EAST, lblNewLabel_1_5_1, 720, SpringLayout.WEST, panal);
		lblNewLabel_1_5_1.setForeground(Color.WHITE);
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panal.add(lblNewLabel_1_5_1);
		
		txt6 = new JTextField();
		sl_panal.putConstraint(SpringLayout.NORTH, txt6, 0, SpringLayout.NORTH, lblNewLabel_1_5_1);
		sl_panal.putConstraint(SpringLayout.WEST, txt6, 0, SpringLayout.WEST, txt1);
		sl_panal.putConstraint(SpringLayout.EAST, txt6, 0, SpringLayout.EAST, txt1);
		txt6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//checkContactNo();
			}
		});
		txt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		txt6.setColumns(10);
		panal.add(txt6);
		
		txt4 = new JPasswordField();
		txt4.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		sl_panal.putConstraint(SpringLayout.NORTH, txt4, 231, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, txt4, 791, SpringLayout.WEST, panal);
		sl_panal.putConstraint(SpringLayout.SOUTH, txt4, 250, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.EAST, txt4, 947, SpringLayout.WEST, panal);
		panal.add(txt4);
		
		txt5 = new JPasswordField();
		sl_panal.putConstraint(SpringLayout.NORTH, txt5, 291, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, txt5, 791, SpringLayout.WEST, panal);
		sl_panal.putConstraint(SpringLayout.SOUTH, txt5, 310, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.EAST, txt5, 947, SpringLayout.WEST, panal);
		panal.add(txt5);
		
		
		
		Button btn_signup = new Button("SignUp");
		sl_panal.putConstraint(SpringLayout.NORTH, btn_signup, 462, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, btn_signup, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_panal.putConstraint(SpringLayout.EAST, btn_signup, 670, SpringLayout.WEST, panal);
		btn_signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (validation()) {
				
				String name = txt1.getText();
				String lastname = txt2.getText();
				String uname = txt3.getText();
				String pass = txt4.getText();
				String contact = txt6.getText();
				
				try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useSSL=false","root","root");
				PreparedStatement st1 = con.prepareStatement("insert into data(name,lastname,uname,pass,contact) values(?,?,?,?,?)");
				st1.setString(1, name);
				st1.setString(2, lastname);
				st1.setString(3, uname);
				st1.setString(4, pass);
				st1.setString(5, contact);
				
				int i = st1.executeUpdate();
				if(i>0) {
				    JOptionPane.showMessageDialog(null, "Registration successful");
				}else {
					JOptionPane.showMessageDialog(null, "Registration not successful");
				}
				con.close();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
			}
		});
	
		btn_signup.setForeground(Color.WHITE);
		btn_signup.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_signup.setBackground(new Color(0, 51, 51));
		panal.add(btn_signup);
		
		Button btn_login = new Button("Reset");
		sl_panal.putConstraint(SpringLayout.NORTH, btn_login, 0, SpringLayout.NORTH, btn_signup);
		sl_panal.putConstraint(SpringLayout.WEST, btn_login, 108, SpringLayout.EAST, btn_signup);
		sl_panal.putConstraint(SpringLayout.SOUTH, btn_login, 498, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.EAST, btn_login, -462, SpringLayout.EAST, panal);
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				txt4.setText("");
				txt6.setText("");
				txt5.setText("");
			}
		});
		btn_login.setForeground(Color.WHITE);
		btn_login.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_login.setBackground(new Color(0, 51, 51));
		panal.add(btn_login);
		
		JLabel password_error = new JLabel("");
		sl_panal.putConstraint(SpringLayout.NORTH, password_error, 230, SpringLayout.NORTH, panal);
		sl_panal.putConstraint(SpringLayout.WEST, password_error, 18, SpringLayout.EAST, txt4);
		sl_panal.putConstraint(SpringLayout.EAST, password_error, 305, SpringLayout.EAST, txt4);
		password_error.setFont(new Font("Tahoma", Font.BOLD, 13));
		password_error.setForeground(Color.RED);
		panal.add(password_error);
		
		JLabel lbl_contact_error = new JLabel("");
		sl_panal.putConstraint(SpringLayout.WEST, lbl_contact_error, 965, SpringLayout.WEST, panal);
		sl_panal.putConstraint(SpringLayout.EAST, lbl_contact_error, -163, SpringLayout.EAST, panal);
		sl_panal.putConstraint(SpringLayout.SOUTH, btn_signup, 0, SpringLayout.SOUTH, lbl_contact_error);
		lbl_contact_error.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_contact_error.setForeground(Color.RED);
		sl_panal.putConstraint(SpringLayout.SOUTH, lbl_contact_error, -91, SpringLayout.SOUTH, panal);
		panal.add(lbl_contact_error);
		
		Button btn_login_1 = new Button("Go To Login Page");
		sl_panal.putConstraint(SpringLayout.NORTH, btn_login_1, 0, SpringLayout.NORTH, btn_signup);
		sl_panal.putConstraint(SpringLayout.WEST, btn_login_1, 94, SpringLayout.EAST, btn_login);
		sl_panal.putConstraint(SpringLayout.EAST, btn_login_1, -153, SpringLayout.EAST, panal);
		btn_login_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//START MY CODE
				login ah = new login();
				ah.setVisible(true);
			// END 
			}
		});
		btn_login_1.setForeground(Color.WHITE);
		btn_login_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_login_1.setBackground(new Color(0, 51, 51));
		panal.add(btn_login_1);
			
		}
}









