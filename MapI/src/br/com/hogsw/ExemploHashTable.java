package br.com.hogsw;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        //remove um estudante
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        //Recupera o estudando ind 2
        int idadeEstudante = estudantes.get("Mariana");

        System.out.println(idadeEstudante);

        //tamonho
        System.out.println(estudantes.size());

        //navega
        for(Map.Entry<String, Integer> registro : estudantes.entrySet()){
            System.out.println(registro.getKey() + " -- " + registro.getValue());
        }

        //navegaTb
        for(String key: estudantes.keySet()){
            System.out.println(key + " == "+ estudantes.get(key));
        }

    }
}

