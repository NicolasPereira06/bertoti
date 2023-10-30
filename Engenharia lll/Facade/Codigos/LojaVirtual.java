class LojaVirtual {

    private Estoque estoque;
    private Checkout checkout;

    public LojaVirtual() {
        estoque = new Estoque();
        checkout = new Checkout();
    }

    public void fazerPedidoCompra(String cliente, String[] suplementos) {
        System.out.println("Pedido de compra realizado por: " + cliente);

        for (String suplemento : suplementos) {
            if (estoque.verificar(suplemento)) {
                System.out.println("Colocando: " + suplemento + " ao pedido.");
            } else {
                System.out.println("Suplemento: " + suplemento + " não está disponível no momento.");
            }
        }

        double totalPreco = calcularPreco(suplementos);
        int pedidoId = 423436;

        checkout.efetuarCheckout(pedidoId, totalPreco);
        enviarEmailConfirmacao(cliente, pedidoId);
    }

    public void rastrearPedidoCompra(int pedidoId) {
        System.out.println("Pedido #" + pedidoId + " está a caminho.");
    }

    private double calcularPreco(String[] suplementos) {
        double total = 0;
        return total;
    }

    private void enviarEmailConfirmacao(String cliente, int pedidoId) {
        System.out.println("Enviando email de confirmação de compra para: " + cliente);
    }
}