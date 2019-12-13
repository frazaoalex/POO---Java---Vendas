package teste;

import java.util.Arrays;
import java.util.Date;
import entidades.Cliente;
import entidades.Endereco;
import entidades.Cidade;
import entidades.Estado;
import entidades.Pedido;
import entidades.Pagamento;
import entidades.PagamentoCredito;
import entidades.PagamentoBoleto;
import entidades.Produto;
import entidades.Categoria;
import entidades.ItemPedido;
import entidades.TipoCliente;
import entidades.StatusPagamento;

public class Main {
	
	
	public static void main(String[] args) {
	
		Date data = new Date();//Cria objeto para data
		
		/*Criando e definindo objetos das classes*/
		
		Estado est1 = new Estado(1, "Ceará");
		Estado est2 = new Estado(2, "Maranhão");
		
		Cidade cd1 = new Cidade(1, "Fortaleza", est1);
		Cidade cd2 = new Cidade(2, "São Luis", est2);
		
		Endereco end1 = new Endereco(1, "Rua 3 de maio", "235", "casa 3A", "Bela vista", "60440580");
		end1.setCidade(cd1);
		Endereco end2 = new Endereco(2, "Rua 21 de Abreu", "35", "casa A", "Vista alta", "50456780");
		end2.setCidade(cd2);
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		Produto p1 = new Produto(1, "Notebook", 1500.00, cat1);
		Produto p2 = new Produto(2, "Impressora",350.00, cat1);
		Produto p3 = new Produto(3, "Cooktop", 600.00, cat2);
		
		cat1.setProdutos(Arrays.asList(p1, p2));
		cat2.setProdutos(Arrays.asList(p2,p3));
		
		Pedido ped1 = new Pedido(1, data, end1);
		Pedido ped2 = new Pedido(2, data, end2);
		
		
		Cliente cl1 = new Cliente(1, "Zezin da Chica Boa", "jose@gmail.com", "65314725896", TipoCliente.PESSOAFISICA);
		cl1.setTelefones(Arrays.asList("33843434","33853535","33863636"));
		cl1.setEnderecos(Arrays.asList(end1));
		cl1.setPedidos(Arrays.asList(ped1,ped2));		
		
		Cliente cl2 = new Cliente(2, "Diego Barros", "diegob@gmail.com", "75315725822", TipoCliente.PESSOAJURIDICA);
		cl2.setTelefones(Arrays.asList("88843435","33840021"));
		cl2.setEnderecos(Arrays.asList(end2));
		cl2.setPedidos(Arrays.asList(ped1));		
	
		Pagamento pagamento = new Pagamento(1 ,ped1);		
		PagamentoCredito pagCredito = new PagamentoCredito(1, ped1, 3);
		PagamentoBoleto pagBoleto = new PagamentoBoleto(1, ped2, data, data);
		
		ped1.setPagamento(pagCredito);
		ped2.setPagamento(pagBoleto);
		
		ItemPedido ip1 = new ItemPedido(0.00, 1, p1 , 1500.00);
		ItemPedido ip2 = new ItemPedido(0.00, 2, p3 , 350.00);
		ItemPedido ip3 = new ItemPedido(0.00, 1, p2 , 600.00);
		
		ped1.setItens(Arrays.asList(ip1, ip2));
		ped2.setItens(Arrays.asList(ip3, ip2));
		
		/*Exibindo os dados*/
		System.out.println(cl1+"\n"+cl2);
		
	}

}
