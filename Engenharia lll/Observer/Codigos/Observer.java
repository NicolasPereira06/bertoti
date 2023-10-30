import java.util.Date;

public interface Observer {
    public void atualizar(String titulo, Date dataPublicacao, String tipo, String nomeConta, String url);
}