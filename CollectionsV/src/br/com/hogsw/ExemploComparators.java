package br.com.hogsw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComparators {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("------------------------ordem de insercao");
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println("------------------------1- ordem de natural dos nros");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getAge() - first.getAge());

        System.out.println("------------------------2- ordem natural dos nros - idade");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getAge));
        System.out.println("------------------------3- ordem natural dos nros - idade");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getAge).reversed());
        System.out.println("------------------------4- ordem reversa dos nros");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparing(Estudante::getName));
        System.out.println("------------------------5- ordem natural dos nomes");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparing(Estudante::getName).reversed());
        System.out.println("------------------------6- ordem reversa dos nomes");
        System.out.println(estudantes);

    }

}
