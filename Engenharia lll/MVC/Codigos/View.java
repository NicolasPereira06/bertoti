import java.util.List;

public interface View {
    void setVisto(Visto visto);
    void atualizar(List<Visto> vistoList);
    void imprimirDadosSistema();
    void liberarVisto();
}