package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private int id;
	private Date instante;
	private Endereco enderecoEntrega;
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	private Cliente cliente;
	private Pagamento pagamento;
	
	
	public Pedido(){
		
		
	}
	public Pedido(int id, Date instante, Endereco enderecoEntrega) {
		this.id = id;
		this.instante = instante;
		this.enderecoEntrega = enderecoEntrega;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
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
		Pedido other = (Pedido) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nPedido: \n[ID=" + id + ", Data do pedido=" + instante + "]\n" +"Endereço de entrega:\n"+ enderecoEntrega +"\nPagamento:\n"+ pagamento+""
				+ itens + "";
	}

	

	
	
	
	
	
}
