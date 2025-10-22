/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

/**
 *
 * @author Eletel_Monitor
 */
// Classe Carro
public class tiposCarro {
    private String modelo;
    private int qntPorta;
    private String placa;
    private String motor;
    private boolean estaAcelerando = false;

    public void acelerar() {
        estaAcelerando = true;
        if(motor == null) {
            this.setMotor("Motor 1.0");
        }
        System.out.println("Acelerando com motor: " + motor);
    }

    public void parar() {
        this.ligarluzFreio();
        this.desacelerar();
        System.out.println("Carro parado");
    }

    private void desacelerar() {
        if (estaAcelerando) {
            System.out.println("Desacelerando...");
        }
        estaAcelerando = false;
    }
    
    private void ligarluzFreio() {
        System.out.println("Ligando luz de freio");
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getqntPorta() {
        return qntPorta;
    }

    public void setqntPorta(int qntPorta) {
        this.qntPorta = qntPorta;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    public String getMotor() {
        return this.motor;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Placa: " + placa + ", Motor: " + motor + ", Portas: " + qntPorta;
    }
}

