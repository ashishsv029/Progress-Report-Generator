package consolidatepack;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import loginpack.dailogupdate;
public class Findstudentframe extends JFrame {
	public Connection con1;
	public PreparedStatement ps1;
	public Statement s1;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Findstudentframe frame = new Findstudentframe();
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
	//IN ORDER TO AVOID NULL POINTER EXCEPTION FOR PREPARED STATEMENT IT MUST BE INITIALIZED BEFORE
	//HENCE ps1=con1.prepareStatement("insert into mymarkslist1 values(?,?,?,?,?,?,?,?,?,?,?,?)"); 
	//TO BE  DONE
	public Findstudentframe(String name,int regno,float tel,float hin,float eng,float mat,float sci,float soc,float tot,float perc,int rank,String stat,String tablename) {
		try{Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		s1=con1.createStatement();
		ps1=con1.prepareStatement("insert into "+tablename+" values(?,?,?,?,?,?,?,?,?,?,?,?)");
		}catch(Exception me) {System.out.println("opopopop");}
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 340, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLrgVidyalayam = new JLabel("L R G VIDYALAYAM");
		lblLrgVidyalayam.setForeground(Color.BLUE);
		lblLrgVidyalayam.setHorizontalAlignment(SwingConstants.CENTER);
		lblLrgVidyalayam.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLrgVidyalayam.setBounds(49, 13, 233, 41);
		contentPane.add(lblLrgVidyalayam);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(12, 67, 77, 29);
		contentPane.add(lblName);
		
		JLabel lblRegNo = new JLabel("REG NO :");
		lblRegNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRegNo.setBounds(12, 109, 77, 29);
		contentPane.add(lblRegNo);
		
		JLabel lblTelugu = new JLabel("TELUGU :");
		lblTelugu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTelugu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelugu.setBounds(12, 164, 77, 29);
		contentPane.add(lblTelugu);
		
		JLabel lblHindi = new JLabel("HINDI :");
		lblHindi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHindi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblHindi.setBounds(12, 206, 77, 29);
		contentPane.add(lblHindi);
		
		JLabel lblEnglish = new JLabel("ENGLISH :");
		lblEnglish.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnglish.setBounds(12, 248, 77, 29);
		contentPane.add(lblEnglish);
		
		JLabel lblMaths = new JLabel("MATHS :");
		lblMaths.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaths.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMaths.setBounds(155, 167, 77, 23);
		contentPane.add(lblMaths);
		
		JLabel lblScience = new JLabel("SCIENCE :");
		lblScience.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblScience.setHorizontalAlignment(SwingConstants.CENTER);
		lblScience.setBounds(155, 213, 77, 23);
		contentPane.add(lblScience);
		
		JLabel lblSocial = new JLabel("SOCIAL :");
		lblSocial.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocial.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSocial.setBounds(155, 253, 77, 23);
		contentPane.add(lblSocial);
		
		JLabel lblXxxxxxxxxx = new JLabel(name);
		lblXxxxxxxxxx.setHorizontalAlignment(SwingConstants.CENTER);
		lblXxxxxxxxxx.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblXxxxxxxxxx.setBounds(59, 70, 120, 22);
		contentPane.add(lblXxxxxxxxxx);
		
		JLabel label = new JLabel(Integer.toString(regno));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(85, 112, 77, 23);
		contentPane.add(label);
		
		JLabel lblTotal = new JLabel("TOTAL :");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(12, 301, 64, 23);
		contentPane.add(lblTotal);
		
		JLabel lblPercent = new JLabel("PERCENT :");
		lblPercent.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPercent.setHorizontalAlignment(SwingConstants.CENTER);
		lblPercent.setBounds(149, 300, 83, 23);
		contentPane.add(lblPercent);
		
		JLabel label_7 = new JLabel(Float.toString(tot));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_7.setBounds(85, 301, 54, 23);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel(Float.toString(perc));
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(232, 301, 69, 23);
		contentPane.add(label_8);
		
		JLabel lblNewLabel = new JLabel("STATUS :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 337, 77, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblRank = new JLabel("RANK :");
		lblRank.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRank.setHorizontalAlignment(SwingConstants.CENTER);
		lblRank.setBounds(14, 375, 64, 27);
		contentPane.add(lblRank);
		
		JLabel lblPass = new JLabel(stat);
		lblPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblPass.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPass.setBounds(85, 341, 64, 23);
		contentPane.add(lblPass);
		
		JLabel label_9 = new JLabel(Integer.toString(rank));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_9.setBounds(87, 377, 52, 22);
		contentPane.add(label_9);
		
		JButton btnGraph = new JButton("GRAPH");
		btnGraph.setForeground(SystemColor.textHighlight);
		btnGraph.setBackground(UIManager.getColor("CheckBoxMenuItem.background"));
		btnGraph.setBounds(185, 336, 97, 25);
		contentPane.add(btnGraph);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBackground(UIManager.getColor("CheckBoxMenuItem.background"));
		btnPrint.setForeground(SystemColor.textHighlight);
		btnPrint.setBounds(185, 374, 97, 25);
		contentPane.add(btnPrint);
		
		textField = new JTextField(Float.toString(tel));
		textField.setEnabled(false);
		textField.setBounds(97, 167, 46, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(Float.toString(hin));
		textField_1.setEnabled(false);
		textField_1.setBounds(97, 209, 46, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(Float.toString(eng));
		textField_2.setEnabled(false);
		textField_2.setBounds(97, 251, 46, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(Float.toString(mat));
		textField_3.setEnabled(false);
		textField_3.setBounds(239, 167, 46, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(Float.toString(sci));
		textField_4.setEnabled(false);
		textField_4.setBounds(239, 209, 46, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField(Float.toString(soc));
		textField_5.setEnabled(false);
		textField_5.setBounds(239, 251, 46, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(194, 73, 56, 16);
		contentPane.add(label_1);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setEnabled(true);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				textField_4.setEnabled(true);
				textField_5.setEnabled(true);
			}
		});
		btnEdit.setBounds(191, 69, 97, 25);
		contentPane.add(btnEdit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float telu=Float.parseFloat(textField.getText());
				float hinu=Float.parseFloat(textField_1.getText());
				float engu=Float.parseFloat(textField_2.getText());
				float matu=Float.parseFloat(textField_3.getText());
				float sciu=Float.parseFloat(textField_4.getText());
				float socu=Float.parseFloat(textField_5.getText());
				float totu=telu+hinu+engu+matu+sciu+socu;
				float percu=totu/600*100;
				int flag=0;
				String statusu;
				if(telu>35)
					flag++;
				if(hinu>35)
					flag++;
				if(engu>35)
					flag++;
				if(matu>35)
					flag++;
				if(sciu>35)
					flag++;
				if(socu>35)
					flag++;
				if(flag==6)
					statusu="PASS";
				else
					statusu="FAIL";
				try {
					String stq="update "+tablename+" set telm="+Float.toString(telu)+" where regno="+Integer.toString(regno);
					ps1.executeUpdate(stq);
					String stq1="update "+tablename+" set hinm="+Float.toString(hinu)+" where regno="+Integer.toString(regno);
					ps1.executeUpdate(stq1);
					String stq2="update "+tablename+" set engm="+Float.toString(engu)+" where regno="+Integer.toString(regno);
					ps1.executeUpdate(stq2);
					String stq3="update "+tablename+" set matm="+Float.toString(matu)+" where regno="+Integer.toString(regno);
					ps1.executeUpdate(stq3);
					String stq4="update "+tablename+" set scim="+Float.toString(sciu)+" where regno="+Integer.toString(regno);
					ps1.executeUpdate(stq4);
					String stq5="update "+tablename+" set socm="+Float.toString(socu)+" where regno="+Integer.toString(regno);
					ps1.executeUpdate(stq5);
					String stq6="update "+tablename+" set total="+Float.toString(totu)+" where regno="+Integer.toString(regno);
					ps1.executeUpdate(stq6);
					String stq7="update "+tablename+" set percent="+Float.toString(percu)+" where regno="+Integer.toString(regno);
					ps1.executeUpdate(stq7);
					String stq8="update "+tablename+" set status='"+statusu+"' where regno="+Integer.toString(regno);
					ps1.executeUpdate(stq8);
					new dailogupdate("Updated Successfully");
					
				//s1.executeUpdate("delete from tabv  where reg=39 ");
				//System.out.println("r="+r);
				//con1.close();
				}catch(Exception e2) {e2.printStackTrace();}
				
			}
		});
		btnUpdate.setBounds(191, 111, 97, 25);
		contentPane.add(btnUpdate);
	}
}
