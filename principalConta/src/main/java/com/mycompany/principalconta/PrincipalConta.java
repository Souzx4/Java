package com.mycompany.principalconta;

public class PrincipalConta {

    public static void main(String[] args) {
        System.out.println("--- Bem vindo ao banco Virtual ---");
        
        ContaBancaria c1 = new ContaBancaria("Gilmar Sousa De Brito", 1001);
        System.out.println("Criando conta para sr(a) " + c1.getTitular() + " (conta " + c1.getNumeroConta() + ")");
        
        c1.abrirConta();
        c1.depositar(300.00);
        c1.sacar(50.00);
        
        System.out.println("Saldo final da conta " + c1.getNumeroConta() + ": R$" + c1.getSaldo());
        System.out.println("------------------------------------------------");
        
        ContaBancaria c2 = new ContaBancaria("Geyciane Correia Da Silva", 1002);
        System.out.println("Criado a conta para sr(a) " + c2.getTitular() + "(conta " + c2.getNumeroConta() + ")");
        c2.abrirConta();
        c2.depositar(1000.00);
        c2.sacar(250.00);
        System.out.println("Saldo final da conta " + c2.getNumeroConta() + ": R$" + c2.getSaldo());
    }
}
