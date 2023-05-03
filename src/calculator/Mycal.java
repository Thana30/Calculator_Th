package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mycal {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result=0;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mycal window = new Mycal();
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
	public Mycal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 332, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(10, 23, 298, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(10, 103, 54, 48);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(74, 103, 51, 48);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(135, 103, 51, 48);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(10, 160, 54, 48);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(74, 160, 51, 48);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(135, 160, 51, 48);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(10, 218, 54, 48);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(71, 218, 54, 48);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(135, 218, 51, 48);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(74, 276, 51, 48);
		frame.getContentPane().add(btn0);
		
		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				first=0;
				second=0;
				result=0;
			}
		});
		btnc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnc.setBounds(10, 276, 54, 48);
		frame.getContentPane().add(btnc);
		
		JButton btncom = new JButton(".");
		btncom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btncom.getText();
				textField.setText(number);
			}
		});
		btncom.setFont(new Font("Tahoma", Font.BOLD, 15));
		btncom.setBounds(135, 276, 51, 48);
		frame.getContentPane().add(btncom);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (first==0)
				{
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/"; 
				}
				else {
					
					first=first/Double.parseDouble(textField.getText());
					textField.setText("");
					operation="/"; 
				}
				
				
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		btndiv.setBounds(196, 103, 51, 48);
		frame.getContentPane().add(btndiv);
		
		JButton btnmul = new JButton("x");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Double.parseDouble(textField.getText()) !=0)
				{ 
					if (first==0)
						first=1;
					
				first=first*Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				}
				
				else {
					textField.setText("0");}
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnmul.setBounds(196, 160, 51, 48);
		frame.getContentPane().add(btnmul);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first==0)
				{
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-"; 
				}
				else {
					
					first=first-Double.parseDouble(textField.getText());
					textField.setText("");
					operation="-"; 
				}
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnsub.setBounds(196, 218, 51, 48);
		frame.getContentPane().add(btnsub);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=first+Double.parseDouble(textField.getText());
				
				textField.setText("");
				operation="+";
				
				//answer=String.format("%.2f", first);
				//textField.setText(answer);
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnadd.setBounds(196, 275, 51, 48);
		frame.getContentPane().add(btnadd);
		
		JButton btneq = new JButton("=");
		btneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second=Double.parseDouble(textField.getText());
				
				if (operation=="+")
				{
					
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					first=0;
					second=0;
				}
				
				else if (operation=="-")
		{
			
			result=first-second;
			answer=String.format("%.2f", result);
			textField.setText(answer);
			first=0;
			second=0;
		}
				
				
				else if (operation=="*")
				{
					
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					first=0;
					second=0;
				}	
				
				else if (operation=="/")
				{
					
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					first=0;
					second=0;
					
				}
				
			}
		});
		btneq.setFont(new Font("Tahoma", Font.BOLD, 15));
		btneq.setBounds(257, 160, 51, 48);
		frame.getContentPane().add(btneq);
		
		JButton btnback = new JButton("\uF0E7");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back= null;
				if (textField.getText().length()>0)
				{
				StringBuilder str = new StringBuilder (textField.getText());  
				str.deleteCharAt(textField.getText().length()-1);
					back=str.toString();
					textField.setText(back);
				}
				
				}
				
			
		});
		btnback.setFont(new Font("wingdings", Font.BOLD, 15));
		btnback.setBounds(257, 103, 51, 48);
		frame.getContentPane().add(btnback);
	}
}
