package entidades;

public class Importado extends Produto {
    private double taxaAlfandega ;
    public Importado(String nome , double preco, double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

        @Override
                public String etiquetaPreco(){
            double precoFinal = preco + taxaAlfandega;
            // retornando o preço final
            return "Produtos Importados " + nome + "\nPreco: R$ " + String.format("%.2f" , precoFinal) + "\n Taxa da Alfandega é: R$" + String.format("%.2f" , taxaAlfandega);
        }

    }

