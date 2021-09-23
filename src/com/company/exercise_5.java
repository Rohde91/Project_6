package com.company;
import java.util.Scanner;

public class exercise_5 {
    public static boolean isDoubloon(String s){

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++){
            int count = 0;

            for (int j = 0; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)){
                    count ++;
                }
            }
            if (count != 2){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter characters.");
        String s = input.nextLine();

        if (isDoubloon(s)){
            System.out.println("The word " + s + " is a doubloon.");
        }
        else {
            System.out.println("The word " + s + " is not a doubloon.");
        }


    }
}
