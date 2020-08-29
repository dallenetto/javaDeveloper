package br.com.hog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Desafio1B {

    public static void executa() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;

        try {
            if (!br.equals(null)) {
                StringTokenizer st = null;

                System.out.println("Informe 1o nro: <Enter> ");
                st = new StringTokenizer(br.readLine());
                if (st.hasMoreTokens()) {
                    a = Integer.parseInt(st.nextToken());

                    System.out.println("Informe 2o nro: <Enter> ");
                    st = new StringTokenizer(br.readLine());
                    if (st.hasMoreTokens())
                        b = Integer.parseInt(st.nextToken());
                }

                int total = a * b; // Altere o valor da variável com o cálculo esperado
                System.out.println("PROD = " + total);
            }
        } catch (NumberFormatException | IOException num) {
            num.getMessage(); //Valor inválido
        }

    }
}
