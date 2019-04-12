package exercicios;

import javax.swing.JOptionPane;

public class LetraVogalConsoante {
	
	public static void main (String [] args) {
		
		String letra = JOptionPane.showInputDialog("Digite uma letra: ");

		if (letra == "a" || letra == "e" || letra == "e" || letra == "i" || letra == "u") {
			System.out.println("A letra digitada é uma Vogal!");

		} else {
			System.out.println("A letra digitada é uma consoante!");
		}
	}

}
