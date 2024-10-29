package entidades;
// CÓDIGO DE JOSH & WILLIANE

public class elefante extends Animal {
    public elefante (String nome){
        super (nome);
    }
    @Override

    public void emitirSom() {
        System.out.println(getNome() + "(Elefante : Brrrrrrr!!");
    }
}


