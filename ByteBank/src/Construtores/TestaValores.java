package Construtores;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1234, 3456);

        conta.setAgencia(-300);

        Conta conta2 = new Conta(1234, 3456);


        System.out.println("Total de contas: "+Conta.getTotal());
    }
}
