import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1386, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(-123, 112, 1493, 559);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.addKeyListener(new KeyAdapter() {
			
			
		});
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.WHITE, null, new Color(255, 255, 255)));
		panel_2.setBackground(new Color(0, 51, 51));
		panel_2.setBounds(165, 66, 262, 141);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Fees");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);	
			panel_2.setBackground(clr);			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,102,102);	
				panel_2.setBackground(clr);	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				AddFees addf=new AddFees();
				addf.setVisible(true);
				this.dispose();
				
			}
			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\plus.png"));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 0, 252, 141);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);	
				panel_3.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,102,102);	
				panel_3.setBackground(clr);	
			}
		});
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.WHITE, null, Color.WHITE));
		panel_3.setBackground(new Color(0, 51, 51));
		panel_3.setBounds(570, 44, 274, 136);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Search Records");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				searchRecord sr = new searchRecord();
				sr.setVisible(true);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\search-document.png"));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 0, 264, 136);
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);	
				panel_3_1.setBackground(clr);	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,102,102);	
				panel_3_1.setBackground(clr);	
			}
		});
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.WHITE, null, Color.WHITE));
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(0, 51, 51));
		panel_3_1.setBounds(995, 39, 254, 136);
		panel.add(panel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("View Records");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\text-book-opened-from-top-view.png"));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(0, 0, 254, 136);
		panel_3_1.add(lblNewLabel_1_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,102,102);	
				panel_3_2.setBackground(clr);	
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);	
				panel_3_2.setBackground(clr);	
			}
		});
		panel_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.WHITE, null, Color.WHITE));
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(0, 51, 51));
		panel_3_2.setBounds(153, 274, 274, 136);
		panel.add(panel_3_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Edit Course");
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\edit.png"));
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(0, 0, 264, 136);
		panel_3_2.add(lblNewLabel_1_4);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,102,102);	
				panel_3_3.setBackground(clr);	
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);	
				panel_3_3.setBackground(clr);	
			}
		});
		panel_3_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.WHITE, null, Color.WHITE));
		panel_3_3.setLayout(null);
		panel_3_3.setBackground(new Color(0, 51, 51));
		panel_3_3.setBounds(570, 274, 274, 136);
		panel.add(panel_3_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("View Course");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\text-book-opened-from-top-view.png"));
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(10, 0, 264, 136);
		panel_3_3.add(lblNewLabel_1_3);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,102,102);	
				panel_3_4.setBackground(clr);	
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);	
				panel_3_4.setBackground(clr);	
			}
		});
		panel_3_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.WHITE, null, Color.WHITE));
		panel_3_4.setLayout(null);
		panel_3_4.setBackground(new Color(0, 51, 51));
		panel_3_4.setBounds(995, 274, 254, 136);
		panel.add(panel_3_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("View Report");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\view report.png"));
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(10, 0, 244, 136);
		panel_3_4.add(lblNewLabel_1_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.WHITE, null, new Color(255, 255, 255)));
		panel_2_1.setBackground(new Color(0, 51, 51));
		panel_2_1.setBounds(400, 468, 132, 67);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Logout");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\logout.png"));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(0, 0, 128, 57);
		panel_2_1.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 51, 51));
		panel_4.setBounds(1106, 468, 143, 67);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("About");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\my icons\\my icons\\about.png"));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 0, 123, 69);
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 51));
		panel_1.setBounds(0, 0, 1370, 115);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Dr D. Y. Patil College , Pune");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_4.setForeground(new Color(204, 255, 255));
		lblNewLabel_4.setBounds(507, 24, 319, 42);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Near railway Station , varale road, talegaon");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(502, 77, 334, 27);
		panel_1.add(lblNewLabel_5);
	}
}
