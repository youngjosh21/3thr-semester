package Main;
import Conta.ContaEspecial;
import Conta.Conta;
import Conta.Conta;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        ContaEspecial contaEp;


        System.out.println("Informe o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Informe se tem depósito inicial(y/n): ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y'){
            System.out.print("Informe o valor do depósito: ");
            double depInicial = sc.nextDouble();
            conta = new Conta(numero,titular,depInicial);
        }else {
            conta = new Conta(numero,titular);
        }
        System.out.println(conta);
        System.out.print("Informe o valor do depósito: ");
        double depositoValor = sc.nextDouble();
        conta.deposito(depositoValor);

        System.out.print("informe valor do saque: ");
        double saqueValor = sc.nextDouble();
        conta.saque(saqueValor);
        System.out.println(conta);

        System.out.println("Conta especial");
        // conta especial

        System.out.print("Informe o numero da conta: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Informe o titular da conta: ");
        titular = sc.nextLine();

        System.out.print("Informe o limite de Emprestimo: R$");
        double limite = sc.nextDouble();

        System.out.print("Informe se tem o deposito inicial(s/n)");
        resposta = sc.next().charAt(0);

        if (resposta == 's'){
            System.out.print("Informe o valor do deposito: R$");
            depositoValor = sc.nextDouble();
            contaEp = new ContaEspecial(numero, titular, depositoValor, limite);
        } else {
            contaEp = new ContaEspecial(numero, titular, limite);
        }

        System.out.println(contaEp);

        System.out.print("Informe o valor do deposito: R$");
        depositoValor = sc.nextDouble();
        contaEp.deposito(depositoValor);
        System.out.println(contaEp);

        System.out.print("Informe o valor do saque: R$");
        saqueValor = sc.nextDouble();
        contaEp.saque(saqueValor);
        System.out.println(contaEp);

        System.out.print("Informe o valor para emprestimo: R$");
        double emprestimo = sc.nextDouble();
        emprestimo += 10.0;

        contaEp.limite(emprestimo);
        System.out.println(contaEp);

    }
}