package com.capgemini.secondQuestion;

/**
 * @author Diego Rodrigues
 * @version 1.0.0
 * @see SecondQuestion
 * @see SecondQuestionMain
 * **/

public class TestSecondQuestion {

    public String password = "Ya3";
    SecondQuestion secondQuestion;

    public boolean testPasswordLength(){

        secondQuestion = new SecondQuestion(this.password);
        return secondQuestion.validationLength();

    }

    public String testSuggestionPassword(){

        String result;

        if(!secondQuestion.validationLength()){
            secondQuestion = new SecondQuestion(this.password);
            result = secondQuestion.passwordSuggestion();

        }else{
           result = "No suggestion";
        }
        return result;
    }

    public int testCountLengthPassword(){
        secondQuestion = new SecondQuestion(this.password);
        return secondQuestion.countPasswordLengthMissing();

    }

    public boolean testPasswordNumber(){
        secondQuestion = new SecondQuestion(this.password);
        return  secondQuestion.validationIfContainsNumber();
    }

    public boolean testPasswordUppeerCase(){
        secondQuestion = new SecondQuestion(this.password);
        return  secondQuestion.validationIfContainsUpperCase();
    }

    public boolean testPasswordLowerCase(){
        secondQuestion = new SecondQuestion(this.password);
        return  secondQuestion.validationIfContainsLowerCase();
    }

    public boolean testPasswordEspecialChar(){
        secondQuestion = new SecondQuestion(this.password);
        return  secondQuestion.validationIfCotainsEspecialChar();
    }
}
