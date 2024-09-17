package Produto;

public class Produto {

    @Override
    public String toString() {
        return "Nome" + Nome + "Preco" + Preco + "Quantidade" + Quantidade + "Valor Total do estoque: R$ " + String.format("%.2f", TotalEstoque())
                ;


    }

    private String Nome;
    private double Preco;
    private int Quantidade;
    private double TotalEstoque;

    //    get é pra ver  e o set é pra ver e mudar
    public void AddProdutos(int quantidade) {
        TotalEstoque += quantidade;

    }

    public void RemoverProdutos(int quantidade) {
        TotalEstoque -= quantidade;
    }

    public double TotalEstoque() {
        return Quantidade * Preco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome() {
        this.Nome = Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco() {
        this.Preco = Preco;
    }

    public int getQuantidade() {
        return Quantidade;

    }

    public void setQuantidade() {
        this.Quantidade = Quantidade;

    }

    public Produto(String Nome, double preco, int quantidade) {
        this.Nome = Nome;
        this.Preco = Preco;
        this.Quantidade = Quantidade;

    }


}



