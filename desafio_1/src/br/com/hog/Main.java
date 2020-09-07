package br.com.hog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
 
    public static void main(String[] args) {
        System.out.println("Escolha qual desafio você deseja executar: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            if (!br.equals(null)) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                if (st.hasMoreTokens()) {
                    int op = Integer.parseInt(st.nextToken());
                    switch (op) {
                        case 1:
                            Desafio1A.executa();
                            break;
                        case 2:
                            Desafio1B.executa();
                            break;
                        case 3:
                            Desafio1C.executa();
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    System.out.println("Finalizando");
                }
            }
        } catch (NumberFormatException | IOException num) {
            num.getMessage(); //Valor inválido
        }
    }
}
