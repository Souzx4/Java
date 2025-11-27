/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

import java.util.Scanner;

/**
 *
 * @author Eletel_Monitor
 */
public class ContaBancaria {

    public static void main(String[] args) {
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Scanner Scanner = new Scanner(System.in, "ISO-8859-1");
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abriConta("Corrente");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1112);
        p2.setDono("Creuza");
        p2.abriConta("Poupança");
        
        p1.depositar(100);
        p1.sacar(20);
        
        p2.depositar(50);
        p2.sacar(200);
        p2.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
}
