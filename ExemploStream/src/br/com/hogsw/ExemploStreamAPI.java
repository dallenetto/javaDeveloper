package br.com.hogsw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thays");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println("Contagem: "+ estudantes.stream().count());

        System.out.println("Maior nro de letras: "+estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor nro de letras: "+estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Retorna os elementos com a letra R: "+
                 estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList())
        );

        System.out.println("Retorna uma nova coleção com a quantidade de letras: "+
            estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList())
        );

        System.out.println("Retorna os 3 primeiros elementos: " +
                estudantes.stream().limit(3).collect(Collectors.toList())
        );

        System.out.println("Retorna os elementos e depois retorna a mesma coleção: "+
                estudantes.stream().peek(System.out::println).collect(Collectors.toList())
        );

        System.out.println("Retorna os elementos sem retornar outra coleção: ");
        estudantes.stream().forEach(System.out::println);

    }
}
