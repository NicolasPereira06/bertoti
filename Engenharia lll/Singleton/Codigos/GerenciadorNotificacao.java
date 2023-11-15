public class GerenciadorNotificacao {

    private static GerenciadorNotificacao instance;
    
    private GerenciadorNotificacao() {}
    
    public GerenciadorNotificacao getInstance() {
        if (instance == null) {
            instance = new GerenciadorNotificacao();
        }
        return instance;
    }
    
    public enviarNotificacao(String mensagem) {
        System.out.println("Enviando Notificação: " + mensagem);
    }
}