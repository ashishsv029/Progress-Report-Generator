package consolidatepack;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
;public class Classexcelsheet extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classexcelsheet frame = new Classexcelsheet();
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
	public Classexcelsheet(String temp[][]) {
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(1, 1, 1350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setLayout(null);
		//String data[][]= {{"101","Amit","670000","A","B","C","D","F","TO","PER","RNK","STA"}};
		String cols[]= {"REG NO","NAME","TELUGU","HINDI","ENGLISH","MATHS","SCIENCE","SOCIAL","TOTAL","PERCENT","RANK","STATUS"};
		JTable jt=new JTable(temp,cols);
		//jt.setBounds(30,40,200,300);
		jt.setPreferredScrollableViewportSize(new Dimension(1300,300));
		//JScrollPane sp=new JScrollPane(jt);
		//contentPane.add(sp);
		//contentPane.add(new JScrollPane(jt));
		JScrollPane pn=new JScrollPane(jt);
		getContentPane().add(pn,BorderLayout.CENTER);
		
		//jt.setVisible(true);
	}

}
