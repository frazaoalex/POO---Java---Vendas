package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private TipoCliente tipoCliente;
	private List<String> telefones = new ArrayList();
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	private List<Pedido> pedidos = new ArrayList<Pedido>();


	
	public Cliente(int id, String nome, String email, String cpf, TipoCliente tipoCliente) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.tipoCliente = tipoCliente;
	}

	public Cliente(){
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public List<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nCliente:\n[ID=" + id + "\nNome=" + nome + "\nEmail=" + email + "\nCPF=" + cpf + "\nTipo do Cliente="
				+ tipoCliente + "\nTelefones=" + telefones + "\nEndereço do cliente:\n"+ enderecos+ "\n pedidos=" + pedidos + "]";
	}

	
	
	
}

