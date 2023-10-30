public class Main {
    public static void main(String[] args) {
        LojaVirtual lojaVirtual = new LojaVirtual();

        String cliente = "Nicolas";
        String[] suplementos = {"Creatina", "Whey", "Hipercalórico"};

        lojaVirtual.realizarPedido(cliente, suplementos);

        lojaVirtual.rastrearPedido(423436);
    }
}