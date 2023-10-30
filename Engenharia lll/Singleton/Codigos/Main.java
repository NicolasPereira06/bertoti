public class Main {
    public static void main(String[] args) {
        GerenciadorNotificacao gerenciadorNotificacao = GerenciadorNotificacao.getInstance();

        gerenciadorNotificacao.enviarNotificacao("Nova notificação!");
    }
}