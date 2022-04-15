package Construtores;


public class Conta {

    //Atributos
    private double saldo; //Não é possivel modificar e ler por outras classes
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; //Atributo da classe

    public Conta(int agencia, int numero){ //Construtor
        Conta.total = Conta.getTotal() + 1; //Referencia para a Classe
        System.out.println(getTotal());
        this.agencia = agencia;
        this.numero = numero;
    }

    public static int getTotal() {
        return total;
    }

    public void deposita(Double valor){
        this.saldo += valor; //This refere-se ao objeto que foi invocado esse método
    }

    public boolean saca(double valor){

        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }

    }

    public boolean transfere(double valor, Conta contaDestino){

        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não é possivel cadastrar um numero de agencia igual a 0 ou negativo");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Não é possivel cadastrar um numero  igual a 0 ou negativo");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
