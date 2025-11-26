/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testetipos;

/**
 *
 * @author Eletel_Monitor
 */
public class TesteTipos {

    public static void main(String[] args) {
        
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        */
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.3f", idade);
    }
}
