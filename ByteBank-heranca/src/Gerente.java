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

    /*public double getBonificacao(){
        return this.salario;
    }*/




    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
