package model;

public class FuncionarioTerceirizado extends Funcionario {
    private double despesaAdicional;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorPorHora, double despesaAdicional) {
        super(nome, horasTrabalhadas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double pagamento() {
        // Pagamento padrão + 110% da despesa adicional
        return super.pagamento() + (despesaAdicional * 1.1);
    }
}
