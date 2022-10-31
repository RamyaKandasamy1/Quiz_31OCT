import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Quiz extends JFrame {

	protected static final String String = null;


	private JPanel contentPane;
	

	  String questions[][] = new String[10][5];
	    String answers[][] = new String[10][2];
	    String useranswers[][] = new String[10][1];
	int index=0;
	int correct=0;
	
	 public static int timer = 15;
	    public static int ans_given = 0;
	    public static int count = 0;
	    public static int score = 0;
	 ButtonGroup groupoptions = new ButtonGroup();


	public String name;
	private JTextField g;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz frame = new Quiz(String );
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
	public Quiz(String name) {
		
		this.name=name;
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 708);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 166, 844, 495);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_Question = new JPanel();
		panel_Question.setBackground(new Color(208, 210, 206));
		panel_Question.setBounds(10, 84, 824, 144);
		panel.add(panel_Question);
		panel_Question.setLayout(null);
		
		JLabel qno = new JLabel("New label");
		qno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		qno.setBounds(10, 53, 37, 54);
		panel_Question.add(qno);
		qno.setText("1.");
		
		JLabel question = new JLabel("New label");
		question.setFont(new Font("Tahoma", Font.PLAIN, 20));
		question.setBounds(57, 42, 746, 76);
		panel_Question.add(question);
		
		
		
		 
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is local variable?";
        questions[1][1] = "Variables defined inside methods,constructors or blocks";
        questions[1][2] = "Variables defined outside methods,constructors or blocks";
        questions[1][3] = "Static Variables defined outside methods,constructors or blocks";
        questions[1][4] = "None of the above";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "What is JVM?";
        questions[3][1] = "Java Virtual Machine";
        questions[3][2] = "Java Machine";
        questions[3][3] = "Java Virtual";
        questions[3][4] = "Java Real Machine";

        questions[4][0] = "What block of code always executes in a try-catch-finally block?";
        questions[4][1] = "finally block";
        questions[4][2] = "catch block";
        questions[4][3] = "try block";
        questions[4][4] = "None of the above";

        questions[5][0] = "Which among the following is the reserved keyword in Java?";
        questions[5][1] = "new";
        questions[5][2] = "more";
        questions[5][3] = "less";
        questions[5][4] = "gain";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        answers[0][1] = "JDB";
        answers[1][1] = "Variables defined inside methods,constructors or blocks";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "finally block";
        answers[5][1] = "new";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
        List<java.lang.String[]> intList = Arrays.asList(questions);

		Collections.shuffle(intList);
		System.out.println(intList);
		
        question.setText(""+questions[count][0]);
		JRadioButton opt1 = new JRadioButton("New radio button");
		groupoptions.add(opt1);
		opt1.setText(questions[count][1]);
		opt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		opt1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		opt1.setBounds(30, 264, 757, 21);
		panel.add(opt1);
		
		JRadioButton opt2 = new JRadioButton("New radio button");
		groupoptions.add(opt2);
		opt2.setText(questions[count][2]);
		opt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opt2.getText()==(answers[0][1])) {
					score=5;
				}
				else 
					score=0;
				//opt1.setText(questions[count][2]);
			}
		});
		opt2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		opt2.setBounds(30, 308, 757, 21);
		panel.add(opt2);
		
		JRadioButton opt3 = new JRadioButton("New radio button");
		groupoptions.add(opt3);
		opt3.setText(questions[count][3]);
		opt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//opt1.setText(questions[count][3]);
				
			}
		});
		opt3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		opt3.setBounds(30, 352, 757, 21);
		panel.add(opt3);
		
		JRadioButton opt4 = new JRadioButton("New radio button");
		groupoptions.add(opt4);
		opt4.setText(questions[count][4]);
		opt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//opt1.setText(questions[count][4]);
			}

			
		
				});
		opt4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		opt4.setBounds(30, 393, 757, 21);
		panel.add(opt4);
		JButton submit = new JButton("SUBMIT");
		  submit.setEnabled(false);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ans_given = 1;
		            if (groupoptions.getSelection() == null) {
		                useranswers[count][0] = "";
		            } else {
		                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
		            }

		            for (int i = 0; i < useranswers.length; i++) {
		            	//System.out.println((useranswers[i][0]).equals((answers[i][1])));
		            	count+=1;
		                if ((useranswers[i][0])==(answers[i][1])) {
		                	
		                    score +=5;;
		                    System.out.println("Score"+score);
		                    
		                } else {
		                    score -=2;
		                    System.out.println("Score 1"+score);
		                }
		            }
				JOptionPane.showMessageDialog(submit,"Score"+score);
				
				count=0;
				
				new Score(name,score).setVisible(true);
				//groupoptions.clearSelection();
				
				
				//qno.setText(""+(count+1)+"");
				score=0;
				dispose();
			}
		}); 
		submit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		submit.setBounds(325, 448, 149, 26);
		panel.add(submit);
		
		
		JButton next = new JButton("NEXT");
		next.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == next) {
			            //repaint();
			            opt1.setEnabled(true);
			            opt2.setEnabled(true);
			            opt3.setEnabled(true);
			            opt4.setEnabled(true);
			            
			            ans_given = 1;
			            if (groupoptions.getSelection() == null) {
			               useranswers[count][0] = "";
			            } else {
			                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
			            }
			            
			            if (count == 8) {
			                next.setEnabled(false);
			                submit.setEnabled(true);
			            }
			            
			            count++;
			            start(count);
			            ans_given = 1;
			            if (groupoptions.getSelection() == null) {
			                useranswers[count][0] = "";
			                System.out.println("hi");			 
			                } else {
			                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
			                System.out.println("Hello");
			            }
			            
			            System.out.println(count);
			            System.out.println("score"+score);
			            System.out.println( useranswers[count][0]);
			        } else if (e.getActionCommand().equals("submit")) {
			            ans_given = 1;
			            if (groupoptions.getSelection() == null) {
			                useranswers[count][0] = "";
			            } else {
			                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
			            }

			            for (int i = 0; i < useranswers.length; i++) {
			                if (useranswers[i][0]==(answers[i][1])) {
			                    score += 5;
			                	
			                    System.out.println("Correct score"+score);
			                } else {
			                    score -=2;
			                    System.out.println("incorrect score"+score);
			                }
			            }
			            setVisible(false);
			            
			            
			           new Score(name, score);
			           
			          dispose();
			        }
				
			    }
			
			private void start(int count) {
				
				 
			  
			        qno.setText("" + (count + 1) + ". ");
			        question.setText(questions[count][0]);
			        opt1.setText(questions[count][1]);
			        opt1.setActionCommand(questions[count][1]);
			        
			        opt2.setText(questions[count][2]);
			        opt2.setActionCommand(questions[count][2]);
			        
			        opt3.setText(questions[count][3]);
			        opt3.setActionCommand(questions[count][3]);
			        
			        opt4.setText(questions[count][4]);
			        opt4.setActionCommand(questions[count][4]);
			        
			        groupoptions.clearSelection();
			    }
				// TODO Auto-generated method stub
			
			
				
			
			    
		});
		next.setBounds(164, 448, 111, 26);
		panel.add(next);
		
		JButton Exit = new JButton("EXIT");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		Exit.setBounds(506, 448, 111, 26);
		panel.add(Exit);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ramz8\\Pictures\\Saved Pictures\\Quiz.png"));
		lblNewLabel.setBounds(166, 10, 495, 217);
		contentPane.add(lblNewLabel);
		
	
	
	}



	protected void results() {
		// TODO Auto-generated method stub
		
	}

	protected void getSelectedOptions(JRadioButton radioButton1) {
		// TODO Auto-generated method stub
		
		
	}
}
