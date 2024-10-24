package main;

import model.Funcionario;
import model.FuncionarioProprio;
import model.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        // Solicita o número de funcionários
        System.out.print("Informe o número de funcionários: ");
        int n = sc.nextInt();

        // Leitura dos dados dos funcionários
        for (int i = 0; i < n; i++) {
            sc.nextLine();  // Consome a nova linha após o número
            System.out.println("Dados do funcionário #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Horas trabalhadas: ");
            int horasTrabalhadas = sc.nextInt();
            System.out.print("Valor por hora: R$ ");
            double valorPorHora = sc.nextDouble();
            System.out.print("O funcionário é terceirizado? (s/n): ");
            char terceirizado = sc.next().charAt(0);

            if (terceirizado == 's') {
                System.out.print("Informe a despesa adicional: R$ ");
                double despesaAdicional = sc.nextDouble();
                Funcionario func = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorPorHora, despesaAdicional);
                funcionarios.add(func);
            } else {
                Funcionario func = new FuncionarioProprio(nome, horasTrabalhadas, valorPorHora);
                funcionarios.add(func);
            }
        }

        // Exibição dos pagamentos
        System.out.println("\nPagamentos:");
        for (Funcionario func : funcionarios) {
            System.out.printf("%s - R$ %.2f%n", func.getNome(), func.pagamento());
        }

        sc.close();
    }
}
