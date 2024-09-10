package Conta;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero(){
        return numero;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular (String titular){
        this.titular = titular;
    }
    public double getSaldo(){
        return saldo;

    }


    public Conta (int numero, String titular, double depInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depInicial);
    }
    public Conta(int numero, String titular){


        this.numero = numero;
        this.titular = titular;
    }
    public void deposito (double quantia){
        saldo += quantia;
    }
    public void saque (double quantia) {
saldo -=  quantia + 5.0;
    }
    public String toString(){
        return "Conta :" + numero  + "Titular " + titular + "Saldo: R$" + String.format("%2.f",saldo);


    }


}