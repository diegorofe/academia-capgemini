package com.capgemini.thirdQuestion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ThirdQuestion {



   private final String word;

    public ThirdQuestion(String word){
        this.word = word;
    }

    public int anagrama(){
        String text = this.word;
        int count = 0;
        ArrayList<String> substrings = new ArrayList<String>();
        for(int i = 0; i <= text.length(); i++) {

            for(int j = i+1; j <= text.length(); j++) {

                substrings.add(text.substring(i, j));

            }
        }
        System.out.println(substrings);



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

//    public int anagrama(){
//
//        String text = this.word;
//
//        StringBuilder a = new StringBuilder();
//
//        for(int i = 0; i <= text.length(); i++) {
//            for (int j = 0; j <= text.length(); j++) {
//                a.append(text.charAt(i));
//
//            }
//        }
//        return 1;
//    }

//    public int anagrama(){
//        String text = this.word;
//        int x = 0;
//
//        for(int i = 0; i < text.length(); i++){
//            x = x ^ text.charAt(i);
//            System.out.println(x);
//        }
//
//        for(int j = 0; j < text.length(); j++){
//            x = x ^ text.charAt(j);
//            System.out.println(x);
//        }
//
//        return  (text.length()-1) - x;
//    }
}
