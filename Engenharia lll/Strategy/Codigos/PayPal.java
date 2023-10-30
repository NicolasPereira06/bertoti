public class PayPal implements PagamentoStrategy {
    @Override
    public void pagar(int preco) {
        System.out.println("Pagando R$ " + preco + " com PayPal");
    }
}