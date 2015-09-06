/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackealo.logica;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Flor
 */
public class LetrasRepetidas {

    public static String ordenar(String cadena) {
        //Variables para separar y contar letras
        char[] chars = cadena.toLowerCase().toCharArray();
        HashMap<Character, Integer> desordenado = new HashMap();
       
        //Codigo para separa y contar letras
        for (char c : chars)
            if (desordenado.containsKey(c))
                desordenado.put(c, desordenado.get(c) + 1);
            else
                desordenado.put(c, 1);
        /*
        //Mostrar Desordenado
        System.out.println("Mapa desordenado:");
        printMap(desordenado);
        */
        
        // Ordenar y armar nueva lista
        List<Entry<Character, Integer>> list = new LinkedList(desordenado.entrySet());
        Collections.sort(list, new Comparator<Entry<Character, Integer>>(){
            @Override
            public int compare(Entry<Character, Integer> o1, Entry<Character,Integer> o2){
                int orden;
                if((orden=o2.getValue().compareTo(o1.getValue()))==0){
                    if(o1.getKey()<o2.getKey())
                        orden = -1;
                    else
                        orden = 1;
                }
                return orden;
            }
        });

        Map<Character, Integer> ordenado = new LinkedHashMap();
        for (Entry<Character, Integer> entry : list)
        {
            ordenado.put(entry.getKey(), entry.getValue());
        }

        /*
        //Mostrar Ordenado
        System.out.println("Mapa ordenado:");
        printMap(ordenado);
        */

        //Cadena que retorna
        String output = "";
        for(Character k : ordenado.keySet())
            output += k;
        return output;
    }
    
    public static void printMap(Map<Character, Integer> map) {
        for (Entry<Character, Integer> entry : map.entrySet())
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
    }
}