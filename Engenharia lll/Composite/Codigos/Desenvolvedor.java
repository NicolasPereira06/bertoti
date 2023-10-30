class Desenvolvedor extends Funcionario {
    private String name;
    private String salario;

    public DesenvolvedorNome(String name) {
        this.name = name;
    }

    public DesenvolvedorSalario(String salario) {
        this.salario = salario;
    }

    @Override
    void getNome() {
        System.out.println("Nome do Funcionário: " + name);
    }

    @Override
    void getSalario() {
        System.out.println("Salário do Desenvolvedor: " + salario);
    }

    @Override
    void print() {
        System.out.println("Dados Completos: " + name ", " + salario);
    }
}