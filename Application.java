import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import java.awt.SystemColor;


public class Application extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private double  pmr=60;
	private double  pcr=100;
	private double  pmc=80;
	private double  pcl=200;
	private double  pbr=120;
	    
	private double  pl=30;
	private double  pcd=20;
	private double  pcoldc=40;
	private double  photc=20;
	private double  ps=40;
	private double total_meal=0.0;
	private double total_drink=0.0;
	private double bill=0.0;
	private double total=0.0;
	private double gst=0.0;
	private double x=0.0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
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
	public Application() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1038, 684);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		String initial="  Kitchen ETTE  ==================== Meals : -        Manchurian Rice  60 Chic. Fried Rice 100 Manchurian Chow. 80 Chicken Lollipop 200 Chicken Biryani  120 Drinks : -      Lassi            30  Cold Drink       20  Cold Coffee      40  Hot Coffee       20  Shakes           40              +18% GST";
		JTextArea textArea = new JTextArea(initial);
		textArea.setBackground(SystemColor.text);
		textArea.setTabSize(6);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 24));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(717, 129, 297, 508);
		contentPane.add(textArea);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(10, 10, 1004, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kitchen ETTE");
		lblNewLabel.setForeground(new Color(160, 82, 45));
		lblNewLabel.setFont(new Font("Mistral", Font.PLAIN, 80));
		lblNewLabel.setBounds(321, 20, 400, 63);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128), 4));
		panel_1.setBounds(10, 125, 322, 314);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Manchurian Rice");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(10, 62, 180, 42);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Meals");
		lblNewLabel_1.setBounds(113, 10, 95, 42);
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Chicken Fried Rice");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_1.setBounds(10, 114, 214, 42);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Manchurian Chowmien");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_2.setBounds(10, 166, 245, 42);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Chicken Biryani");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_3.setBounds(10, 218, 180, 42);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Chicken Lollipop");
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_4.setBounds(10, 262, 180, 42);
		panel_1.add(lblNewLabel_3_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner.setBounds(265, 78, 36, 20);
		panel_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_1.setBounds(265, 130, 36, 20);
		panel_1.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_2.setBounds(265, 182, 36, 20);
		panel_1.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_3.setBounds(265, 234, 36, 20);
		panel_1.add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_4.setBounds(265, 278, 36, 20);
		panel_1.add(spinner_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(105, 105, 105), 4));
		panel_2.setBounds(342, 125, 371, 314);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Drinks");
		lblNewLabel_2.setBounds(128, 9, 114, 42);
		lblNewLabel_2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_5 = new JLabel("Lassi");
		lblNewLabel_3_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_5.setBounds(10, 71, 180, 42);
		panel_2.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Cold Drink");
		lblNewLabel_3_6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_6.setBounds(10, 123, 180, 42);
		panel_2.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Cold Coffee");
		lblNewLabel_3_7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_7.setBounds(10, 176, 180, 42);
		panel_2.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Hot Coffee");
		lblNewLabel_3_8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_8.setBounds(10, 219, 180, 42);
		panel_2.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("Shake");
		lblNewLabel_3_9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_9.setBounds(10, 262, 180, 42);
		panel_2.add(lblNewLabel_3_9);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_5.setBounds(311, 71, 36, 20);
		panel_2.add(spinner_5);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_1_1.setBounds(311, 123, 36, 20);
		panel_2.add(spinner_1_1);
		
		JSpinner spinner_2_1 = new JSpinner();
		spinner_2_1.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_2_1.setBounds(311, 175, 36, 20);
		panel_2.add(spinner_2_1);
		
		JSpinner spinner_3_1 = new JSpinner();
		spinner_3_1.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_3_1.setBounds(311, 227, 36, 20);
		panel_2.add(spinner_3_1);
		
		JSpinner spinner_4_1 = new JSpinner();
		spinner_4_1.setModel(new SpinnerNumberModel(new Double(0), new Double(0), null, new Double(1)));
		spinner_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_4_1.setBounds(311, 271, 36, 20);
		panel_2.add(spinner_4_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(105, 105, 105), 4));
		panel_4.setBounds(10, 449, 322, 130);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3_10 = new JLabel("Cost of Meals");
		lblNewLabel_3_10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_10.setBounds(10, 10, 180, 42);
		panel_4.add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_3_10_1 = new JLabel("Cost of Drinks");
		lblNewLabel_3_10_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_10_1.setBounds(10, 65, 180, 42);
		panel_4.add(lblNewLabel_3_10_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 192, 203));
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(200, 12, 96, 35);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 192, 203));
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(203, 65, 96, 35);
		panel_4.add(textField_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(105, 105, 105), 4));
		panel_5.setBounds(342, 449, 371, 130);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3_10_2 = new JLabel("GST");
		lblNewLabel_3_10_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_10_2.setBounds(10, 10, 180, 42);
		panel_5.add(lblNewLabel_3_10_2);
		
		JLabel lblNewLabel_3_10_3 = new JLabel("Total");
		lblNewLabel_3_10_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3_10_3.setBounds(10, 62, 180, 42);
		panel_5.add(lblNewLabel_3_10_3);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 192, 203));
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(6);
		textField_2.setBounds(251, 14, 96, 35);
		panel_5.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 192, 203));
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(251, 69, 96, 35);
		panel_5.add(textField_3);
		
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				total_meal=((double)(spinner.getValue())*pmr)+((double)(spinner_1.getValue())*pcr)+((double)(spinner_2.getValue())*pmc)+((double)(spinner_3.getValue())*pbr)+((double)(spinner_4.getValue())*pcl);
				total_drink=((double)(spinner_5.getValue())*pl)+((double)(spinner_1_1.getValue())*pcd)+((double)(spinner_2_1.getValue())*pcoldc)+((double)(spinner_3_1.getValue())*photc)+((double)(spinner_4_1.getValue())*ps);
				textField.setText(total_meal+"");
				textField_1.setText(total_drink+"");
				total=total_meal+total_drink;
				gst=(0.18*total);
				x=Math.round(gst*100)/100.0;
				textField_2.setText(x+"");
				bill=total+x;
				textField_3.setText(bill+"");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnNewButton.setBounds(10, 589, 159, 48);
		contentPane.add(btnNewButton);
		
		JButton btnReciept = new JButton("Reciept");
		btnReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("  Kitchen ETTE  ====================                 Meals Total:-  "+total_meal+"                 Drinks Total:- "+total_drink+"                  GST:-          "+x+"                       Total Bill:-   "+bill);
			}
		});
		btnReciept.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnReciept.setBounds(192, 589, 159, 48);
		contentPane.add(btnReciept);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinner.setValue(0.0);
				spinner_1.setValue(0.0);
				spinner_2.setValue(0.0);
				spinner_3.setValue(0.0);
				spinner_4.setValue(0.0);
				spinner_5.setValue(0.0);
				spinner_1_1.setValue(0.0);
				spinner_2_1.setValue(0.0);
				spinner_3_1.setValue(0.0);
				spinner_4_1.setValue(0.0);
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textArea.setText("  Kitchen ETTE  ==================== Meals : -        Manchurian Rice  60 Chic. Fried Rice 100 Manchurian Chow. 80 Chicken Lollipop 200 Chicken Biryani  120 Drinks : -      Lassi            30  Cold Drink       20  Cold Coffee      40  Hot Coffee       20  Shakes           40              +18% GST");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnReset.setBounds(376, 589, 159, 48);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnExit.setBounds(554, 589, 159, 48);
		contentPane.add(btnExit);
		
	
	}
}
