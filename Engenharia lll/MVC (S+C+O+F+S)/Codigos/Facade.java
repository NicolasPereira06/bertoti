public class Facade {
    private Estoque estoque;
    private Controller controller;
    private List<View> views;

    public Facade() {
        estoque = new Estoque();
        controller = new Controller(estoque);
        views = new ArrayList<>();
    }

    public void addView(View view) {
        views.add(view);
        estoque.registerObserver(view);
    }

    public void emitirVisto() {
        controller.emitirVisto();
    }

    public void liberar() {
        controller.liberarVisto();
    }
}