package chrvk.javaelementary.hw16.task3;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> codes = new HashSet<>();

        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char ch : word.toCharArray()) {
                code.append(morse[ch - 'a']);
            }
            codes.add(code.toString());
        }
        return codes.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
