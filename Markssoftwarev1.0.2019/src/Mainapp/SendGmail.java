package Mainapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class SendGmail extends JFrame {
	//public String sub=" ";
	//public String mymsg=" ";
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextArea textArea;
	private JButton btnSend;
	private JButton btnAttach;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SendGmail frame = new SendGmail();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public SendGmail(String fromaddress,String toaddress,String regno1,String nm) {
		setResizable(false);
		//-------------------------
		String q1="a";
		String q2="b";
		final String username=/*fromaddress*/"ashishsv028@gmail.com";
		final String password=/*Long.toString(9440742350);*/"nanikrishnapriya";
		Properties properties=new Properties();
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.port","587");
		properties.put("mail.smtp.ssl.trust","smtp.gmail.com");
		Session session=Session.getInstance(properties,new javax.mail.Authenticator()
				{
					protected PasswordAuthentication getPasswordAuthentication()
					{
						return new PasswordAuthentication(username,password);

					}
				});
		MimeMessage msg=new MimeMessage(session);
		//sub=textField_3.getText();
		//mymsg=textArea.getText();
		try
		{
			msg.setFrom(new InternetAddress(fromaddress));
			msg.addRecipient(Message.RecipientType.TO,new InternetAddress(toaddress));
			
			//Transport.send(msg);
			
			
		}catch(Exception e){e.printStackTrace();}
		

		//--------------------------
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 433, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(12, 37, 67, 22);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(82, 37, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblRegNo = new JLabel("REG NO :");
		lblRegNo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRegNo.setBounds(223, 37, 67, 22);
		contentPane.add(lblRegNo);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(290, 37, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTo = new JLabel("TO :");
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setBounds(22, 82, 41, 22);
		contentPane.add(lblTo);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(82, 82, 324, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSubject = new JLabel("SUBJECT :");
		lblSubject.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSubject.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubject.setBounds(7, 117, 72, 30);
		contentPane.add(lblSubject);
		
		textField_3 = new JTextField();
		textField_3.setBounds(82, 121, 324, 38);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCompose = new JLabel("COMPOSE :");
		lblCompose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCompose.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompose.setBounds(12, 176, 87, 22);
		contentPane.add(lblCompose);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 199, 394, 158);
		contentPane.add(textArea);
		
		btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					msg.setSubject(textField_3.getText());
					msg.setText(textArea.getText());
				Transport.send(msg);
				System.out.println("Message Sent");}catch(Exception w) {w.printStackTrace();}
			}
		});
		btnSend.setForeground(SystemColor.textHighlight);
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSend.setBounds(306, 370, 97, 25);
		contentPane.add(btnSend);
		
		btnAttach = new JButton("ATTACH");
		btnAttach.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAttach.setForeground(SystemColor.textHighlight);
		btnAttach.setBounds(193, 371, 97, 25);
		contentPane.add(btnAttach);
		//--------------------------------------
						textField.setText(nm);
						textField_1.setText(regno1);
						textField_2.setText(toaddress);

	}
}
