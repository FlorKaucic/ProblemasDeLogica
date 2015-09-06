/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackealo.tests;

import hackealo.logica.letras.PuntajeDePalabra;

/**
 *
 * @author Flor
 */
public class PuntajeDePalabraTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         El "puntaje" de una palabra es la suma del puntaje de cada letra. El 
         "puntaje" de una letra es la posición en donde se encuentra en una 
         palabra, multiplicada por su posición en el abecedario. Por ejemplo, 
         el puntaje de "acb" es (1*1) + (2*3) + (3*2). Teniendo en cuenta 
         permutaciones sin repeticiones (por ejemplo "aa", "Aa", "aA" y "AA" 
         tienen sólo una permutación), ¿cuál es la suma de las puntuaciones 
         de las permutaciones de "iVtrclF"?
         */

        System.out.println("Puntaje: "+PuntajeDePalabra.obtenerPuntaje("iVtrclF"));
        
    }
}
