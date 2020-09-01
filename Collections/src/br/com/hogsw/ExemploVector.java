package br.com.hogsw;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    //public static void main(String[] args) {
    public static void executar(){
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tênis");
        esportes.add("Handebol");

        System.out.println(esportes);

        esportes.set(2, "PingPong");

        esportes.remove(2);

        esportes.remove("Handebol");
        System.out.println("item 0: --->"+esportes.get(0));

        for(String esporte: esportes){
            System.out.println(esporte);
        }

    }
}
