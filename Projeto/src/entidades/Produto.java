package entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private Categoria categoria;
	List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public Produto(int id, String nome, double preco, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}
	public Produto(){
		
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nProduto: \n[ID=" + id + "\nNome=" + nome + "\nPreço=" + preco + "\nCategoria do produto:" + categoria + "]";
	}	
}
