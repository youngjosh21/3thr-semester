package main;

import java.util.Scanner;

import Produto.Produto;




public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in) ;

            System.out.println("Digite o nome do produto:");
String nome = sc.nextLine();
            System.out.println("Digite o preço do produto:");
            double Preco = sc.nextDouble();
            System.out.println("Digite a quantidade do produto:");
            int Quantidade = sc.nextInt();



    }
}