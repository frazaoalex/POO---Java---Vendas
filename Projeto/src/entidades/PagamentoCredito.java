package entidades;

public class PagamentoCredito extends Pagamento{

	private int parcelas;
	

	public PagamentoCredito(int id, Pedido pedido, int parcelas) {
		super(id, pedido);
		this.parcelas = parcelas;
	}
	

	public PagamentoCredito(){
		
	}


	public int getParcelas() {
		return parcelas;
	}


	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}



	@Override
	public String toString() {
		return "PagamentoCredito [parcelas=" + parcelas + "]";
	}
	
	
}
