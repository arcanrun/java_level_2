package lesson03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String initText = "часто с используемый в является печати и вэб-дизайне Lorem Ipsum lorem Ipsum популяризации в новое время послужили публикация листов Letraset с образцами Lorem";
        String[] words;
        words = initText.toLowerCase().split(" ");


        uniqueWords(words);
        countWord(words);
    }

    public static void uniqueWords(String[] words) {


        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println(uniqueWords);
    }

    public static void countWord(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < words.length - 1; i++) {
            if (hm.containsKey(words[i])) {
                hm.put(words[i], hm.get(words[i]) + 1);

            } else {
                hm.put(words[i], 1);
            }

        }
        System.out.println(hm);
    }


}
