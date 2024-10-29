package main;

import java.util.ArrayList;
import java.util.Scanner;

// Classe base ItemBiblioteca
abstract class ItemBiblioteca {
    protected String titulo;
    protected String codigoID;

    public ItemBiblioteca(String titulo, String codigoID) {
        this.titulo = titulo;
        this.codigoID = codigoID;
    }

    public abstract void exibirDetalhes();
}

// Subclasse Livro
class Livro extends ItemBiblioteca {
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String codigoID, String autor, int numeroPaginas) {
        super(titulo, codigoID);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro - Título: " + titulo + ", Código ID: " + codigoID + ", Autor: " + autor + ", Número de Páginas: " + numeroPaginas);
    }
}

// Subclasse Revista
class Revista extends ItemBiblioteca {
    private int edicao;
    private String mesPublicacao;

    public Revista(String titulo, String codigoID, int edicao, String mesPublicacao) {
        super(titulo, codigoID);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista - Título: " + titulo + ", Código ID: " + codigoID + ", Edição: " + edicao + ", Mês de Publicação: " + mesPublicacao);
    }
}

// Classe principal para o gerenciamento da biblioteca
public class Biblioteca {
    private static ArrayList<ItemBiblioteca> itensBiblioteca = new ArrayList<>();

    public static void cadastrarLivro(String titulo, String codigoID, String autor, int numeroPaginas) {
        Livro livro = new Livro(titulo, codigoID, autor, numeroPaginas);
        itensBiblioteca.add(livro);
    }

    public static void cadastrarRevista(String titulo, String codigoID, int edicao, String mesPublicacao) {
        Revista revista = new Revista(titulo, codigoID, edicao, mesPublicacao);
        itensBiblioteca.add(revista);
    }

    public static void exibirDetalhesItens() {
        int totalPaginas = 0;

        for (ItemBiblioteca item : itensBiblioteca) {
            item.exibirDetalhes();

            if (item instanceof Livro) {
                totalPaginas += ((Livro) item).getNumeroPaginas();
            }
        }

        System.out.println("\nTotal de Páginas em Livros: " + totalPaginas);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione o tipo de item para cadastrar (1 - Livro, 2 - Revista, 0 - Sair): ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro: ");
                    String tituloLivro = scanner.nextLine();

                    System.out.println("Digite o código ID do livro: ");
                    String codigoIDLivro = scanner.nextLine();

                    System.out.println("Digite o autor do livro: ");
                    String autor = scanner.nextLine();

                    System.out.println("Digite o número de páginas do livro: ");
                    int numeroPaginas = scanner.nextInt();
                    scanner.nextLine();

                    cadastrarLivro(tituloLivro, codigoIDLivro, autor, numeroPaginas);
                    break;

                case 2:
                    System.out.println("Digite o título da revista: ");
                    String tituloRevista = scanner.nextLine();

                    System.out.println("Digite o código ID da revista: ");
                    String codigoIDRevista = scanner.nextLine();

                    System.out.println("Digite a edição da revista: ");
                    int edicao = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o mês de publicação da revista: ");
                    String mesPublicacao = scanner.nextLine();

                    cadastrarRevista(tituloRevista, codigoIDRevista, edicao, mesPublicacao);
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        System.out.println("\nDetalhes dos itens cadastrados:");
        exibirDetalhesItens();
        scanner.close();
    }
}
