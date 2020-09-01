package br.com.hogsw;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Escolha qual exemplo executar");
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
