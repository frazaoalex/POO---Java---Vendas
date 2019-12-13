package entidades;

import java.util.Date;

public class PagamentoBoleto extends Pagamento{
	
	 
	private Date dataVencimento;
	private Date dataPagamento;
	
	
	public PagamentoBoleto(int id, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public PagamentoBoleto(){
		
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	@Override
	public String toString() {
		return "PagamentoBoleto [dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento + "]";
	}
	
	
	
	
	
	
}
