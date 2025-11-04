package com.mycompany.principalconta;

public class ContaBancaria {
    private final String titular;
    private final int numeroConta;
    private double saldo;
    private boolean status;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.status = false;
    }
    
    public void abrirConta() {
        this.status = true;
        System.out.println("Conta ativada!");
    }
    
    public void depositar(double valor) {
        if (this.status == true && valor > 0) { // só deposita se a conta estiver ativa
            this.saldo += valor;  // saldo = saldo + valor
            System.out.println("Deposito de R$" + valor + "  realizado.");
        } else {
            System.out.println("[Erro] Não foi possivel depositar");
        }
    }
    public void sacar(double valor) {
        if (this.status == true && this.saldo >= valor && valor > 0) {
            this.saldo -= valor; //saldo = saldo - valor
            System.out.println("Saque de R$" + valor + "  realizado.");
        } else {
            System.out.println("Não foi possivel sacar");
        }
    }
    public double getSaldo() {
        return this.saldo;
    }
    
    public String getTitular() {
        return this.titular;
    }
    public int getNumeroConta() {
        return this.numeroConta;
    }
}
