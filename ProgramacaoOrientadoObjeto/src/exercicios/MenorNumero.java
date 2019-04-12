package exercicios;

import javax.swing.JOptionPane;

public class MenorNumero {
	
	public static void main (String [] args) {		
		
		String numero1 = JOptionPane.showInputDialog("Digite um número: ");
		Integer valor1 = Integer.parseInt(numero1);
		
		String numero2 = JOptionPane.showInputDialog("Digite um outro número: ");
		Integer valor2 = Integer.parseInt(numero2);
		
		if (valor1 < valor2) {
			System.out.println("O menor valor é: "+valor1);
			
		} else {
			System.out.println("O menor valor é: "+valor2);
			
		} if (valor1 == valor2) {
			System.out.println("Números iguais! por favor digite outro número!");
		}
		
	}

}
