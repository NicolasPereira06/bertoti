public class GerenciadorNotificacao {

    private static GerenciadorNotificacao instance;
    
    private GerenciadorNotificacao() {
    }
    
    public static GerenciadorNotificacao getInstance() {
        if (instance == null) {
            instance = new GerenciadorNotificacao();
        }
        return instance;
    }
    
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando Notificação: " + mensagem);
    }
}