package com.capgemini.thirdQuestion;

public class TestThirdQuestion {

    public String anagrama = "abba";

   public int testIfAnagrama(){
       ThirdQuestion thirdQuestion = new ThirdQuestion(this.anagrama);
       return thirdQuestion.anagrama();
   }


}
