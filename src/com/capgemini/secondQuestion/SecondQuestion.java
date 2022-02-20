package com.capgemini.secondQuestion;

import java.util.Random;

/**
 * @author Diego Rodrigues
 * @version 1.0.0
 * @see TestSecondQuestion
 * **/

//This class validates the registered password.
public class SecondQuestion {

      private String password;

    public SecondQuestion(String password) {
        this.password = password;
    }

    public boolean validationLength() {
            if(this.password.length() >= 6){
                return true;
            } else{
                passwordSuggestion();
                return false;
            }


    }

    public boolean validationIfContainsNumber() {

        for (int i = 0; i < this.password.length(); i++) {
            if (Character.isDigit(this.password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public String removeNumbers(String password) {

        String passwordWithoutNumbers = "";

        //remove numbers of password
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i))) {

                passwordWithoutNumbers += password.charAt(i);

            }
        }

        return passwordWithoutNumbers;
    }

    public boolean validationIfContainsUpperCase() {

        String passwordUpperCase = removeNumbers(this.password);

        for (int i = 0; i < passwordUpperCase.length(); i++) {
            if (passwordUpperCase.toUpperCase().charAt(i) == passwordUpperCase.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean validationIfContainsLowerCase() {

        String passwordLowerCase = removeNumbers(this.password);

        for (int i = 0; i < passwordLowerCase.length(); i++) {
            if (passwordLowerCase.toLowerCase().charAt(i) == passwordLowerCase.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean validationIfCotainsEspecialChar() {

        String passwordEspecialChar = "!@#$%^&*()-+";

        for (int i = 0; i < this.password.length(); i++) {
            for (int j = 0; j < passwordEspecialChar.length(); j++) {
                if (passwordEspecialChar.charAt(j) == this.password.charAt(i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void passwordSuggestion() {
        //variables for method
        String suggestion;
        String numbers = "012346789";
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String characters = "!@#$%^&*()-+";

        //variables for to storage random index
        Random random = new Random();
        int indexNumbers = random.nextInt(numbers.length());
        int indexCapitalLatters = random.nextInt(capitalLetters.length());
        int indexSmallLatters = random.nextInt(smallLetters.length());
        int indexCharacters = random.nextInt(characters.length());

        //variables for missing characters
        String numberAdcional = (validationIfContainsNumber()) ? "" : String.valueOf(numbers.charAt(indexNumbers));
        String upperCaseAdiconal = (validationIfContainsUpperCase()) ? "" : String.valueOf(capitalLetters.charAt(indexCapitalLatters));
        String lowerCaseAdicional = (validationIfContainsLowerCase()) ? "" : String.valueOf(smallLetters.charAt(indexSmallLatters));
        String especialCharAdicional = (validationIfCotainsEspecialChar()) ? "" : String.valueOf(characters.charAt(indexCharacters));

        //build string with missing characters
        suggestion = numberAdcional + upperCaseAdiconal + lowerCaseAdicional + especialCharAdicional;

        // print of difference between passwords length
        int gap = (6 - password.length());
        System.out.println(password.length() +
                " caracteres não são suficientes! Favor inserir mais " + gap + " caracteres." +
                "\n---------------------------------------------------------------------");

        //fusion of password suggested with origin password
        suggestion =  this.password + suggestion;




        //verify if string length is true again
        if(suggestion.length() < 6){

            String aleatory = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-+";

            int newGap = (6 - suggestion.length());
            for(int i = 0; i < newGap; i++){
                int index = random.nextInt(aleatory.length());
                char randomChar = aleatory.charAt(index);

                suggestion = suggestion + randomChar;

            }
        }

            System.out.println("-> Sugestão de senha: " + suggestion +"\n");

    }
}
