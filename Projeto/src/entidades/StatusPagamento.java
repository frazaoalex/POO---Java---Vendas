package entidades;

public enum StatusPagamento {
	PENDENTE(1), QUITADO(2), CANCELADO(3);
	
	public int cod;
	StatusPagamento(int cod){
		this.cod = cod;
	}
}
