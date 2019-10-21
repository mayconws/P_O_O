package principal;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class TelaFrasesDoDia extends JInternalFrame implements ActionListener{
	
	private FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
	JLabel teste = new JLabel();
	JButton btfrase = new JButton();
	
	String[] frases = {"Eu n�o sei o que quero ser, mas sei muito bem o que n�o quero me tornar. - Friedrich Nietzsche", 
				"S� sei que nada sei, e o fato de saber isso, me coloca em vantagem sobre aqueles que acham que sabem alguma coisa. - S�crates",
				"Podemos julgar o cora��o de um homem pela forma como ele trata os animais. - Immanuel Kant",
				"Basta ajuizar bem para bem fazer, e julgar o melhor que nos seja poss�vel para fazermos tamb�m o nosso melhor. - Ren� Descartes",
				"Ao examinarmos os erros de um homem, conhecemos o seu car�ter. - Conf�cio",
				"Um homem esperto cria mais oportunidades do que encontra. - Francis Bacon",
				"N�o espere por uma crise para descobrir o que � importante em sua vida. - Plat�o"};				
	
	public TelaFrasesDoDia() {
		super("Frases do Dia", true, true, true);
		
		setSize(400,200);
		setVisible(true);		
		setLayout(layout);	
		btfrase = new JButton("Gerar Frases");	    
		add(btfrase);
		
		btfrase.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
        int numero = new Random().nextInt(frases.length);
		
		if(e.getSource() == btfrase) {
			JOptionPane.showMessageDialog(null,frases[numero]);
		}		
	}
}
