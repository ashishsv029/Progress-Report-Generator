package consolidatepack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Toppersframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Toppersframe frame = new Toppersframe();
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
	public Toppersframe(String s1,String s2,String s3,String s4,String s5,int r1,int r2,int r3,int r4,int r5) {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 297, 427);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblToppers = new JLabel("TOPPERS");
		lblToppers.setBackground(Color.BLACK);
		lblToppers.setForeground(Color.RED);
		lblToppers.setHorizontalAlignment(SwingConstants.CENTER);
		lblToppers.setFont(new Font("Traditional Arabic", Font.BOLD, 23));
		lblToppers.setBounds(60, 13, 161, 51);
		contentPane.add(lblToppers);
		
		JLabel lblRank = new JLabel("RANK "+Integer.toString(r1)+" :");
		lblRank.setForeground(Color.CYAN);
		lblRank.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblRank.setBounds(12, 77, 86, 36);
		contentPane.add(lblRank);
		
		JLabel lblRank_1 = new JLabel("RANK "+Integer.toString(r2)+" :");
		lblRank_1.setForeground(Color.CYAN);
		lblRank_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblRank_1.setBounds(12, 126, 86, 36);
		contentPane.add(lblRank_1);
		
		JLabel lblRank_2 = new JLabel("RANK "+Integer.toString(r3)+" :");
		lblRank_2.setForeground(Color.CYAN);
		lblRank_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblRank_2.setBounds(12, 175, 86, 36);
		contentPane.add(lblRank_2);
		
		JLabel lblRank_3 = new JLabel("RANK "+Integer.toString(r4)+" :");
		lblRank_3.setForeground(Color.CYAN);
		lblRank_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblRank_3.setBounds(12, 224, 86, 36);
		contentPane.add(lblRank_3);
		
		JLabel lblRank_4 = new JLabel("RANK "+Integer.toString(r5)+" :");
		lblRank_4.setForeground(Color.CYAN);
		lblRank_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblRank_4.setBounds(12, 271, 86, 36);
		contentPane.add(lblRank_4);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setForeground(SystemColor.textHighlight);
		btnPrint.setBounds(83, 332, 97, 25);
		contentPane.add(btnPrint);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(105, 85, 162, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField_1.setEditable(false);
		textField_1.setBounds(105, 134, 162, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		textField_2.setEditable(false);
		textField_2.setBounds(105, 184, 162, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.WHITE);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField_3.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		textField_3.setEditable(false);
		textField_3.setBounds(105, 232, 162, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField_4.setEditable(false);
		textField_4.setBounds(105, 279, 162, 28);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		textField.setText(s1);
		textField_1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		textField_1.setText(s2);
		textField_2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		textField_2.setText(s3);
		textField_3.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		textField_3.setText(s4);
		textField_4.setBackground(UIManager.getColor("InternalFrame.inactiveTitleForeground"));
		textField_4.setText(s5);
	}

}
