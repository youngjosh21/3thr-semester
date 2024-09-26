package main;

import java.util.Scanner;

import Produto.Produto;


//// código de Joshua Cruz e Williane Santos

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        System.out.println("--------------LOJA--------------------------");
        System.out.println("---------TV (250.00 R$)---------------------");
        System.out.println("---------CARRINHO (50.00 R$)----------------");
        System.out.println("---------MÁQUINA DE LAVAR (100.00 R$)-------");
        System.out.println("---------FOGÃO (75.00 R$)-------------------");
        System.out.println("---------FERRO DE PASSAR(55.00 R$)----------");
        System.out.println("---------GELADEIRA (59.00 R$)---------------");


        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();
        System.out.println("Digite o preço do produto:");
        double Preco = sc.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        int Quantidade = sc.nextInt();

////
        //ligando o objeto
        Produto produto = new Produto(nome, Preco, Quantidade);

        //mostrando dados do produto
        System.out.println(produto);

        //entrada produto
        System.out.println("Adicionar mais produtos");
        System.out.print("Informe a quantidade para adicionar: ");
        Quantidade = sc.nextInt();

        //metodo adicionar quantidade
        produto.AddProduto(Quantidade);

        //mostrando dados do produto com nova quantidae
        System.out.println(produto);

        //saida produto
        System.out.println("Saida dos produtos");
        System.out.print("Informe a quantidade para retirar: ");
        Quantidade = sc.nextInt();

        //metodo retirar quantidade
        produto.RemoverProdutos(Quantidade);

        //mostrando dados do produto com nova quantidae
        System.out.println(produto);


    }
}
