package consolidatepack;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Consolidateframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consolidateframe frame = new Consolidateframe();
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
	public Consolidateframe(float tf,float tf1,float tf2,float tf3,float tf4,float tf5,float tf6,float tf7,float tf8,float tf9) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 395, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSchoolName = new JLabel("SCHOOL :");
		lblSchoolName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSchoolName.setForeground(Color.BLUE);
		lblSchoolName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchoolName.setBounds(26, 20, 130, 39);
		contentPane.add(lblSchoolName);
		
		JLabel lblLrgVidyalayam = new JLabel("LRG VIDYALAYAM");
		lblLrgVidyalayam.setForeground(Color.GRAY);
		lblLrgVidyalayam.setHorizontalAlignment(SwingConstants.CENTER);
		lblLrgVidyalayam.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLrgVidyalayam.setBounds(107, 12, 235, 51);
		contentPane.add(lblLrgVidyalayam);
		
		JLabel lblNewLabel = new JLabel("CLASS :");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(61, 72, 66, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblStrength = new JLabel("STRENGTH :");
		lblStrength.setForeground(Color.DARK_GRAY);
		lblStrength.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblStrength.setHorizontalAlignment(SwingConstants.CENTER);
		lblStrength.setBounds(12, 115, 87, 33);
		contentPane.add(lblStrength);
		
		JLabel lblPassed = new JLabel("PASSED :");
		lblPassed.setBackground(Color.DARK_GRAY);
		lblPassed.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassed.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassed.setBounds(12, 161, 73, 28);
		contentPane.add(lblPassed);
		
		textField = new JTextField();//STRENGTH
		textField.setEditable(false);
		textField.setBounds(100, 120, 80, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(); //passed
		textField_1.setEditable(false);
		textField_1.setBounds(100, 164, 80, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblClassAvg = new JLabel("CLASS AVG :");
		lblClassAvg.setForeground(Color.DARK_GRAY);
		lblClassAvg.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblClassAvg.setBounds(185, 119, 96, 25);
		contentPane.add(lblClassAvg);
		
		textField_2 = new JTextField();  //cla avg
		textField_2.setEditable(false);
		textField_2.setBounds(278, 120, 87, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPass = new JLabel("PASS % :");
		lblPass.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPass.setForeground(Color.DARK_GRAY);
		lblPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblPass.setBounds(195, 164, 73, 22);
		contentPane.add(lblPass);
		
		textField_3 = new JTextField();  //pass perc
		textField_3.setEditable(false);
		textField_3.setBounds(278, 164, 87, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("SUBJECT PASS % :");
		lblNewLabel_1.setBounds(12, 202, 144, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TELUGU :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 237, 73, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("HINDI :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(12, 272, 73, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ENGLISH :");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(12, 307, 73, 28);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(100, 237, 80, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(100, 272, 80, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(100, 310, 80, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblMaths = new JLabel("MATHS :");
		lblMaths.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaths.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMaths.setBounds(200, 237, 68, 19);
		contentPane.add(lblMaths);
		
		JLabel lblScience = new JLabel("SCIENCE :");
		lblScience.setHorizontalAlignment(SwingConstants.CENTER);
		lblScience.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblScience.setBounds(197, 274, 71, 19);
		contentPane.add(lblScience);
		
		JLabel lblSocial = new JLabel("SOCIAL :");
		lblSocial.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSocial.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocial.setBounds(195, 310, 73, 22);
		contentPane.add(lblSocial);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(278, 237, 87, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(278, 272, 87, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(278, 310, 87, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblTeacher = new JLabel("TEACHER :");
		lblTeacher.setForeground(Color.BLUE);
		lblTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacher.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTeacher.setBounds(194, 72, 87, 28);
		contentPane.add(lblTeacher);
		textField.setText(Float.toString(tf));
		textField_1.setText(Float.toString(tf1));
		textField_2.setText(Float.toString(tf2));
		textField_3.setText(Float.toString(tf3));
		textField_4.setText(Float.toString(tf4));
		textField_5.setText(Float.toString(tf5));
		textField_6.setText(Float.toString(tf6));
		textField_7.setText(Float.toString(tf7));
		textField_8.setText(Float.toString(tf8));
		textField_9.setText(Float.toString(tf9));
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setForeground(SystemColor.textHighlight);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnPrint.setBounds(145, 360, 97, 25);
		contentPane.add(btnPrint);
		
		
	}
}
