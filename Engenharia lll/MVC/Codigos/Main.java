import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Visto visto1 = new Visto();
        Visto visto2 = new Visto();
        Sistema sistema1 = new Sistema("DSA433", 2022);
        Sistema sistema2 = new Sistema("FDF543", 2021);

        View view1 = new View();
        View view2 = new View();
        estoque.registroObserver(view1);
        estoque.registroObserver(view2);

        estoque.addSistema(visto1);
        estoque.addSistema(visto2);

        List<Visto> encontrados = new ArrayList<>();
        for (Visto sistema : estoque.sistema) {
            if (sistema instanceof Sistema && ((Sistema) sistema).matches(sistema1)) {
                encontrados.add(sistema);
            }
        }

        estoque.notifyObservers(encontrados);

        for (Visto sistema : encontrados) {
            System.out.println("Sistema encontrado: " + ((Sistema) sistema).getVisto() + " - " + ((Sistema) sistema).getAno());
        }
    }
}