package principal;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class TelaCalculadora extends JInternalFrame implements ActionListener{
	
	private GridLayout layout = new GridLayout(3,3);
	
	public TelaCalculadora() {
		super("Calculadora", true, true, true);
		setLayout(layout);		
		setSize(400,300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton botaoClicado = (JButton) e.getSource();
		
	}

}
