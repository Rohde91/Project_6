package com.company;

public class exersice_6 {

    public static boolean canSpell(String letters, String word){
        boolean spell = true;

        for (int i = 0; i <word.length(); i++){
            char letter = word.charAt(i);
            if (!letters.contains(String.valueOf(letter))){
                spell = false;
                break;
            }
            else {
                letters = letters.replaceFirst(String.valueOf(word.charAt(i)), "");
            }
        }
        return spell;
    }

    public static boolean canSpell2(String letterStack, String wordBuilding){
        int numInWord = wordBuilding.length();
        for (int i = 0; i <wordBuilding.length(); i++){
            char currentLetters = wordBuilding.charAt(i);
            for (int j = 0; j < letterStack.length(); j++){
                if (currentLetters == letterStack.charAt(j)){
                    //Removing from stack
                    System.out.println(letterStack + " before removing.");
                    letterStack = letterStack.substring(0,j) + "" + letterStack.substring(j+1);
                    System.out.println(letterStack + " after removing");
                    numInWord = numInWord - 1;
                    System.out.println("Letters left: " + numInWord);
                }
            }
        }
        return numInWord == 0;
    }

    public static void main(String[] args) {
        System.out.println(canSpell2("hapsadoost", "ostehaaaps"));
        // If both have equal values/letters. The result will come out as true.
    }
}
