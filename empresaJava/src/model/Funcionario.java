package model;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorPorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public double pagamento() {
        return horasTrabalhadas * valorPorHora;
    }
}
