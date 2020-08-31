package br.com.hog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Desafio2B {

    //public static void main(String[] args) {
    public static void executa(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int qtd = 1;
        List<Integer> lista = new ArrayList<>();
        try {
            st = new StringTokenizer(in.readLine());
            if (!st.equals(null) || st.hasMoreTokens() || !st.equals("")) {
                Integer nro = Integer.valueOf(st.nextToken());

                while(qtd <= nro) {

                    if (qtd % 2 == 0) System.out.println(qtd);

                    qtd++;
                }
            }
        } catch (NumberFormatException | IOException num) {
            num.getMessage(); //Valor inválido
        }
    }
}
