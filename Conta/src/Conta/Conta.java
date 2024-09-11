package Conta;


public class Conta {
    //atributos
    private int numero;
    private String titular;
    private double saldo;
    //gets
    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }






    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void deposito(double quantia){
        saldo+= quantia;
    }
    public void saque(double quantia){
        saldo -= (quantia + 5.0);
    }

    public String toString(){
        return "A conta: " + numero
                + "Titular: " + titular
                + "Saldo: R$ " +  String.format("%.2f",saldo);

    }
    public Conta(int numero, String titular, double depInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depInicial);
    }

    public Conta(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

}