import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GraphicsConfiguration;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField weltextField;
	protected String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ramz8\\Pictures\\Saved Pictures\\R.png"));
		 String name1;
		 //this.name=;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 567);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter your name :");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(38,292,288,27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Code Quiz!!");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(174, 26, 362, 27);
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 23));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
	
		textField.setBounds(336, 292, 269, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		String s=textField.getText();
	
		
		JButton btnstart = new JButton("START");
		btnstart.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnstart.setEnabled(false);
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			       if (e.getSource() == btnstart ) {
			            String name = textField.getText();
			            //frame.setVisible(false);
			          
			         new Quiz(name).setVisible(true);
			          //  new OnlineTest(name).setVisible(true);
			          dispose();
			            
			        }
				
			}
		});
		
		btnstart.setBounds(349, 432, 164, 69);
		contentPane.add(btnstart);
		
		JButton btnexit = new JButton("EXIT");
		//btnexit.setVisible(false);
		btnexit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bye " +textField.getText());
				System.exit(0);
			}
		});
		btnexit.setBounds(604, 441, 130, 57);
		contentPane.add(btnexit);
		
		JButton readme = new JButton("Read Rules");
		readme.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//readme.setVisible(false);
		readme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnstart.setEnabled(true);
				JOptionPane.showMessageDialog(null, "Please find the below rules\r\n"
						+ "1.You will be prompted with 10 questions.\r\n"
						+ "2.Each questions will have 4 choices of answer.\r\n"
						+ "3.You need to choose the correct answer\r\n"
						+ "4.Incorrect answer leads to negative marking\r\n"
						+ "4.once you attempted all the questions you can see your result\r\n"
						+ "5.You can exit at any time\r\n"
						+ "6.All the best!!\r\n"
						+"7. Start the quiz by clicking START button");
				
			}
			
		});
		readme.setBounds(108, 432, 164, 66);
		
	
		contentPane.add(readme);
		
		weltextField = new JTextField();
		weltextField.setForeground(new Color(255, 0, 128));
		weltextField.setFont(new Font("Tahoma", Font.PLAIN, 25));
	
		weltextField.setBounds(231, 356, 331, 47);
		contentPane.add(weltextField);
		weltextField.setColumns(10);
		
		JButton btnok = new JButton("OK");
		btnok.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()!=null) {
					
					String s=textField.getText();
					weltextField.setVisible(true);
					weltextField.setText("Welcome  "+s+"!");
					//readme.setEnabled(true);
				
				
			}}
		});
		btnok.setBounds(649, 296, 85, 21);
		contentPane.add(btnok);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ramz8\\Pictures\\Saved Pictures\\welcome.png"));
		lblNewLabel_2.setBounds(51, 79, 683, 180);
		contentPane.add(lblNewLabel_2);
		//weltextField.setVisible(false);
		
		
		
		
		
	}
}
