public class Designer implements Funcionario {
  private String nome;
  private String conhecimento;
  private String experiencia;

  public Designer(String nome, String conhecimento, String experiencia) {
    this.nome = nome;
    this.conhecimento = conhecimento;
    this.experiencia = experiencia;
  }

    public void setCargoDesigner(String nome, String conhecimento, String experiencia){
        this.nome = nome;
        this.conhecimento = conhecimento;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return this.nome;
    }

    public String getConhecimento() {
        return this.conhecimento;
    }

    public String getExperiencia() {
        return this.experiencia;
    }

    @Override
    public void enviarCurriculo() {
        System.out.println("Enviando Curriculo: Nome: " + this.nome + "Conhecimento:  " + this.conhecimento + "Experiencia: " + this.experiencia);
    }
}