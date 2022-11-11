import java.util.LinkedList;
import java.util.List;

public class Loja {
	
	private List <Produto> produtos = new LinkedList<Produto>();

    public void comprarProdutos(Produto produto){
         produtos.add(produto);
    }

    public List<Produto> buscarProdutoPorTipo(TipoProduto tipoProduto){
          List<Produto> produtosEncontrados = new LinkedList<Produto>();
          for(Produto produtos:produtos){
               if(produtos.getTipoProduto().comparacao(tipoProduto)) produtosEncontrados.add(produtos);
          }
          return produtosEncontrados;
    }

    public Produto comprarProdutosPorEncomenda(String encomenda){
         for(Produto produto:produtos){
              if(produto.getEncomenda().equals(encomenda)) 
                  return produto; 
         }
         return null;
    }
    
    public Produto buscarPrecos(double precos){
        for(Produto produto:produtos){
             if(produto.getPreco() == precos) 
                 return produto; 
        }
        return null;
   }

    public List<Produto> getProduto(){
          return produtos;
    }
}