package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.ButtonGroup;
public class Calci {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
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
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 817);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("YouYuan", Font.BOLD, 47));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 41));
		lblNewLabel.setBounds(10, 10, 773, 62);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 35));
		textField.setBounds(10, 65, 542, 79);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnRoot = new JButton("√");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnRoot.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnRoot.setBounds(10, 210, 108, 79);
		frame.getContentPane().add(btnRoot);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnx.setBounds(10, 293, 108, 79);
		frame.getContentPane().add(btnx);
		
		JButton btnPower = new JButton("x^y");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "x^y";
				
			}
		});
		btnPower.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnPower.setBounds(10, 375, 108, 79);
		frame.getContentPane().add(btnPower);
		
		JButton btnCube = new JButton("x^3");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a= a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCube.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnCube.setBounds(10, 455, 108, 79);
		frame.getContentPane().add(btnCube);
		
		JButton btnSquare = new JButton("x^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSquare.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnSquare.setBounds(10, 535, 108, 79);
		frame.getContentPane().add(btnSquare);
		
		JButton btnFact = new JButton("n!");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0)
				{
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnFact.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnFact.setBounds(10, 615, 108, 79);
		frame.getContentPane().add(btnFact);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnPlusMinus.setBounds(10, 694, 108, 79);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnEx.setBounds(118, 210, 108, 79);
		frame.getContentPane().add(btnEx);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnLog.setBounds(118, 293, 108, 79);
		frame.getContentPane().add(btnLog);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnPercent.setBounds(118, 375, 108, 79);
		frame.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn7.setBounds(118, 455, 108, 79);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn4.setBounds(118, 535, 108, 79);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn1.setBounds(118, 615, 108, 79);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn0.setBounds(118, 694, 216, 79);
		frame.getContentPane().add(btn0);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnSin.setBounds(226, 210, 108, 79);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnSinh.setBounds(226, 293, 108, 79);
		frame.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("Cl");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnClear.setBounds(226, 375, 108, 79);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn8.setBounds(226, 455, 108, 79);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn5.setBounds(226, 535, 108, 79);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn2.setBounds(226, 615, 108, 79);
		frame.getContentPane().add(btn2);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnCos.setBounds(335, 210, 108, 79);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnCosh.setBounds(335, 293, 108, 79);
		frame.getContentPane().add(btnCosh);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
			
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 26));
		btnBackSpace.setBounds(335, 375, 108, 79);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn9.setBounds(335, 455, 108, 79);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn6.setBounds(335, 535, 108, 79);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("YouYuan", Font.BOLD, 26));
		btn3.setBounds(335, 615, 108, 79);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnDot.setBounds(335, 694, 108, 79);
		frame.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnTan.setBounds(445, 210, 108, 79);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnTanh.setBounds(445, 293, 108, 79);
		frame.getContentPane().add(btnTanh);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				
			}
		});
		btnAdd.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnAdd.setBounds(445, 375, 108, 79);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnSub.setBounds(445, 455, 108, 79);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnMul.setBounds(445, 535, 108, 79);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnDivide.setBounds(445, 615, 108, 79);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result = first + second;
					answer = String.format("% 2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result = first - second;
					answer = String.format("% 2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result = first * second;
					answer = String.format("% 2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result = first / second;
					answer = String.format("% 2f",result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result = first % second;
					answer = String.format("% 2f",result);
					textField.setText(answer);
				}
				else if(operation=="x^y")
				{
					double resultt =1;
					for(int i =0;i<second;i++)
					{
						resultt = first * resultt;
					}
					answer = String.format("% 2f",resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("YouYuan", Font.BOLD, 26));
		btnEqual.setBounds(445, 694, 108, 79);
		frame.getContentPane().add(btnEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On\r\n");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMul.setEnabled(true);
				btnDivide.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnRoot.setEnabled(true);
				btnLog.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnx.setEnabled(true);
				btnSquare.setEnabled(true);
				btnCube.setEnabled(true);
				btnFact.setEnabled(true);
				btnPercent.setEnabled(true);
				btnEqual.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnPower.setEnabled(true);
				btnEx.setEnabled(true);
				btnClear.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Calibri", Font.BOLD, 24));
		rdbtnNewRadioButton.setBounds(15, 173, 103, 31);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Off");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnRoot.setEnabled(false);
				btnLog.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnx.setEnabled(false);
				btnSquare.setEnabled(false);
				btnCube.setEnabled(false);
				btnFact.setEnabled(false);
				btnPercent.setEnabled(false);
				btnEqual.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnPower.setEnabled(false);
				btnEx.setEnabled(false);
				btnClear.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Calibri", Font.BOLD, 24));
		rdbtnNewRadioButton_1.setBounds(123, 173, 103, 31);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
