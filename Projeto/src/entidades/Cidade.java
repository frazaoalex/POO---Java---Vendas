package entidades;

public class Cidade {
	private int id;
	private String nome;
	private Estado estado;
	
	
	public Cidade(int id, String nome, Estado estado) {
		this.id = id;
		this.nome = nome;
		this.estado = estado;
	}
	public Cidade(){
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nCidade:\n[ID=" + id + "\nNome=" + nome + "\n" + estado + "]";
	}
	
		
}
