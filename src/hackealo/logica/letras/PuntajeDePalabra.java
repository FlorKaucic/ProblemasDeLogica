/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackealo.logica.letras;

import java.util.ArrayList;

/**
 *
 * @author Flor
 */
public class PuntajeDePalabra {

    public static int obtenerPuntaje(String cadena) {
        ArrayList<String> permutaciones = new ArrayList<String>();
        obtenerPermutacion(permutaciones, "", cadena);
        int puntaje = 0;
        int punt;
        for (String permutacion : permutaciones)
        {
            puntaje += (punt=puntajeDePermutacion(permutacion));
            System.out.println(punt);
        }
        return puntaje;
    }

    private static void obtenerPermutacion(ArrayList<String> permutaciones, String prefijo, String cadena) {
        int n = cadena.length();
        if (n == 0) {
            permutaciones.add(prefijo);
        } else {
            for (int i = 0; i < n; i++) {
                obtenerPermutacion(permutaciones, prefijo + cadena.charAt(i), cadena.substring(0, i) + cadena.substring(i + 1, n));
            }
        }
    }

    private static int puntajeDePermutacion(String cadena) {
        int puntaje = 0;
        String cadenaUC = cadena.toUpperCase();
        System.out.println(cadenaUC);
        for (int i = 1; i <= cadenaUC.length(); i++)
            puntaje += (i * (((int)cadenaUC.charAt(i-1) - 64)));
        return puntaje;
    }
}
