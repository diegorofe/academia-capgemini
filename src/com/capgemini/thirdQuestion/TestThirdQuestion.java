package com.capgemini.thirdQuestion;

/**
 * @author Diego Rodrigues
 * @version 1.0.0
 * @see ThirdQuestion
 * @see ThirdQuestionMain
 * **/

public class TestThirdQuestion {

    public String anagrama = "ifailuhkqq";

   public int testIfAnagrama(){
       ThirdQuestion thirdQuestion = new ThirdQuestion(this.anagrama);
       return thirdQuestion.countAnagrams();
   }

   public void testComparatorAnagram(){
       ThirdQuestion thirdQuestion = new ThirdQuestion(this.anagrama);
       String s1 = "ab";
       String s2 = "ba";
       System.out.println("Words that will go comparable: \n" +
               "s1 = " + s1 +"\n" +
               "s1 =" + s2);
       System.out.println("Expected = True ");
       System.out.println("Result = " + thirdQuestion.isAnagrama("ab", "ba"));
   }


}
