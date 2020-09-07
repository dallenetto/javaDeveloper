package br.com.hogsw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {
        int i = 0;
        Set<Double> notasAlunos = new HashSet<>();
        while(i<=10){
            Double nota = Math.random()*10;
            System.out.printf( "%.2f", nota );
            notasAlunos.add(nota);
            i++;
        }

        //Total
        System.out.println("\nTotal: "+notasAlunos.size() );

        Double umaNotaQq = 0.00;

        Iterator<Double> notas = notasAlunos.iterator();
        while(notas.hasNext()){
            umaNotaQq = notas.next();
            System.out.printf( " | %.2f", umaNotaQq);
        }

        System.out.printf("\nRemove nota: %.2f ",umaNotaQq );
        notasAlunos.remove(umaNotaQq);

        notasAlunos.add(null);
        for (Double n:notasAlunos) {
            System.out.printf("\nNotas: %.2f", n);
        }

        Boolean estaVAzia = notasAlunos.isEmpty();
        System.out.println("\nEsta vazia: "+ estaVAzia);

        notasAlunos.clear(); //limpa a lista


        estaVAzia = notasAlunos.isEmpty();
        System.out.println("Limpa a lista... \nEsta vazia: "+ estaVAzia);
    }
}
