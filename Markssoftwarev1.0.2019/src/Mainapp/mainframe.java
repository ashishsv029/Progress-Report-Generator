package Mainapp;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import consolidatepack.*;
import Mainapp.SendGmail;
public class mainframe extends JFrame {
	public Connection con;
	public PreparedStatement ps;
	public Statement s;
	public ResultSet rs,rs1,rs64,rs65;
	public int g=0;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainframe frame = new mainframe();
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
	public mainframe(String classname,String tablename,String studlist,String teachermail) {
		//String v=ui;
		setResizable(false);
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//s.execute("create table mymarkslist1(name varchar2(30),regno int,telm float,hinm float,engm float,matm float,scim float,socm float,total float,percent float,status varchar2(10),rank int,constraint reg_pk primary key(regno))");
		//OLDTABLESs.execute("create table markslist(name varchar2(30),regno int,mark1 int,mark2 int,mark3 int,total int,average float)");
		ps=con.prepareStatement("insert into "+tablename+" values(?,?,?,?,?,?,?,?,?,?,?,?)");
		}catch(Exception e) {e.printStackTrace();}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 475, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProgressCalculator = new JLabel("PROGRESS  CALCULATOR");
		lblProgressCalculator.setFont(new Font("Calisto MT", Font.BOLD, 16));
		lblProgressCalculator.setForeground(SystemColor.textHighlight);
		lblProgressCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgressCalculator.setBackground(SystemColor.textHighlight);
		lblProgressCalculator.setBounds(61, 0, 341, 44);
		contentPane.add(lblProgressCalculator);
		
		JLabel lblNewLabel = new JLabel("TELUGU\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 136, 84, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HINDI");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(34, 174, 84, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENGLISH");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(34, 212, 84, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MATHS");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(34, 255, 84, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SCIENCE");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(34, 293, 84, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SOCIAL");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(34, 331, 84, 25);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(130, 137, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 175, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 216, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 256, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 294, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(130, 332, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int flag=0;
				String st=textField_9.getText();
				int regno=Integer.parseInt(textField_10.getText());
				float tel=Float.parseFloat(textField.getText());
				float hin=Float.parseFloat(textField_1.getText());
				float eng=Float.parseFloat(textField_2.getText());
				float mat=Float.parseFloat(textField_3.getText());
				float sci=Float.parseFloat(textField_4.getText());
				float soc=Float.parseFloat(textField_5.getText());
				float tot=tel+hin+eng+mat+sci+soc;
				float perc=tot/600*100;
				textField_6.setText(Float.toString(tot));
				textField_7.setText(Float.toString(perc));
				if(tel>35)
					flag++;
				if(hin>35)
					flag++;
				if(eng>35)
					flag++;
				if(mat>35)
					flag++;
				if(sci>35)
					flag++;
				if(soc>35)
					flag++;
				if(flag==6)
					textField_11.setText("PASS");
				else
					textField_11.setText("FAIL");
				String stat=textField_11.getText();
				int rankq=0;
				try
				{
					ps.setString(1,st);
					ps.setInt(2,regno);
					ps.setFloat(3, tel);
					ps.setFloat(4, hin);
					ps.setFloat(5, eng);
					ps.setFloat(6, mat);
					ps.setFloat(7, sci);
					ps.setFloat(8, soc);
					ps.setFloat(9,tot);
					ps.setFloat(10, perc);
					ps.setString(11,stat);
					ps.setInt(12,rankq);
					ps.executeUpdate();
			
					
				}catch(Exception e) {System.out.println("while insertion");e.printStackTrace();}
								
				
			}
		});
		btnSubmit.setForeground(SystemColor.textHighlight);
		btnSubmit.setBounds(54, 381, 97, 25);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");//searchbox
				textField_9.setText("");//namebox
				textField_10.setText("");//regbox
				textField_11.setText("");
				
			}
		});
		btnClear.setForeground(SystemColor.textHighlight);
		btnClear.setBounds(163, 381, 97, 25);
		contentPane.add(btnClear);
		
		JLabel lblTotal = new JLabel("TOTAL =");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER); 
		lblTotal.setBounds(251, 51, 84, 25);
		contentPane.add(lblTotal);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(329, 51, 105, 24);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPercent = new JLabel("PERCENT=");
		lblPercent.setHorizontalAlignment(SwingConstants.CENTER);
		lblPercent.setBounds(251, 78, 88, 30);
		contentPane.add(lblPercent);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(329, 81, 105, 25);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("CONSOLIDATE");
		btnNewButton.setToolTipText("Evaluate overall class performance");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		//-------------------------------------------------------------------------------------------
				int arr[]=new int[40];
				int k=0;
				try  {
				rs=s.executeQuery("select * from "+tablename+" order by total desc");
				while(rs.next())
				{
					System.out.println(rs.getString("name")+rs.getInt("total"));
					int y=rs.getInt("total");
							int flag=0;
					for(int i=0;i<arr.length;i++)
						if(arr[i]!=y)
							flag++;
						else
							break;
					//System.out.println("flagval="+flag);
					if(flag==arr.length)
					arr[k++]=y;
				}}catch(Exception e) {e.printStackTrace();}
				//for(int i=0;i<arr.length;i++)
					//System.out.println(arr[i]);
				int ranki;
				
				try {
					rs=s.executeQuery("select * from "+tablename+"  order by total desc");
				while(rs.next())
				{
					int z=rs.getInt("total");
					for(int i=0;i<40;i++)
					{
						if(z==arr[i])
						{
							ranki=i+1;
							//System.out.println("here coming");
							String st="update "+tablename+" set rank="+Integer.toString(ranki)+" where total="+Integer.toString(z);
							ps.executeUpdate(st);
							//ps.setInt(12, rank);
							//ps.executeUpdate();
							break;
						}
					}
				}}catch(Exception e) {e.printStackTrace();}
