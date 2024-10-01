package main;

import entidades.Importado;
import entidades.Produto;
import entidades.ProdutoNormal;
import entidades.Usado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
/// codigo de Joshua Cruz e Williane Santos

public class EtiquetaPreco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.println("Digite o numero de produtos:");
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o tipo de produto: (normal/importado/usado)");
            String tipo = sc.nextLine();
            sc.nextLine();


            switch (tipo.toLowerCase()) {
                case "normal":
                    System.out.print("Digite o nome do produto:");
                    String nome = sc.nextLine();
                    System.out.print("Digite o preço do produto:");
                    double preco = sc.nextDouble();
                    produtos.add(new ProdutoNormal(nome, preco));
                    break;


                case "importado":
                    System.out.print("Digite o nome do produto:");
                    nome = sc.nextLine();
                    System.out.print("Digite o preço do produto:");
                    preco = sc.nextDouble();
                    System.out.print("Taxa da Alfandega");
                    double taxa = sc.nextDouble();
                    sc.nextLine();

                    produtos.add(new Importado(nome, preco, taxa));
                    break;


                case "usado":
                    System.out.print("Digite o nome do produto:");
                    nome = sc.nextLine();
                    System.out.print("Digite o preço do produto:");
                    preco = sc.nextDouble();
                    System.out.print("Data de Fabricação (dd/mm/aaaa)");
                    String data = sc.nextLine();
                    sc.nextLine();

                    produtos.add(new Usado(nome, preco, data));
                    break;

                default:
                    System.out.print("Tipo de produto não cadastrado");
                    i--;
                    break;
            }

            System.out.println("\n Etiqueta de preço");
            for (Produto produto : produtos) {
                System.out.println(produto.etiquetaPreco());
            }


        }


    }
}