package br.com.hog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Desafio2E {

    //public static void main(String[] args) {
    public static void executa(){

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        Integer km = 0;
        Double litros = 0.0, total = 0.0;
        List<Integer> lista = new ArrayList<>();
        try {
            st = new StringTokenizer(in.readLine());
            if (!st.equals(null) || st.hasMoreTokens() || !st.equals("")) {

                km = Integer.valueOf(st.nextToken());

                st = new StringTokenizer(in.readLine());

                if (!st.equals(null) || st.hasMoreTokens() || !st.equals("")) {

                    litros = Double.valueOf(st.nextToken());

                    total = km / litros;

                    System.out.printf( " %.3f km/l",total);

                }
            }
        } catch(NumberFormatException | IOException num){
            num.getMessage();
        }
    }
}