//-------------------------------------------------------------------------------------------
			float classavg=0;
			float passperc=0;
			int class_strength=0;
			int no_of_students_passed=0;
			float tel_pass_perc=0;
			float hin_pass_perc=0;
			float eng_pass_perc=0;
			float mat_pass_perc=0;
			float sci_pass_perc=0;
			float soc_pass_perc=0;
			//float tel_pass_perc=0;
			try
			{
				rs=s.executeQuery("select avg(percent) as aap from "+tablename);
				while(rs.next())
					classavg=rs.getFloat("aap");
				System.out.println("clavg="+classavg);
				
				rs=s.executeQuery("select count(status) as pass_no from (select * from "+tablename+" where status='PASS')");
				while(rs.next()) {
					//System.out.println("loop");
					no_of_students_passed=rs.getInt("pass_no");}
				System.out.println("passno="+no_of_students_passed);
				rs=s.executeQuery("select count(*) as tot from "+tablename);
				while(rs.next())
					class_strength=rs.getInt("tot");
				System.out.println("strength="+class_strength);
				passperc=(float)no_of_students_passed/class_strength*100;
				System.out.println("passpercentage="+passperc);
				
				rs=s.executeQuery("select count(telm) as tt from "+tablename+" where telm>35");
				while(rs.next())
					tel_pass_perc=(float)rs.getInt("tt")/class_strength*100;
				System.out.println("telugupasspercentage="+tel_pass_perc);
				rs=s.executeQuery("select count(hinm) as hh from "+tablename+" where hinm>35");
				while(rs.next())
					hin_pass_perc=(float)rs.getInt("hh")/class_strength*100;
				System.out.println("hindipasspercentage="+hin_pass_perc);
				rs=s.executeQuery("select count(engm) as ee from "+tablename+" where engm>35");
				while(rs.next())
					eng_pass_perc=(float)rs.getInt("ee")/class_strength*100;
				System.out.println("englishpasspercentage="+eng_pass_perc);
				rs=s.executeQuery("select count(matm) as mm from "+tablename+" where matm>35");
				while(rs.next())
					mat_pass_perc=(float)rs.getInt("mm")/class_strength*100;
				System.out.println("mathpasspercentage="+mat_pass_perc);
				rs=s.executeQuery("select count(scim) as sc from "+tablename+" where scim>35");
				if(rs.next())
					sci_pass_perc=(float)rs.getInt("sc")/class_strength*100;
				System.out.println("sciencepasspercentage="+sci_pass_perc);
				rs=s.executeQuery("select count(socm) as soc from "+tablename+" where socm>35");
				if(rs.next())
					soc_pass_perc=(float)rs.getInt("soc")/class_strength*100;
				System.out.println("socialpasspercentage="+soc_pass_perc);
			}catch(Exception e) {}
			//-------------------------
			/*EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Consolidateframe frame = new Consolidateframe(class_strength,no_of_students_passed,classavg,passperc,tel_pass_perc,eng_pass_perc,hin_pass_perc,mat_pass_perc,sci_pass_perc,soc_pass_perc);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});*/
			new Consolidateframe(class_strength,no_of_students_passed,classavg,passperc,tel_pass_perc,eng_pass_perc,hin_pass_perc,mat_pass_perc,sci_pass_perc,soc_pass_perc).setVisible(true);
			
			
			//-------------------------
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBounds(299, 191, 124, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CHECK STATUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String datum[][]=new String[40][12];
				try {
				rs=s.executeQuery("select * from "+tablename+" order by regno asc");
				int p=0;
				while(rs.next())
				{
					datum[p][0]=Integer.toString(rs.getInt("regno"));
					datum[p][1]=rs.getString("name");
					datum[p][2]=Float.toString(rs.getFloat("telm"));
					datum[p][3]=Float.toString(rs.getFloat("hinm"));
					datum[p][4]=Float.toString(rs.getFloat("engm"));
					datum[p][5]=Float.toString(rs.getFloat("matm"));
					datum[p][6]=Float.toString(rs.getFloat("scim"));
					datum[p][7]=Float.toString(rs.getFloat("socm"));
					datum[p][8]=Float.toString(rs.getFloat("total"));
					datum[p][9]=Float.toString(rs.getFloat("percent"));
					datum[p][10]=Integer.toString(rs.getInt("rank"));
					datum[p][11]=rs.getString("status");
					p++;
					
					
				}
				for(int i=0;i<7;i++)
				{
					System.out.println();
					for(int j=0;j<12;j++)
						System.out.print(datum[i][j]+" ");
				}
				}catch(Exception e) {e.printStackTrace();}
				new Classexcelsheet(datum).setVisible(true);
			}
		});
		btnNewButton_1.setToolTipText("after consolidation see entire class results");
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(299, 229, 124, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SEE TOP 5");
		btnNewButton_2.setToolTipText("after consolidation see top 5 students");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n[]=new String[5];
				int r[]=new int[5];
				try
				{
					rs=s.executeQuery("select name,rank  from "+tablename+" order by rank");
					
					int counts=0;
					while(rs.next())
					{
						if(counts==5)
							break;
						else
						{
							n[counts]=rs.getString("name");
							r[counts]=rs.getInt("rank");
							counts++;
						}
					}
					
				}catch(Exception e) {e.printStackTrace();}
				for(String i:n)
				{
					System.out.println(i);
				}
				new Toppersframe(n[0],n[1],n[2],n[3],n[4],r[0],r[1],r[2],r[3],r[4]).setVisible(true);
			}
		});
		btnNewButton_2.setForeground(SystemColor.textHighlight);
		btnNewButton_2.setBounds(299, 267, 124, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("SEARCH ANY STUDENT(regno)");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(278, 313, 170, 16);
		contentPane.add(lblNewLabel_6);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					int y=Integer.parseInt(textField_8.getText());
					rs=s.executeQuery("select * from "+tablename+" order by regno asc");
					while(rs.next())
					{
						if(rs.getInt("regno")==y)
						{
							new Findstudentframe(rs.getString("name"),rs.getInt("regno"),rs.getFloat("telm"),rs.getFloat("hinm"),rs.getFloat("engm"),rs.getFloat("matm"),rs.getFloat("scim"),rs.getFloat("socm"),rs.getFloat("total"),rs.getFloat("percent"),rs.getInt("rank"),rs.getString("status"),tablename).setVisible(true);;
							break;
						}
					}
				}catch(Exception e) {}
			}
		});
		btnEnter.setForeground(SystemColor.textHighlight);
		btnEnter.setBounds(317, 362, 97, 25);
		contentPane.add(btnEnter);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(12, 54, 63, 22);
		contentPane.add(lblName);
		
		JLabel lblRegno = new JLabel("REGNO");
		lblRegno.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegno.setBounds(12, 89, 64, 20);
		contentPane.add(lblRegno);
		
		textField_9 = new JTextField();
		textField_9.setBounds(72, 54, 140, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(72, 88, 140, 22);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblStatus = new JLabel("STATUS=");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(261, 114, 63, 22);
		contentPane.add(lblStatus);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(329, 113, 105, 25);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblTotalClassReport = new JLabel("Total Class Report :");
		lblTotalClassReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalClassReport.setBounds(278, 162, 145, 16);
		contentPane.add(lblTotalClassReport);
		
		JLabel lblcopyrightsashishsvgmailcom = new JLabel("\u00A9copyrights :ashishsv028@gmail.com");
		lblcopyrightsashishsvgmailcom.setForeground(Color.LIGHT_GRAY);
		lblcopyrightsashishsvgmailcom.setBounds(12, 419, 248, 16);
		contentPane.add(lblcopyrightsashishsvgmailcom);
		
		JLabel label = new JLabel("1.0.2018");
		label.setForeground(Color.LIGHT_GRAY);
		label.setBounds(406, 419, 63, 16);
		contentPane.add(label);
		
		textField_8 = new JTextField();
		textField_8.setBounds(307, 332, 116, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel(classname);
		lblNewLabel_7.setForeground(Color.BLUE);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(392, 10, 65, 22);
		contentPane.add(lblNewLabel_7);
		JButton btnNewButton_3 = new JButton("->");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					if(g==0) 
					{
					rs64=s.executeQuery("select * from "+studlist);
					g=1;
					}
				if(rs64.next())
				{
					textField_9.setText(rs64.getString("name"));
					textField_10.setText(Integer.toString(rs64.getInt("regno")));
				}
				}catch(Exception ae2) {};
			}
		});
		btnNewButton_3.setBounds(215, 51, 47, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("<-");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					if(rs64.previous())
					{
						System.out.println("bacj");
						textField_9.setText(rs64.getString("name"));
						textField_10.setText(Integer.toString(rs64.getInt("regno")));
					}
				}catch(Exception er) {}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(215, 85, 47, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("REPORT");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					rs65=s.executeQuery("select * from "+studlist+" where regno="+Integer.parseInt(textField_8.getText()));
					while(rs65.next()) {
					System.out.println("tm:"+teachermail+"pm:"+rs65.getString("emailid"));
					new SendGmail(teachermail,rs65.getString("emailid"),textField_8.getText(),rs65.getString("name")).setVisible(true);}
				}catch(Exception rt) {rt.printStackTrace();}
				
			}
		});
		btnNewButton_5.setForeground(SystemColor.textHighlight);
		btnNewButton_5.setBounds(317, 390, 97, 25);
		contentPane.add(btnNewButton_5);
		//-------------------------------------------------------------------------


	}
}

