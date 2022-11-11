public class Produto {

	private TipoProduto tipoProduto;
	private String encomenda;
	private double preco;

	public Produto(TipoProduto tipoProduto, String encomenda, double preco) {
		this.tipoProduto = tipoProduto;
		this.encomenda = encomenda;
		this.preco = preco;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getEncomenda() {
		return encomenda;
	}
	
	public void setEncomenda(String encomenda) {
		this.encomenda = encomenda;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}