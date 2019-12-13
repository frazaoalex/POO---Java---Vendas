package entidades;

public enum TipoCliente {
	PESSOAFISICA(1), PESSOAJURIDICA(2);
	
	public int cod;
	TipoCliente(int cod){
		this.cod = cod;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	
}
