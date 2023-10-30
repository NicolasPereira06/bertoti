public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Gerente");
        Funcionario funcionario2 = new Funcionario("Desenvolvedor");

        Gerente gerente1 = new Gerente("Lucas");
        gerente1.add(funcionario1);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Matheus");
        desenvolvedor1.add(funcionario2);

        gerente1.print();
        desenvolvedor1.print();


        gerente1.remove(funcionario1);
        desenvolvedor1.remove(funcionario2);

        gerente1.print();
        desenvolvedor1.print();
    }
}