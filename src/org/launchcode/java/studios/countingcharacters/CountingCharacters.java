package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your text: ");

        String str = input.nextLine().toLowerCase();

        int count = 0;
        HashMap<Character, Integer> finalCounts = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentLetter = str.charAt(i);
            if (!finalCounts.containsKey(currentLetter)) {
                finalCounts.put(currentLetter, 1);
            } else if (finalCounts.containsKey(currentLetter)) {
                finalCounts.put(currentLetter, finalCounts.get(currentLetter) + 1);
            }
        }

        for (Character key : finalCounts.keySet()) {
            System.out.println(key + " " + finalCounts.get(key));
        }


    }
}
