package main;

import java.util.Scanner;

import Produto.Produto;


//// código de Joshua Cruz e Williane Santos

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;

            System.out.println("Digite o nome do produto:");
String nome = sc.nextLine();
            System.out.println("Digite o preço do produto:");
            double Preco = sc.nextDouble();
            System.out.println("Digite a quantidade do produto:");
            int Quantidade = sc.nextInt();

////
         //ligando o objeto
        Entidade produto = new Produto(nome, preco, quantidade);

        //mostrando dados do produto
        System.out.println(produto);

        //entrada produto
        System.out.println("Adicionar mais produtos");
        System.out.print("Informe a quantidade para adicionar: ");
        quantidade = sc.nextInt();

        //metodo adicionar quantidade
        produto.addProduto(quantidade);

        //mostrando dados do produto com nova quantidae
        System.out.println(produto);

        //saida produto
        System.out.println("Saida dos produtos");
        System.out.print("Informe a quantidade para retirar: ");
        quantidade = sc.nextInt();

        //metodo retirar quantidade
        produto.removerProduto(quantidade);

        //mostrando dados do produto com nova quantidae
        System.out.println(produto);


    }
}
