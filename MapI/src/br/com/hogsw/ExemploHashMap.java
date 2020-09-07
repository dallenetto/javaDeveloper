package br.com.hogsw;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
	    Map<String, Integer> campeoesMundialFifa = new HashMap<>();

	    //adiciona as equipes
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        //atualiza o valor
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        //Retorna Argentina
        System.out.println("Argentina posicao: " + campeoesMundialFifa.get("Argentina"));
        System.out.println("Argentina --> " + campeoesMundialFifa.containsKey("Argentina"));

        //retorna se existe um campeao França
        System.out.println("Tem França: "+ campeoesMundialFifa.containsKey("França"));

        //retorna se existe um hexa
        System.out.println("Tem Hexa? " + campeoesMundialFifa.containsValue(6));

        //retorna o tamanho
        System.out.println("Quantidade: "+ campeoesMundialFifa.size());

        //Navega...
        for(Map.Entry<String, Integer> listMap : campeoesMundialFifa.entrySet()){
            System.out.println(listMap.getKey() + " -- "+listMap.getValue());
        }
        //Navega tb...
        for(String key : campeoesMundialFifa.keySet()){
            System.out.println(key + "--->"+campeoesMundialFifa.get(key));
        }
        //limpa
        campeoesMundialFifa.clear();
        //retorna o tamanho
        System.out.println("Limpa...\nQuantidade: "+ campeoesMundialFifa.size());

    }
}
