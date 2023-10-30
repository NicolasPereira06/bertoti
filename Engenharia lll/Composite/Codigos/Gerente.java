import java.util.ArrayList;
import java.util.List;

class Gerente extends Funcionario {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private String name;
    private String salario;

    public GerenteNome(String name) {
        this.name = name;
    }

    public GerenteSalario(String salario) {
        this.salario = salario;
    }

    @Override
    void getNome() {
        System.out.println("Nome do Funcionário: " + name);
    }

    @Override
    void getSalario() {
        System.out.println("Salário do Gerente: " + salario);
    }

    @Override
    void print() {
        System.out.println("Dados Completos: " + name ", " + salario);
    }

    void add(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    void remove(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    Funcionario getChild(int index) {
        return funcionarios.get(index);
    }
}