package principal;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCalculadora extends JInternalFrame implements ActionListener{	
	
	private FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
	
	JTextField text1, text2;	
	JButton somar, dividir, subtrair, multiplicar;
	double num1, num2;
	
	public TelaCalculadora() {
		super("Calculadodra", true, true, true);
		setLayout(layout);
		setSize(400,200);
		setVisible(true);
	    
	    text1 = new JTextField(15);
	    text2 = new JTextField(15);
	    somar = new JButton("Somar");
	    subtrair = new JButton("Subtrair");
	    dividir = new JButton("Dividir");
	    multiplicar = new JButton("Multiplicar");    
	    
	    add(text1);
	    add(text2);
	    add(somar);
	    add(subtrair);
	    add(dividir);
	    add(multiplicar);
	    
	    somar.addActionListener(this);
	    subtrair.addActionListener(this);
	    multiplicar.addActionListener(this);
	    dividir.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			num1 = Double.parseDouble(text1.getText());
			num2 = Double.parseDouble(text2.getText());
			
			if(e.getSource() == somar) {
				JOptionPane.showMessageDialog(null, "O resultado da Soma é: " + (num1+num2));	
			}
			if(e.getSource() == subtrair) {
				JOptionPane.showMessageDialog(null, "O resultado da Subtração é: " + (num1-num2));	
			}
			if(e.getSource() == dividir) {
				JOptionPane.showMessageDialog(null, "O resultado da Divisão é: " + (num1/num2));	
			}
			if(e.getSource() == multiplicar) {
				JOptionPane.showMessageDialog(null, "O resultado da Multiplicação é: " + (num1*num2));	
			}
			
		} catch (Exception erro) {
			
			JOptionPane.showMessageDialog(null, "Digite valores válidos!");
			
		}		
	}

}
