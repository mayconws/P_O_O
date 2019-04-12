package entidade;

public class Cliente {
	
	private int id;
	private String clienteNome;
	private int rg;
	private int telefone;
	private int cidadeId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getClienteNome() {
		return clienteNome;
	}
	
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
		
	}
	
	public int getCidadeId() {
		return cidadeId;
	}
	
	public void setCidadeId(int cidadeId) {
		this.cidadeId = cidadeId;
	}
}
