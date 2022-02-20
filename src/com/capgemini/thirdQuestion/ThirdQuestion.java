package com.capgemini.thirdQuestion;

import java.util.Arrays;

public class ThirdQuestion {



   private final String word;

    public ThirdQuestion(String word){
        this.word = word;
    }

    public int anagrama(){
        String text = this.word;

        for(int i = 0; i <= text.length(); i++) {

            for(int j = i; j <= text.length(); j++) {

                System.out.println(text.substring(i, j));

            }
        }

        return 2;
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
