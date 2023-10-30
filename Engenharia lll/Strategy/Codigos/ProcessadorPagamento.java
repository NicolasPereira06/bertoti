public class ProcessadorPagamento {
    private PagamentoStrategy pagamentoStrategy;

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void processoPagamento(int preco) {
        pagamentoStrategy.pagar(preco);
    }
}