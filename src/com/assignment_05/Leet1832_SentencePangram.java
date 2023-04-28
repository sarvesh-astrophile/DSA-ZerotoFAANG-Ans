package com.assignment_05;

public class Leet1832_SentencePangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
        String sentence2 = "leetcode";
        System.out.println(checkIfPangram(sentence2));
    }

    private static boolean checkIfPangram(String sentence) {
        String alphabet_list = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet_list.length(); i++) {
            if (sentence.indexOf(alphabet_list.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
}
