public class TesteReferencias {
    public static void main(String[] args) {


        Funcionario g1 = new Gerente();//Todo gerente é um funcionario

        g1.setNome("Antonio");
        System.out.println(g1.getNome());
    }
}
