package Produto;

public class Produto {
// variavel
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return "Nome.." + nome
                + ", Preco:" + String.format("%.2f", preco)
                + ", Quantidade de Estoque:" + quantidade
                + ", Valor Total do estoque: R$ " + String.format("%.2f", totalEstoque())
                ;


    }
    // obj

    public Produto(String Nome, double preco, int quantidade) {
        this.nome = Nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    //    get é pra ver  e o set é pra ver e mudar

    public String getNome() {
        return nome;
    }
    public void setNome() {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco() {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;

    }

    public void setQuantidade() {
        this.quantidade = quantidade;

    }

// função ou metódo, "void" sem retorno ,double return, tudo função
public void AddProduto(int quantidade_) {
    quantidade += quantidade_;

}

    public void RemoverProdutos(int quantidade_) {
        quantidade -= quantidade_;
    }

    public double totalEstoque() {
        return quantidade * preco;
    }



}


