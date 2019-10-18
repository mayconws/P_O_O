package principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class TelaJogoDaVelha extends JInternalFrame implements ActionListener {
	
	List<JButton> botoes = new ArrayList<JButton>();
	private String ValorAtual = "X";
	
	private GridLayout layout = new GridLayout(3,3);
		
	public TelaJogoDaVelha() {
		super("Jogo da velha", true, true, true);
		setLayout(layout);		
		JButton botao;
		for(int i=0; i < 9; i++) {			
			botao = new JButton();			
			botoes.add(botao);
			botao.setPreferredSize(new Dimension(50, 50));
			botao.addActionListener(this);
			add(botao);
		}		
		setSize(400,300);
		setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botaoClicado = (JButton) e.getSource();
		
		
		
		ValorAtual = ValorAtual == "X" ? "0": "X";
		botaoClicado.setText(ValorAtual);				
		
		if(ValorAtual == "X") {
			botaoClicado.setBackground(Color.red);
			
		} else {
			botaoClicado.setBackground(Color.blue);
		}
				
	}
		
}	
