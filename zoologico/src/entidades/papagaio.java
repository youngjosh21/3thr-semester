package entidades;
// CÓDIGO DE JOSH & WILLIANE

public class papagaio extends Animal {
    public papagaio (String nome){
        super (nome);
    }
    @Override

    public void emitirSom() {
        System.out.println(getNome() + "(papagaio : curr!!!! currrr!!");
    }
}


