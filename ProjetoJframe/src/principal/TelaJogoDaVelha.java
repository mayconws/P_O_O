package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TelaJogoDaVelha extends JInternalFrame implements ActionListener {
	
	BotaoPersonalizado[] botoes = new BotaoPersonalizado[9];
	
	ImageIcon verde = new ImageIcon(getClass().getResource("bt_verde.png"));
	ImageIcon vermelho = new ImageIcon(getClass().getResource("bt_vermelho.png"));	
	
	JPanel layout = new JPanel(new GridLayout(3, 3, 8, 8));
	
	int rodadas = 0;
	
	final int JOGADOR_1 = 1;
	final int JOGADOR_2 = 2;
	
	int jogadorVez = JOGADOR_1;
	
	JLabel informacao = new JLabel("Jogador " + JOGADOR_1);
		
	public TelaJogoDaVelha() {
		super("Jogo da velha", true, true, true);
		add(BorderLayout.CENTER,layout);
		add(BorderLayout.NORTH,informacao);
		layout.setBackground(Color.BLACK);
		informacao.setFont(new Font("Arial",Font.BOLD,20));
		informacao.setForeground(new Color(50,200,50));
		informacao.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(600,400);
		setVisible(true);	
		
		for(int i=0; i < botoes.length; i++) {			
			BotaoPersonalizado botao = new BotaoPersonalizado();			
			botoes[i] = botao;		
			layout.add(botao);			
		}	
				
	}
	
	public class BotaoPersonalizado extends JButton{
		int quem = 0;
		
		public BotaoPersonalizado () {
			setBackground(new Color(184,202,212));
			addActionListener(e->{
				if(quem==0) {
					if(jogadorVez==JOGADOR_1) {
						setIcon(verde);
						quem = JOGADOR_1;
					} else {
						setIcon(vermelho);
						quem = JOGADOR_2;
					}
					if(testarVitoria(quem)) {
						JOptionPane.showMessageDialog(null,"Jogador "+ quem +" Venceu!");
						System.exit(0);
					}
					rodadas++;
					if(rodadas==9) {
						JOptionPane.showMessageDialog(null,"Ninguém venceu!");
						System.exit(0);
					}
					mudarVez();
				}
			});
		}
		
		public void mudarVez(){
			if(jogadorVez == 1) {
				jogadorVez = 2;
				informacao.setText("Jogador 2");
				informacao.setForeground(Color.RED);
			} else {
				jogadorVez = 1;
				informacao.setText("Jogador 1");
				informacao.setForeground(new Color(50,200,50));
			}
		}
		
		public boolean testarVitoria(int jog) {
			
			if(botoes[0].quem==jog && botoes[1].quem==jog && botoes[2].quem==jog) {
				return true;
			}
			if(botoes[3].quem==jog && botoes[4].quem==jog && botoes[5].quem==jog) {
				return true;
			}
			if(botoes[6].quem==jog && botoes[7].quem==jog && botoes[8].quem==jog) {
				return true;
			}
			if(botoes[0].quem==jog && botoes[3].quem==jog && botoes[6].quem==jog) {
				return true;
			}
			if(botoes[1].quem==jog && botoes[4].quem==jog && botoes[7].quem==jog) {
				return true;
			}
			if(botoes[2].quem==jog && botoes[5].quem==jog && botoes[8].quem==jog) {
				return true;
			}
			if(botoes[0].quem==jog && botoes[4].quem==jog && botoes[8].quem==jog) {
				return true;
			}
			if(botoes[2].quem==jog && botoes[4].quem==jog && botoes[6].quem==jog) {
				return true;
			}
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
