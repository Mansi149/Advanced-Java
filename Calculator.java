package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 357, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 13, 316, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=textField.getText();
				String n=s+btn7.getText();
				textField.setText(""+n);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 20));
		btn7.setBounds(22, 153, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=textField.getText();
				String n=s+btn8.getText();
				textField.setText(""+n);
			}
			
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 20));
		btn8.setBounds(101, 153, 61, 60);
		frame.getContentPane().add(btn8);
		  
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				String n=s+btn9.getText();
				textField.setText(""+n);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 20));
		btn9.setBounds(174, 153, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnmultiply = new JButton("X");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmultiply.setForeground(Color.ORANGE);
		btnmultiply.setFont(new Font("Arial", Font.BOLD, 20));
		btnmultiply.setBounds(268, 153, 60, 60);
		frame.getContentPane().add(btnmultiply);
		
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnAC.setForeground(Color.ORANGE);
		btnAC.setFont(new Font("Arial", Font.BOLD, 20));
		btnAC.setBounds(22, 70, 60, 60);
		frame.getContentPane().add(btnAC);
		
		JButton btnbackspace = new JButton("C");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				
				if(textField.getText().length()>0) {
				StringBuilder strb=new StringBuilder(textField.getText());
				strb.deleteCharAt(textField.getText().length()-1);
				backspace=strb.toString();
				textField.setText(backspace);
				}
				
			}
		});
		btnbackspace.setForeground(Color.ORANGE);
		btnbackspace.setFont(new Font("Arial", Font.BOLD, 20));
		btnbackspace.setBounds(99, 70, 60, 60);
		frame.getContentPane().add(btnbackspace);
		
		JButton btnpercentage = new JButton("%");
		btnpercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpercentage.setForeground(Color.ORANGE);
		btnpercentage.setFont(new Font("Arial", Font.BOLD, 20));
		btnpercentage.setBounds(176, 70, 60, 60);
		frame.getContentPane().add(btnpercentage);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndivide.setForeground(Color.ORANGE);
		btndivide.setFont(new Font("Arial", Font.BOLD, 20));
		btndivide.setBounds(268, 70, 60, 60);
		frame.getContentPane().add(btndivide);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				String n=s+btn4.getText();
				textField.setText(""+n);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 20));
		btn4.setBounds(22, 236, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				String n=s+btn5.getText();
				textField.setText(""+n);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 20));
		btn5.setBounds(99, 236, 60, 60);
		frame.getContentPane().add(btn5);
		 
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				String n=s+btn6.getText();
				textField.setText(""+n);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 20));
		btn6.setBounds(176, 236, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnminus.setForeground(Color.ORANGE);
		btnminus.setFont(new Font("Arial", Font.BOLD, 20));
		btnminus.setBounds(268, 236, 60, 60);
		frame.getContentPane().add(btnminus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				String n=s+btn1.getText();
				textField.setText(""+n);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		btn1.setBounds(22, 319, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				String n=s+btn2.getText();
				textField.setText(""+n);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 20));
		btn2.setBounds(99, 319, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				String n=s+btn3.getText();
				textField.setText(""+n);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 20));
		btn3.setBounds(176, 319, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnpluse = new JButton("+");
		btnpluse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnpluse.setForeground(Color.ORANGE);
		btnpluse.setFont(new Font("Arial", Font.BOLD, 20));
		btnpluse.setBounds(268, 319, 60, 60);
		frame.getContentPane().add(btnpluse);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				String n=s+btn0.getText();
				textField.setText(""+n);
				
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 20));
		btn0.setBounds(22, 402, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btndecimal = new JButton(".");
		btndecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Float.parseFloat(textField.getText());
				textField.setText("");
				operation=".";
			}
		});
		btndecimal.setForeground(Color.ORANGE);
		btndecimal.setFont(new Font("Arial", Font.BOLD, 20));
		btndecimal.setBounds(99, 402, 60, 60);
		frame.getContentPane().add(btndecimal);
		
		JButton btnequals = new JButton("=");
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=firstnum+secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=firstnum-secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=firstnum*secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=firstnum/secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=firstnum%secondnum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation==".") {
					answer=String.valueOf((int)firstnum)+"."+String.valueOf((int)secondnum);
					textField.setText(answer);
				}
				
			}
		});
		btnequals.setBackground(SystemColor.activeCaption);
		btnequals.setForeground(Color.ORANGE);
		btnequals.setBounds(268, 402, 60, 58);
		frame.getContentPane().add(btnequals);
		
		JButton btnplusminus = new JButton("+/-");
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnplusminus.setForeground(Color.ORANGE);
		btnplusminus.setBounds(176, 402, 58, 58);
		frame.getContentPane().add(btnplusminus);
		
		
	}
}
