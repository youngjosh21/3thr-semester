package entidades;
// CÓDIGO DE JOSH & WILLIANE

public class leao extends Animal {
    public leao(String nome) {
        super(nome);
    }

    @Override

    public void emitirSom() {
        System.out.println(getNome() + "(Leão : Roaaaaar!!");
    }
}
