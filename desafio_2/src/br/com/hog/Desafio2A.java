package br.com.hog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Desafio2A {

    //public static void main(String[] args) {
    public static void executa(){

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int qtd = 0;
        List<Double> lista = new ArrayList<>();
        {
            try {
                System.out.println("Informe 6 nros: <Enter>");
                while (qtd < 6) {
                    st = new StringTokenizer(in.readLine());
                    try{
                        System.out.println(st);
                        if (!st.equals(null) || st.hasMoreTokens() || !st.equals("")) {
                            Double nro = Double.valueOf(st.nextToken());
                            System.out.println("nro: "+nro);
                            if (nro >= 0) lista.add(nro);
                            qtd++;
                        }
                    } catch (NumberFormatException | NoSuchElementException num) {
                        num.getMessage(); //Valor inválido
                    }
                }
                System.out.println(lista.size() + " valores positivos");
            } catch (NumberFormatException | IOException num) {
                num.getMessage(); //Valor inválido
            }
        }

    }
}
