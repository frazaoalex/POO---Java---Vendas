package entidades;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private int id;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Categoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Categoria(){
		
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
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
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
		Categoria other = (Categoria) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n[ID=" + id + "\nNome=" + nome + "]";
	}

	

	
	

	
	
}
