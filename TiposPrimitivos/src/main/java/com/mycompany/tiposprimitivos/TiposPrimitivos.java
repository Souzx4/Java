/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Eletel_Monitor
 */
public class TiposPrimitivos {

    public static void main(String[] args) throws Exception { // Adicione "throws Exception" aqui
    
        // 1. FORÇA O JAVA A IMPRIMIR (SAÍDA) EM UTF-8
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));

        // 2. FORÇA O SCANNER A LER O TECLADO NO PADRÃO DO WINDOWS (ISO-8859-1 ou CP850)
        // Atenção: Use "ISO-8859-1" no Scanner, não "UTF-8"
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");

        // --- SEU CÓDIGO CONTINUA AQUI ---
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
    
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();
    
        System.out.println("A nota de " + nome + " é " + nota);
        
        //tem essas outras formas
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        System.out.println("Sua nota é " + nota);
        System.out.print("Sua nota é " + nota);
    }
}
