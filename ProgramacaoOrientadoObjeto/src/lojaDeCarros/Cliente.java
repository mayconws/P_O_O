package lojaDeCarros;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Cliente {
	
	public String nome;
	public int rg;
	public int cpf;
	public int telefone;
	
public void inserir() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe seu nome: ");	
	nome = scan.nextLine();
	
	System.out.println("Informe seu rg: ");
	rg = scan.nextInt();
	
	System.out.println("Informe seu cpf: ");
	cpf = scan.nextInt();
	
	System.out.println("Informe seu telefone: ");
	telefone = scan.nextInt();	
	
}

public void imprimirCliente() {
	System.out.println("DADOS INFORMADOS: ");
	System.out.println("Nome: "+nome+"\nRG: "+rg+"\nCPF: "+cpf+"\nTelefone: "+telefone);
	
	
}
	
}

