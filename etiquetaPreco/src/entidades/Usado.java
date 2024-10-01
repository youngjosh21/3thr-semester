package entidades;

public class Usado extends Produto{
    private String dataFabricacao;
        public Usado (String nome , double preco, String dataFabricacao ){
            super (nome, preco);
        }
        @Override
                public String etiquetaPreco (){
            return "Produto Usado : " + nome + "\n Preco: R$ " + String.format("%.2f" , preco)
            + "\n Data de fabricação: " + dataFabricacao;
        }

    }


