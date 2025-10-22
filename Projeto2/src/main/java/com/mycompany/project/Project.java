/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;

/**
 *
 * @author Eletel_Monitor
 */
public class Project {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; (por ser privado vai da erro)
        c1.carga = 80;
        //c1.tampada = false; //não consegue por conta que está privada
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
