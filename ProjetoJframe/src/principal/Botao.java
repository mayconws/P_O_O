package principal;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botao extends JButton {
	
	ImageIcon btMenu = new ImageIcon(getClass().getResource("botao_menu.png"));
	
	public int jogador;
	
	public Botao() {
	  
    setBackground(new Color(135,206,235));
    setIcon(btMenu);
    
  }
}
