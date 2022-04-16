//Gerente herda de funcionario
public class Gerente extends Funcionario {

    private int senha;


    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }
        else{
            return false;
        }
    }

    //sobrecarga de método, leva em conta os parametros de entrada
    public boolean autentica(int senha, String login){
        return true;
    }

    //Reescrita de método, utilizando a mesma assinatura(visibilidade, retorno e nome)
    public double getBonificacao(){
        //Chamando o metodo da super classe
        return super.getBonificacao() + super.getSalario();//Indica que vem da super classe(Classe em que está herdando)
    }




    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
