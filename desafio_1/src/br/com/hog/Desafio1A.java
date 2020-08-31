package br.com.hog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Desafio1A {

    public static void executa() {
        System.out.println("Informe 2 nros separados por um espaço ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;
        try {
            if (!br.equals(null)) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                if (st.hasMoreTokens()) {
                    a = Integer.parseInt(st.nextToken());
                    if (st.hasMoreTokens())
                        b = Integer.parseInt(st.nextToken());
                }

                int total = a + b; // Altere o valor da variável com o cálculo esperado
                System.out.println("X = " + total);
            }
        } catch (NumberFormatException | IOException num) {
            num.getMessage(); //Valor inválido
        }
    }
}
