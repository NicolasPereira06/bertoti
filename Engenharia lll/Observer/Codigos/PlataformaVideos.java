import java.util.ArrayList;
import java.util.List;

public class PlataformaVideos {
    private List<Video> videos;
    private List<Observer> observers;

    public PlataformaVideos (){
        videos = new ArrayList<Video>();
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void notify(Video video){
        for (Observer observer:observers) {
            observer.update(video.getTitulo(), video.getDataPublicacao(), video.getTipo(), video.getNomeConta(), video.getUrl());
        }
    }
    public void addVideo(Video video){
        videos.add(video);
        this.notify(video);
    }
}