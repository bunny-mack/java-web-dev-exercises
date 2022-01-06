package exercises;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        //Bonus Mission
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        List<String> seussList = new ArrayList<String>(Arrays.asList(seuss.split(",")));
        System.out.println(seussList);

        //EXERCISES

        Scanner input = new Scanner(System.in);

        //list of integers + method call
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(
                        1,
                        2,
                        3,
                        4,
                        5,
                        6,
                        7,
                        8,
                        9,
                        10
                )
        );
        System.out.println(sumEven(numbers));

        //list of words + method calls
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("random",
                "marble",
                "spies",
                "girls",
                "toadstool",
                "cheers",
                "peach")
        );

        System.out.println("What word length do you seek?");
        int wordLength = input.nextInt();
       //part 2 call
        fiveLetters(words, wordLength);

        //part 1 call
        // fiveLetters(words);
    }

    //static method 1
    public static int sumEven(ArrayList<Integer> nums){
        int total = 0;
        for(int i : nums){
            if(i%2 == 0){
                total += i;
            }
        }
        return total;
    }

    //static method 2
    public static void fiveLetters(ArrayList<String> wds, int length){
        for(String word : wds){
            if(word.length() == length){
                System.out.println(word);
            }
        }
    }


}
