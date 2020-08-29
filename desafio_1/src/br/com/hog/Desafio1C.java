package br.com.hog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Desafio1C {

    public static void executa() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nro = 0, horas = 0;
        Double valorHora = 0.00;
        try {
            if (!br.equals(null)) {
                System.out.println("Informe o seu nro: ");
                StringTokenizer st = new StringTokenizer(br.readLine());
                if (st.hasMoreTokens()) {
                    nro = Integer.parseInt(st.nextToken());

                    System.out.println("Informe o total de horas trabalhada: ");
                    st = new StringTokenizer(br.readLine());
                    if (st.hasMoreTokens()) {
                        horas = Integer.parseInt(st.nextToken());

                        System.out.println("Informe o valor da hora: ");
                        st = new StringTokenizer(br.readLine());
                        if (st.hasMoreTokens())
                            valorHora = Double.parseDouble(st.nextToken());
                    }
                }

                double salary = horas * valorHora; // Altere o valor da variável com o cálculo esperado
                System.out.println("NUMBER = " + nro);
                System.out.println(String.format("SALARY = U$ %.2f", salary));
            }
        } catch (NumberFormatException | IOException num) {
            num.getMessage(); //Valor inválido
        }
    }
}

