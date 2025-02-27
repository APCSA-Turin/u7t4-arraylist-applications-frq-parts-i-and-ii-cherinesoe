package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        /* to be implemented in part (a) */
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
              allPairs.add(new WordPair(words[i], words[j])); 
            }
        } 
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int count = 0;
        for (int i = 0; i < allPairs.size(); i++) {
            String first = allPairs.get(i).getFirst();
            String second = allPairs.get(i).getSecond();
            if (first.equals(second)) {
                count++;
            }
        }
        return count;
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
