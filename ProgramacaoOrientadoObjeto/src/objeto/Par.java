package objeto;

public class Par {
	
private int numero;
	
	public int getNumero() {
		
		return numero;
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
	}
	
	public boolean verificar() {
		
		if (numero % 2 == 0) {
			return true;
		
		} else {
			
			return false;
		}
	}
}