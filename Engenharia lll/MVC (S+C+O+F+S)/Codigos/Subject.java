import java.util.List;

public interface Subject {
    void registroObserver(Observer observer);
    void notifyObservers(List<Visto> encontrados);
}