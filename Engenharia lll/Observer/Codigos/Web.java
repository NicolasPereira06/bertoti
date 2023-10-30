import java.util.Date;

public class Web implements Observer{
    @Override
    public void atualizar(String titulo, Date dataPublicacao, String tipo, String nomeConta, String url) {
        System.out.println("Notificação da página Web");
    }
}