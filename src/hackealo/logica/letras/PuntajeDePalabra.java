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
    ArrayList<String> permutaciones;
    
    public int obtenerPuntaje(String cadena){
        
        return 1;
    }
    
    private static void obtenerPermutacion(ArrayList<String> permutaciones, String prefijo, String cadena) {
        int n = cadena.length();
        if (n == 0) {
            System.out.println(prefijo);
        } else {
            for (int i = 0; i < n; i++) {
                obtenerPermutacion(permutaciones, prefijo + cadena.charAt(i), cadena.substring(0, i) + cadena.substring(i + 1, n));
            }
        }
    }
}
