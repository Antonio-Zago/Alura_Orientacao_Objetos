public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Antonio");
        g1.setCpf("12344");
        g1.setSalario(2000);
        g1.setSenha(2222);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.getSenha());



    }
}
