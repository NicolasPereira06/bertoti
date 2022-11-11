import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	public void test() {
		Loja loja = new Loja();
		assertEquals(loja.getProduto().size(), 0);
		
		loja.comprarProdutos(new Produto (new TipoProduto("Feijão","Arroz", "OMU", "Vassoura"), "Delivery", 100.00));
		loja.comprarProdutos(new Produto (new TipoProduto("Macarrão","Uva", "Sabão", "Bucha"), "Delivery", 200.00));
		
		assertEquals(loja.getProduto().size(), 2);
		
		Produto produtosEncontrados=loja.comprarProdutosPorEncomenda("A");
		
		assertEquals(produtosEncontrados.getEncomenda().getNome(), "Delivery");
		
		List<Produto> produtosEncontrados= loja.buscarProdutoPorTipo(new TipoProduto("Feijão", "Alimentos", "Omu", "Esponja"));
		
		assertEquals(produtosEncontrados.get(0).getTipoProduto().getNome(), "Feijão");
		
		List<Produto> produtosEncontrados2= loja.buscarPrecos(100.00);
		
		assertEquals(produtosEncontrados2.get(0).getPreco(), "100.00");
	}
}

