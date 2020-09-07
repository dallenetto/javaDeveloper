package br.com.hogsw;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNum = new LinkedHashSet<>();

        //adiciona nros
        sequenciaNum.add(1);
        sequenciaNum.add(2);
        sequenciaNum.add(3);
        sequenciaNum.add(4);
        sequenciaNum.add(5);

        System.out.println(sequenciaNum);

        //remove o nro
        sequenciaNum.remove(4);

        System.out.println(sequenciaNum);

        //retorna a qtd
        System.out.println(sequenciaNum.size());

        //navega
        Iterator<Integer> nros = sequenciaNum.iterator();
        while (nros.hasNext())
            System.out.println(nros.next());

        for(Integer n : sequenciaNum)
            System.out.println(n);

        //retorna se o SET esta vazio
        System.out.println(sequenciaNum.isEmpty());

    }
}
