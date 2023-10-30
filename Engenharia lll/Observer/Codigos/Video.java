import java.util.Date;

public class Video {
    private String titulo;
    private Date dataPublicacao;
    private String tipo;
    private String nomeConta;
    private String url;

    public Video (String titulo, Date dataPublicacao, String tipo, String nomeConta, String url){
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.tipo = tipo;
        this.nomeConta = nomeConta;
        this.url = url;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}