public class Controller {
    private Estoque estoque;

    public Controller(Estoque estoque) {
        this.estoque = estoque;
    }

    public void emitirVisto() {
        Visto visto = new Visto();
        Estoque estoque = new Estoque();
        estoque.addSistema(visto);
    }

    public void liberar() {
        List<Visto> encontrados = estoque.buscarSistema(new Sistema("ABC1234", 2023));
        for (Visto sistema : encontrados) {
            if (sistema instanceof VistoAmericano) {
                ((VistoAmericano) sistema).setVisto(new View());
            }
        }
        estoque.notifyObservers(encontrados);
    }
}