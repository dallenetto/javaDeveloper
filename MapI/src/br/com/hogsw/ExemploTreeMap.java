package br.com.hogsw;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String,String> treeCapitais = new TreeMap<>();

        //Monta arvore
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curtiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.firstKey());

        System.out.println(treeCapitais.lastKey());

        System.out.println(treeCapitais.lowerKey("SC"));

        System.out.println(treeCapitais.higherKey("SC"));

        //retorna primeiro ramo
        System.out.println(treeCapitais.firstEntry());
        Map.Entry<String, String> firstBranch = treeCapitais.firstEntry();
        System.out.println("Key:" + firstBranch.getKey() + " Value: " + firstBranch.getValue());

        //retorna ultimo ramo
        System.out.println(treeCapitais.firstEntry());
        Map.Entry<String, String> lastBranch = treeCapitais.lastEntry();
        System.out.println("Key:" + lastBranch.getKey() + " Value: " + lastBranch.getValue());

        System.out.println(treeCapitais);

        //retorna primeiro ramo e remove
        System.out.println(treeCapitais.firstEntry());
        Map.Entry<String, String> firstRemBranch = treeCapitais.firstEntry();
        System.out.println("Key:" + firstRemBranch.getKey() + " Value: " + firstRemBranch.getValue());

        //retorna ultimo ramo e remove
        System.out.println(treeCapitais.firstEntry());
        Map.Entry<String, String> lastRemBranch = treeCapitais.lastEntry();
        System.out.println("Key:" + lastRemBranch.getKey() + " Value: " + lastRemBranch.getValue());

        //navega iterator
        Iterator<String> it = treeCapitais.keySet().iterator();

        while(it.hasNext()){
            String key = it.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        for(String cap : treeCapitais.keySet()){
            System.out.println(cap+" --- > "+treeCapitais.get(cap));
        }

        for(Map.Entry<String,String> caps: treeCapitais.entrySet()){
            System.out.println(caps+" ====> "+ caps.getValue());
        }
    }
}
