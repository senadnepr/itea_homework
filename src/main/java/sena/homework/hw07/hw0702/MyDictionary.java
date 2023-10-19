package sena.homework.hw07.hw0702;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Sergej Chumakov on 19.10.2023
 */
public class MyDictionary {
    private Map<String, String> simpleDictionary;
    private int size;

    public MyDictionary() {
        this.simpleDictionary = new TreeMap<>();
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(String englishWord, String germanWord){
        String res = simpleDictionary.put(englishWord, germanWord);
        if(res == null){
            size++;
        } else {
            System.out.println(String.format("Для слова '%s' перепризначено переклад на '%s'", englishWord, germanWord));
        }
    }

    public String transate(String englishWord){
        if(simpleDictionary.containsKey(englishWord)){
            return simpleDictionary.get(englishWord);
        }
        return "Немає такого слова у словнику";
    }

    @Override
    public String toString() {
        return "MyDictionary{" +
                "simpleDictionary=" + simpleDictionary +
                '}';
    }
}
