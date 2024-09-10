package Main;

import Conta.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        System.out.print("Informe o Numero da conta");
        int numero = sc.nextInt();
        // se o titular pode mudar, ter alteração vc bota o set, pq pode ter alteração, o set serve pra isso

        System.out.print("Informe o nome do titular da conta");
        sc.nextLine();

        String titular = sc.nextLine();
        System.out.print("Informe se tem deposito inicial (s/n) : ?");

        char resposta = sc.next().charAt(0);
// ctrl alt L ORGANIZA
        if (resposta == 's') {
            System.out.print("Digite o valor do deposito: ");
            double depInicial = sc.nextDouble();

            conta = new Conta(numero, titular, depInicial);

        } else {
            conta = new Conta(numero, titular);


        }
        System.out.print(conta);
        System.out.print("Informe o valor do deposito: ");
        double depositoValor = sc.nextDouble();
        conta.deposito(depositoValor);
        System.out.print("Informe o valor do saque: ");
        double saqueValor = sc.nextDouble();
        conta.saque(saqueValor);
        System.out.print(conta);

    }
}