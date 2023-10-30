public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();

        PagamentoStrategy cartaoCreditoPagamento = new CartaoCredito();
        PagamentoStrategy paypalPagamento = new PayPal();
        PagamentoStrategy bitcoinPagamento = new Bitcoin();

        processadorPagamento.setPagamentoStrategy(cartaoCreditoPagamento);
        processadorPagamento.processoPagamento(100);

        processadorPagamento.setPagamentoStrategy(paypalPagamento);
        processadorPagamento.processoPagamento(50);

        processadorPagamento.setPagamentoStrategy(bitcoinPayment);
        processadorPagamento.processoPagamento(200);
    }
}