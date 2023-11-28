import java.util.ArrayList;
import java.util.List;

public class Estoque implements Subject {
    private List<Visto> sistema;
    private List<Observer> observers;

    public Estoque() {
        sistema = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addSistema(Visto sistema) {
        this.sistema.add(sistema);
    }

    public void buscarSistema(Visto sistema) {
    
    }

    @Override
    public void registroObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(List<Visto> encontrados) {
        for (Observer observer : observers) {
            observer.atualizar(encontrados);
        }
    }
}