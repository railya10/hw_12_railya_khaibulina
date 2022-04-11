package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("word1", new String[]{"Synonym1", "Synonym_1"});
        dictionary.put("word2", new String[]{"Synonym2", "Synonym_2"});
        dictionary.put("word3", new String[]{"Synonym3", "Synonym_3"});
        dictionary.put("word4", new String[]{"Synonym4", "Synonym_4"});

        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, String[]> item : dictionary.entrySet()) {
            if (scanner.nextLine().equals(item.getKey())) {
                System.out.println(Arrays.toString(item.getValue()));
            }
            scanner.nextLine();

        }
    }
}

