/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carro;

/**
 *
 * @author Eletel_Monitor
 */
// Classe com o método main
public class Carro {
    public static void main(String[] args) {
        tiposCarro obj = new tiposCarro();
        obj.setModelo("BMW");
        obj.setPlaca("OVX152");
        obj.setqntPorta(4);
        
        obj.acelerar();
        obj.parar();
    }
}
