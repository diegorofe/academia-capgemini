package com.capgemini.thirdQuestion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Diego Rodrigues
 * @version 1.0.0
 * @see TestThirdQuestion
 * **/

public class ThirdQuestion {



   private final String word;

    public ThirdQuestion(String word){
        this.word = word;
    }

    //method to count how many anagrams have in the word
    public int countAnagrams(){
        String text = this.word;
        int count = 0;


        ArrayList<String> substrings = new ArrayList<String>();

        //double loop for separate the substrings
        for(int i = 0; i <= text.length(); i++) {

            for(int j = i+1; j <= text.length(); j++) {
                substrings.add(text.substring(i, j));
            }
        }

        //double loop for comparing the two substrings
        for(int i =0; i <= substrings.size(); i++){
            for(int j = i + 1; j < substrings.size(); j++){
                String a = substrings.get(i);
                String b = substrings.get(j);

                if(isAnagrama(a, b)){
                    count++;
                }
            }
        }

        return count;
    }


    //method that to comparator if two strings are anagram
    public boolean isAnagrama(String s1, String s2){

        char[] tempString1 = s1.toCharArray();
        char[] tempString2 = s2.toCharArray();
        Arrays.sort(tempString1);
        Arrays.sort(tempString2);
        ;

        s1 = String.join("", String.valueOf(tempString1));
        s2 = String.join("", String.valueOf(tempString2));

        return (s1.equals(s2));

    }

}
