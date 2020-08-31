package br.com.hog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Desafio2D {
    //public static void main(String[] args) {
    public static void executa(){

        Integer valor = 0, nro = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            StringTokenizer st = new StringTokenizer(in.readLine());
            if (!st.equals(null) || st.hasMoreTokens() || !st.equals("")) {
                nro = Integer.valueOf(st.nextToken());
                valor = nro;

                int divInt100 = nro / 100;
                int divRest100 = nro % 100;

                nro = divRest100;

                int divInt50 = nro / 50;
                int divRest50 = nro % 50;

                nro = divRest50;

                int divInt20 = nro / 20;
                int divRest20 = nro % 20;

                nro = divRest20;

                int divInt10 = nro / 10;
                int divRest10 = nro % 10;

                nro = divRest10;

                int divInt5 = nro / 5;
                int divRest5 = nro % 5;

                nro = divRest5;

                int divInt2 = nro / 2;
                int divRest2 = nro % 2;

                nro = divRest2;

                int divInt1 = nro / 1;
                int divRest1 = nro % 1;

                nro = divRest1;

                System.out.println(valor);
                System.out.println(divInt100 + " nota(s) de R$ 100,00");
                System.out.println(divInt50 + " nota(s) de R$ 50,00");
                System.out.println(divInt20 + " nota(s) de R$ 20,00");
                System.out.println(divInt10 + " nota(s) de R$ 10,00");
                System.out.println(divInt5 + " nota(s) de R$ 5,00");
                System.out.println(divInt2 + " nota(s) de R$ 2,00");
                System.out.println(divInt1 + " nota(s) de R$ 1,00");
            }
        } catch (NumberFormatException | IOException num) {
            num.getMessage(); //Valor inválido
        }

    }
}
