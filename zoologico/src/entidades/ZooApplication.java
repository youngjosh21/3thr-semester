package entidades;
import java.util.Scanner;
// CÓDIGO DE JOSH & WILLIANE

// Classe principal ZooApplication
public class ZooApplication {
    public static void main(String[] args) {
        ZooManager zooManager = new ZooManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem-vindo ao Zoológico! Selecione uma opção:");
            System.out.println("1. Registrar novo animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Emitir som de todos os animais");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (escolha) {
                case 1:
                    System.out.println("Escolha o tipo de animal para registrar (Leao, Elefante, Papagaio):");
                    String tipo = scanner.nextLine();
                    System.out.println("Digite o nome do animal:");
                    String nome = scanner.nextLine();

                    Animal animal;
                    switch (tipo.toLowerCase()) {
                        case "leao":
                            animal = new leao(nome);
                            break;
                        case "elefante":
                            animal = new elefante(nome);
                            break;
                        case "papagaio":
                            animal = new papagaio(nome);
                            break;
                        default:
                            System.out.println("Tipo de animal não reconhecido.");
                            continue;
                    }

                    zooManager.adicionarAnimal(animal);
                    System.out.println("Animal registrado com sucesso!");
                    break;

                case 2:
                    zooManager.listarAnimais();
                    break;

                case 3:
                    zooManager.emitirSomTodosAnimais();
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
