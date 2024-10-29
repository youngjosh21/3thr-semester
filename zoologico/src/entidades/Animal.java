package entidades;
// CÓDIGO DE JOSH & WILLIANE
public abstract class Animal {
    private String nome;
    public Animal (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getTipo(){
        return this.getClass().getSimpleName();

    }
    public abstract void emitirSom();
}
