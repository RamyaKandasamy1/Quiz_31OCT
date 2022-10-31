import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GraphicsConfiguration;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.ImageIcon;

public class Score extends JFrame {

	private JPanel contentPane;
	private String name;
	private int score1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Score frame = new Score();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Score(String name,int score1) {
		this.name=name;
		this.score1=score1;
		//super(name,score1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(241, 241, 241));
		panel.setBounds(10, 22, 644, 197);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ramz8\\Pictures\\Saved Pictures\\Score.png"));
		lblNewLabel_3.setBounds(61, 5, 573, 192);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Your Final Score :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(33, 285, 269, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Do you want to replay the game again ?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(36, 363, 444, 47);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//new OnlineTest(name).setVisible(true);
				new Quiz(name).setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(90, 428, 106, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNo = new JButton("No");
		btnNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNo.setBounds(243, 428, 85, 44);
		contentPane.add(btnNo);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 128, 64));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(306, 293, 142, 40);
		contentPane.add(lblNewLabel_2);
		String s=Integer.toString(score1);
		lblNewLabel_2.setText(s);
		
		
	}

}
