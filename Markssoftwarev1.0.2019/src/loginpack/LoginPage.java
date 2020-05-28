package loginpack;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Mainapp.mainframe;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Mainapp.*;
import loginpack.dailogupdate;
public class LoginPage extends JFrame {
	public Connection con2;
	public PreparedStatement ps2;
	public Statement s2;
	public ResultSet rs2;

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			s2=con2.createStatement();
			//ps2=null;
		}catch(Exception e6) {e6.printStackTrace();}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("TEACHER'S LOGIN");
		lblLogin.setBackground(Color.DARK_GRAY);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.MAGENTA);
		lblLogin.setFont(new Font("Dotum", Font.BOLD, 16));
		lblLogin.setBounds(64, 13, 172, 36);
		contentPane.add(lblLogin);
		
		JLabel lblUserName = new JLabel("USER NAME:");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblUserName.setBounds(32, 79, 99, 36);
		contentPane.add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(144, 87, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblPassword.setBounds(39, 128, 89, 28);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 132, 115, 22);
		contentPane.add(passwordField);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					
					ResultSet rs3=s2.executeQuery("select * from logintable");
					//System.out.println(rs3.next());
					boolean login=false;
					//new mainframe();
					while(rs3.next())
					{
						if(rs3.getString("userid").equals(textField.getText()))
						{
							System.out.println("c1");
							if(rs3.getString("password").equals(passwordField.getText()))
							{
								
								//System.out.println("c2");
								//System.out.println("success");
								login=true;
								System.out.println("sw");
								new mainframe(rs3.getString("class"),rs3.getString("tabname"),rs3.getString("STUDENTLISTTABLES"),rs3.getString("teacheremailid")).setVisible(true);
								//break;
								dispose();
							}
						}
						//System.out.println("ok");
						//System.out.println(rs3.getString("userid"));
					}
					if(login==false) {
						new dailogupdate("Enter valid username/password");
						System.out.println("failed");}
				
				}catch(Exception e33) {e33.printStackTrace();}
			}
		});
		btnSubmit.setBounds(55, 187, 97, 25);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(163, 187, 97, 25);
		contentPane.add(btnCancel);
	}
}
 