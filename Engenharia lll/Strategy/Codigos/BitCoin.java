public class Bitcoin implements PagamentoStrategy {
    @Override
    public void pagar(int preco) {
        System.out.println("Pagando R$ " + preco + " com Bitcoin");
    }
}