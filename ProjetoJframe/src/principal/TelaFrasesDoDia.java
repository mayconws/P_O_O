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
	
	String[] frases = {"Eu não sei o que quero ser, mas sei muito bem o que não quero me tornar. - Friedrich Nietzsche", 
				"Só sei que nada sei, e o fato de saber isso, me coloca em vantagem sobre aqueles que acham que sabem alguma coisa. - Sócrates",
				"Podemos julgar o coração de um homem pela forma como ele trata os animais. - Immanuel Kant",
				"Basta ajuizar bem para bem fazer, e julgar o melhor que nos seja possível para fazermos também o nosso melhor. - René Descartes",
				"Ao examinarmos os erros de um homem, conhecemos o seu caráter. - Confúcio",
				"Um homem esperto cria mais oportunidades do que encontra. - Francis Bacon",
				"Não espere por uma crise para descobrir o que é importante em sua vida. - Platão"};				
	
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
