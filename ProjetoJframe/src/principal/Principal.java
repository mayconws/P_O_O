package principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame implements ActionListener{
	
	private JMenuBar jmb = new JMenuBar();
	
	private JMenu menu = new JMenu("Menu");		
	
	private JMenuItem jogoVelha = new JMenuItem("Jogo da Velha");
	private JMenuItem calculadora = new JMenuItem("Calculadora");
	private JMenuItem frases = new JMenuItem("Frases do Dia");
	
	private JDesktopPane desk = new JDesktopPane();
	private TelaJogoDaVelha tjv;
	private TelaCalculadora tcal;
	private TelaFrasesDoDia tfr;
	
	public Principal() {
		definir("Tela Principal");		
	}
	
	public Principal(String titulo) {
		definir(titulo);
	}
	
	private void definir(String titulo) {
		setTitle(titulo);
		setSize(800, 600);
		setJMenuBar(jmb);
		jmb.add(menu);				
		
		menu.add(jogoVelha);		
		menu.add(calculadora);
		menu.add(frases);
		
		jogoVelha.addActionListener(this);
		desk.setBackground(Color.gray);
		add(desk);
		setVisible(true);
		
		calculadora.addActionListener(this);
		add(desk);
		setVisible(true);
		
		frases.addActionListener(this);
		add(desk);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		String t = "Jogos Divertidos 1.0";
		Principal p = new Principal(t);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jogoVelha) {
			if(tjv == null) {
				tjv = new TelaJogoDaVelha();			
				desk.add(tjv);			
			}
		}
		
		if(e.getSource() == calculadora) {
			if(tcal == null) {
				tcal = new TelaCalculadora();			
				desk.add(tcal);			
			}
		}
		
		if(e.getSource() == frases) {
			if(tfr == null) {
				tfr = new TelaFrasesDoDia();			
				desk.add(tfr);			
			}
		}
	}

}
