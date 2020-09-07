package br.com.hogsw;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Escolha qual exemplo executar");

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.now();
        //d1 = d1.plusDays(1L);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.compareTo(d2));

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            switch (bf.readLine()) {
                case "1":
                    ExemploList.executar();
                    break;
                case "2":
                    ExemploVector.executar();
                    return;
            }
        } catch(Exception exc){
            exc.getMessage();
        }
    }
}
