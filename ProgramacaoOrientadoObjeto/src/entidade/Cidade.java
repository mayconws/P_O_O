package entidade;

public class Cidade {
	
	private int id;
	private String cidadeNome;
	private int estadoId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getCidadeNome() {
		return cidadeNome;
	}
	
	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}
	
	public int getEstadoId() {
		return estadoId;
	}
	
	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
	}
}
