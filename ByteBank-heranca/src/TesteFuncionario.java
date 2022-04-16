public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.setNome("Nico");
        func.setSalario(1000);
        func.setCpf("2134543");

        System.out.println(func.getBonificacao());
    }
}
