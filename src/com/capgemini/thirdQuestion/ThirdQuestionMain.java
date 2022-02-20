package com.capgemini.thirdQuestion;

public class ThirdQuestionMain {

    /**
     * @author Diego Rodrigues
     * @version 1.0.0
     * **/

    public static void main(String[] args) {
        TestThirdQuestion testThirdQuestion = new TestThirdQuestion();


        System.out.println("----Comparação de anagramas-----");
        testThirdQuestion.testComparatorAnagram();
        System.out.println("-------------------");

        System.out.println("Palavra para verificar anagramas: " + testThirdQuestion.anagrama);
        System.out.println("Quantidade de anagramas: " + testThirdQuestion.testIfAnagrama());

    }




}
