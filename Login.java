import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import deod.ConnectionProvider1;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
    private Connection cn;
    private Statement st;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		try {
			cn=ConnectionProvider1.getConnection();
			st=cn.createStatement();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 546);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(155, 136, 169, 56);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField.setBounds(396, 143, 183, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(155, 234, 156, 35);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(396, 238, 183, 35);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		btnNewButton.setForeground(new Color(139, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.setBounds(142, 343, 113, 44);
		contentPane.add(btnNewButton);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try {
			    	String user=textField.getText();
					String pass=passwordField.getText();
				    String query="select * from records where EmpId = '"+user+"'";
					ResultSet rs=st.executeQuery(query);
					if(rs.next()) {
						if(pass.contains(rs.getString(3))){
							Application.main(null);
						}
						else
							JOptionPane.showMessageDialog(null,"Wrong UserName/Password");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null,e1);
				}
				
			}
		});
		btnSignIn.setForeground(new Color(139, 0, 0));
		btnSignIn.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnSignIn.setBounds(434, 343, 145, 44);
		contentPane.add(btnSignIn);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME to Kitchen ETTE");
		lblNewLabel_2.setForeground(new Color(178, 34, 34));
		lblNewLabel_2.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(54, 47, 608, 44);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.ORANGE);
		separator.setBackground(Color.BLACK);
		separator.setBounds(0, 101, 755, 10);
		contentPane.add(separator);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show password");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else
					passwordField.setEchoChar('*');
			}
		});
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setBackground(new Color(255, 99, 71));
		chckbxNewCheckBox.setBounds(396, 289, 145, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setForeground(new Color(139, 0, 0));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnReset.setBounds(270, 418, 145, 44);
		contentPane.add(btnReset);
	}
}
