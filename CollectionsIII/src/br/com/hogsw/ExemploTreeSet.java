package br.com.hogsw;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a 1a capital no topo da arvore
        System.out.println(treeCapitais.first());

        //Retorna a ult capita
        System.out.println(treeCapitais.last());

        //retorna 1a capital abaixo da indicada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //retorna 1a capital acima da indicada
        System.out.println(treeCapitais.higher("Florianopolis"));

        //exibe todas
        System.out.println(treeCapitais);

        //Retorna a 1a do topo e remove
        System.out.println(treeCapitais.pollFirst());

        //exibe todas
        System.out.println(treeCapitais);

        //Retorna a 1a capital no final da arvore e remove
        System.out.println(treeCapitais.pollLast());

        System.out.println("... listando...");
        for(String capital : treeCapitais)
            System.out.println(capital);

        System.out.println("... descending...");

        Iterator<String> iterator = treeCapitais.descendingIterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        //exibe todas
        System.out.println(treeCapitais);

    }
}
