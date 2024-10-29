package entidades;
// CÓDIGO DE JOSH & WILLIANE

import java.util.ArrayList;
import java.util.List;

// Classe ZooManager para gerenciar os animais
public class ZooManager {
    private List<Animal> animais;

    public ZooManager() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal registrado.");
        } else {
            for (Animal animal : animais) {
                System.out.println(animal.getNome() + " - Tipo: " + animal.getTipo());
            }
        }
    }

    public void emitirSomTodosAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal registrado para emitir som.");
        } else {
            for (Animal animal : animais) {
                animal.emitirSom();
            }
        }
    }
}

