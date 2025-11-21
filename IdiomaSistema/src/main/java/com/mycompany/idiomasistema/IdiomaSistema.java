/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idiomasistema;

import java.util.Locale;

/**
 *
 * @author Eletel_Monitor
 */
public class IdiomaSistema {

    public static void main(String[] args) {
        Locale local = Locale.getDefault(); // para retornar o local padrão da maquina
        System.out.println("nome do idioma: " + local.getDisplayLanguage());
    }
}
