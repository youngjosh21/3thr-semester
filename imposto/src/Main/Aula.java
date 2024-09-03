package Main;
import funcionarioImposto.main.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class Aula {

    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();
// só acesso a classe através do objeto
        System.out.println(" Informe seu Nome:");
        funcionario.nome = sc.nextLine();

        System.out.println(" Informe o seu salário bruto:");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println(" Informe o Imposto:");
        funcionario.imposto = sc.nextDouble();

        System.out.println(" FUNCIONARIO" + funcionario);

        System.out.println("Qual o percentual?");
        //variavel
        double percentual = sc.nextDouble();
        // objeto só acessa atributo e método, variavel nn
        funcionario.AumentarSalario(percentual);
        System.out.println(" Dados Atualizados: " + funcionario);



    }
}