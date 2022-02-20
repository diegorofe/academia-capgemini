package com.capgemini.thirdQuestion;

public class TestThirdQuestion {

    public String anagrama = "ifailuhkqq";

   public int testIfAnagrama(){
       ThirdQuestion thirdQuestion = new ThirdQuestion(this.anagrama);
       return thirdQuestion.anagrama();
   }

   public boolean testComparatorAnagram(){
       ThirdQuestion thirdQuestion = new ThirdQuestion(this.anagrama);
       return thirdQuestion.isAnagrama("ab", "bha");
   }


}
