import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PlataformaVideos plataformaVideos = new plataformaVideos();
        plataformaVideos.addObserver(new Web());
        plataformaVideos.addObserver(new App());
        Video video01 = new Video("Fatos Curiosos Sobre os Tamanduás", new Date(), "Curiosidades", "Mundo Animalesco", "video.com.br");
        plataformaVideos.addVideo(video01);
    }
}