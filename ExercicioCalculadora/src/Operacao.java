import java.util.Scanner;

public class Operacao {
    private double n1;
    private double n2;
    private String operador;
    private double resultado;

    public void captureInformations(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        n1 = Double.parseDouble(scanner.next());

        System.out.println("Digite o segundo valor: ");
        n2 = Double.parseDouble(scanner.next());

        System.out.println("Digite o operador: ");
        operador = (scanner.next());

        if(testOperator() && testValue()){
            resultado = calculate();
            show();
        }
        System.out.println("Ouve erros de sintaxe");

    }

    public boolean testValue(){
        if(operador.equals("/") && n2 == 0){
            return false;
        }
        return true;
    }

    public void show(){
        System.out.println(n1  + operador + n2 + " = " + resultado);
    }

    public double calculate(){
        if(operador.equals("+")){
            return n1 + n2;
        }
        if(operador.equals("-")){
            return n1 - n2;
        }
        if(operador.equals("*")){
            return n1 * n2;
        }
        if(operador.equals("/")){
            return n1 / n2;
        }
        return 0;
    }



    public boolean testOperator(){
        if(operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")){
            return true;
        }
        return false;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
