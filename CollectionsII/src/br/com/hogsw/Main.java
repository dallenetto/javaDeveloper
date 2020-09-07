package br.com.hogsw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println("--> filaBanco: "+filaBanco);

        filaBanco.add("Wesley");

        for (String cliente: filaBanco )
            System.out.println(" ++ --> "+cliente);


        Iterator<String> cliente = filaBanco.iterator();
        while (cliente.hasNext())
            System.out.println(" ++ ==> "+cliente.next());

        //retorna primeiro e remove
        String clienteAserAtendido = filaBanco.poll();
        System.out.println(" ----> clienteAserAtendido: "+clienteAserAtendido);

        System.out.println("--> filaBanco: "+filaBanco);

        //retorna primeiro sem remover
        String clienteAserAtendido2 = filaBanco.peek();
        System.out.println("----> clienteAserAtendido sem remover: "+clienteAserAtendido2);

        System.out.println("--> filaBanco: "+filaBanco);

        filaBanco.clear(); //limpa fila
        System.out.println("--> filaBancoVazia: "+filaBanco);

        try{
            String clienteErro = filaBanco.element();
        } catch( Exception exc){
            exc.getMessage();
            System.out.println("Exception: "+ exc);
        }


    }
}
