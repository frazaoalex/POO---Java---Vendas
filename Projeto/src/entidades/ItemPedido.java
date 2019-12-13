package entidades;

public class ItemPedido{ 
	private double desconto;
	private int quantidade;
	private Produto produto;
	private double preco;
	
	
	
	public ItemPedido( double desconto, int quantidade, Produto produto, double preco) {
		super();
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.produto = produto;
		this.preco = preco;
	}

	public ItemPedido(){
		
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	@Override
	public String toString() {
		return "\nItens do Pedido: \n[ Desconto=" + desconto + "\nQuantidade=" + quantidade + "" 
				+ "" + produto + "\nPreço=" + preco + "]";
	}
	
	
	
	
	
}
