/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Eletel_Monitor
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        double largura = tamanhoTela.getWidth();
        double altura = tamanhoTela.getHeight();
        
        System.out.println("Resolucao " + (int)largura + " x " + (int)altura);
    }
}
