package objeto;

public class Positivo {
	
	private int numero;
	
	public int getNumero() {
		
		return numero;
	}
	
	public void setNumero(int novoValor) {
	
		if (novoValor <= 10 || novoValor >= -10) {
		
		numero = novoValor;
		
		}	
				
	}
	
	public boolean verificar() {
		
		if (numero >= 0) {
			return true;
		
		} else {
			
			return false;
		}
	}

}
