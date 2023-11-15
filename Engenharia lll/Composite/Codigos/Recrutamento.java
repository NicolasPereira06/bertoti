import java.util.ArrayList;
import java.util.List;

public class Recrutamento implements Funcionario {
  private List<Funcionario> Funcionarios;
  private String nome;
  private String conhecimento;
  private String experiencia;

  public Recrutamento() {
    this.funcionarios = new ArrayList<>();
    this.nome = getFuncionarioNome();
    this.conhecimento = getFuncionarioConhecimento();
    this.experiencia = getFuncionarioExperiencia();
  }

  @Override
  public void contratar() {
    System.out.println("Contratando o funcionário: "+this.nome+ "com os conhecimentos: "+this.conhecimento+ "com as experiencia: "+this.experiencia);
  }

  public void addFuncionarios(Funcionario funcionario) {
    funcionarios.add(funcionario);
    this.nome += funcionario.getFuncionarioNome();
    this.conhecimento += funcionario.getFuncionarioConhecimento();
    this.experiencia += funcionario.getFuncionarioExperiencia();
  }

  public List<Funcionario> getFuncionarios() {
    return funcionarios;
  }
}