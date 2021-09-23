package com.company;
import java.util.Scanner;

public class exercise_4 {

    // Write a method called isAbecedarian that
    // takes a String and
    // returns a boolean indicating whether the word is abecedarian.

    public static boolean isAbecedarian(String word){
        for (int i = 1; i < word.length(); i++){
            if (word.charAt(i) < word.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "abc";

        if (isAbecedarian(word)){
            System.out.println("The word " + word + " is Abecedarian");
        }
        else {
            System.out.println("The word " + word + " is not Abecedarian");
        }

    }
}
