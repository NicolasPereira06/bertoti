public class Sistema {
    private String visto;
    private int ano;

    public Sistema(String visto, int ano) {
        this.visto = visto;
        this.ano = ano;
    }

    public String getVisto() {
        return visto;
    }

    public int getAno() {
        return ano;
    }

    public boolean matches(Sistema sistema) {
        return this.visto.equals(sistema.getVisto()) && this.ano == sistema.getAno();
    }
}