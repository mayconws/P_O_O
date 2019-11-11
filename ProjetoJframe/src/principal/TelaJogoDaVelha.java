package principal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class TelaJogoDaVelha extends JInternalFrame implements ActionListener {	
	
	private Botao[][] botoes = new Botao[3][3];
	
	ImageIcon verde = new ImageIcon(getClass().getResource("bt_verde.png"));
	ImageIcon vermelho = new ImageIcon(getClass().getResource("bt_vermelho.png"));
	GridLayout layout = new GridLayout(3, 3);
	
	private int contadorCliques = 0;	
		
	public TelaJogoDaVelha() {
		
		super("Jogo da velha", true, true, true);
		setLayout(layout);		
		setSize(600,400);
		setVisible(true);
		
		 for(int x = 0; x < botoes.length; x ++){
		      for(int y = 0; y < 3; y ++){
		        botoes[x][y] = new Botao();
		        this.add(botoes[x][y]);
		        botoes[x][y].addActionListener(this);
		      }
		    } 		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		for(int x = 0; x < 3; x ++){
		      for(int y = 0; y < 3; y++){
		        if(evento.getSource() == botoes[x][y]){
		          jogar(x,y,(contadorCliques % 2)+1);
		        }
		      }
		    }

		    if(contadorCliques == 9) terminarJogo(0);
		    
		    checarVencedorVertical();
		    checarVencedorHorizontal();
		    checarVencedorDiagonal1();
		    checarVencedorDiagonal2();
		    
		  }

		  //verificar se houve algum vencedor, caso haja, termina o jogo
		  private void checarVencedorVertical() {
			  
		    for(int y = 0; y < 3; y ++) {
		    	
		      int countJogador1 = 0;
		      int countJogador2 = 0;
		      
		      for(int x = 0; x < 3; x ++){
		        if(botoes[x][y].jogador == 1)countJogador1++;
		        else if(botoes[x][y].jogador == 2)countJogador2++;
		      }
		      
		      if(countJogador1 == 3) terminarJogo(1);
		      else if(countJogador2 == 3) terminarJogo(2);
		    }
		  }
		  //checa vencedor nas horizontais
		  private void checarVencedorHorizontal(){
		    for(int x = 0; x < 3; x ++) {
		    	
		      int countJogador1 = 0;
		      int countJogador2 = 0;
		      
		      for(int y = 0; y < 3 ; y ++) {
		    	  
		        if(botoes[x][y].jogador == 1)countJogador1++;
		        else if(botoes[x][y].jogador == 2)countJogador2++;
		      }
		      
		      if(countJogador1 == 3) terminarJogo(1);
		      else if(countJogador2 == 3) terminarJogo(2);
		    }
		    
		  }
		  //checa vencedor na primeira diagonal
		  private void checarVencedorDiagonal1() {
			  
		    int countJogador1 = 0;
		    int countJogador2 = 0;
		    
		    for(int x = 0; x < 3; x ++) {
		    	
		      if(botoes[x][x].jogador == 1)countJogador1++;
		      else if(botoes[x][x].jogador == 2)countJogador2++;
		      
		    }
		    
		    if(countJogador1 == 3) terminarJogo(1);
		    else if(countJogador2 == 3) terminarJogo(2);
		  }
		  //checa vencedor na segunda diagonal
		  private void checarVencedorDiagonal2() {
			  
		    int countJogador1 = 0;
		    int countJogador2 = 0;
		    for(int x=0;x<3;x++) {
		    	
		      if(botoes[x][2-x].jogador == 1)countJogador1++;
		      else if(botoes[x][2-x].jogador == 2)countJogador2++;
		    }
		    
		    if(countJogador1 == 3) terminarJogo(1);
		    else if(countJogador2 == 3) terminarJogo(2);
		    
		  }

		  // m�totodo executado quando o jogo termina
		  // se vencedor = 0 - empate
		  // se vencedor = 1 - jogador 1 ganhou
		  // se vencedor = 2 - jogador 2 ganhou
		  private void terminarJogo(int vencedor) {
			  
		    if(vencedor > 0) {
		      new MensagemVencedor(vencedor);
		    }
		    
		    for(int x = 0; x < 3; x ++){
		      for(int y = 0; y < 3;y ++){
		        botoes[x][y].setText("");
		        botoes[x][y].jogador = 0;
		        botoes[x][y].setEnabled(true);
		        contadorCliques=0;
		      }
		    }

		  }

		  // m�todo executado a cada jogada
		  // posX é a posição no arrayX do botão
		  // posY é a posição no arrayY do botão
		  // jogador é o número do jogador (ou 1 ou 2)
		  private void jogar(int posX,int posY, int jogador){
			  
		    String texto = (jogador==1) ? "X" : "O";
		    
		    if(jogador == 1) {
		    	 botoes[posX][posY].setIcon(verde);
		    }
		    if(jogador == 2) {
		    	 botoes[posX][posY].setIcon(vermelho);
		    }
		    
		    botoes[posX][posY].setText(texto);
		    botoes[posX][posY].jogador = jogador;
		    botoes[posX][posY].setEnabled(false);
		    contadorCliques++;
		  }		
	
}
