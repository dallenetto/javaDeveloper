package br.com.hogsw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    //public static void main(String[] args) {
    public static void executar(){
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Joao");
        nomes.add("Maria");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(3);

        System.out.println(nome);

        int posicao = nomes.indexOf("Carlos");

        System.out.println(posicao);

        posicao = nomes.indexOf("Wesley");

        System.out.println(posicao);

        int tam = nomes.size();

        System.out.println(tam);

        nomes.remove("Larissa");

        tam = nomes.size();

        System.out.println(tam);

        Boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        Boolean temFernando = nomes.contains("Fernando");

        System.out.println(temFernando);

        Boolean listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);

        for (String item:nomes ) {
            System.out.println("----->"+item);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println("+---------->"+iterator.next());
        }

        nomes.clear();

        listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);



    }
}
