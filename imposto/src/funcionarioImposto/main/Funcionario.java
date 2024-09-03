package funcionarioImposto.main;

public class Funcionario {

        public String nome;
        public double salarioBruto;
        public double imposto;
        public double salarioLiquido(){
            return salarioBruto - imposto;

        }
        public void AumentarSalario(double percentual){
            salarioBruto += salarioBruto * percentual/100;
        }
        public String toString(){
            return nome + " R$" + String.format(" %.2f" , salarioLiquido());

        }


    }



