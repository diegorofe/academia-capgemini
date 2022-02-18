package com.capgemini.firstQuestion;

/**
 * @author Diego Rodrigues
 * @version 1.0.0
 * @see FirstQuestion
 * @see FirstQuestionMain
 * **/

public class TestFirstQuestion {

    public void testPrint(){

       FirstQuestion firstQuestion = new FirstQuestion(6);
        System.out.println(" Input: 6");
        System.out.println("=== Expected Result ===");
        System.out.println("" +
                "     *\n" +
                "    **\n" +
                "   ***\n" +
                "  ****\n" +
                " *****\n" +
                "******");
        System.out.println("=== Test Result ===");
        firstQuestion.print();


    }
}
