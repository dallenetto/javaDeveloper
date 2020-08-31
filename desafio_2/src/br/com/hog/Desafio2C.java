package br.com.hog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Desafio2C {

    //public static void main(String[] args) {
    public static void executa(){

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int qtd = 0;
        List<Double> listaPar = new ArrayList<>();
        List<Double> listaImp = new ArrayList<>();
        List<Double> listaPos = new ArrayList<>();
        List<Double> listaNeg = new ArrayList<>();
        {
            try {
                //System.out.println("Informe 6 nros: <Enter>");
                while (qtd < 5) {
                    st = new StringTokenizer(in.readLine());
                    try {
                        if (!st.equals(null) || st.hasMoreTokens() || !st.equals("")) {
                            Double nro = Double.valueOf(st.nextToken());
                            if (nro > 0) listaPos.add(nro);
                            if (nro < 0) listaNeg.add(nro);
                            if (nro % 2 == 0) listaPar.add(nro);
                            if (nro % 2 != 0) listaImp.add(nro);
                            qtd++;
                        }
                    } catch (NumberFormatException | NoSuchElementException num) {
                        num.getMessage(); //Valor inválido
                    }
                }
                System.out.println(listaPar.size() + " valor(es) par(es)");
                System.out.println(listaImp.size() + " valor(es) impar(es)");
                System.out.println(listaPos.size() + " valor(es) positivo(s)");
                System.out.println(listaNeg.size() + " valor(es) negativo(s)");
            } catch (NumberFormatException | IOException num) {
                num.getMessage(); //Valor inválido
            }
        }
    }
}
