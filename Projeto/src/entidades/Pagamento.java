package entidades;

public class Pagamento {
	private int id;
	private Pedido pedido;
	
	public Pagamento(int id, Pedido pedido) {
		this.id = id;
		this.pedido = pedido;
	}
	public Pagamento(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
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
		Pagamento other = (Pagamento) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\n[ID=" + id + ", pedido=" + pedido + "]";
	}
	
	
	
	
	
	
	
	
}
	
