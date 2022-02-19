package com.capgemini.secondQuestion;

import com.capgemini.firstQuestion.TestFirstQuestion;

/**
 * @author Diego Rodrigues
 * @version 1.0.0
 * @see TestSecondQuestion
 * **/

//This class validates the registered password.
public class SecondQuestion {

    private String password;
    boolean length;
    boolean number;
    boolean upperCase;
    boolean lowerCase;
    boolean especialChar;

    public SecondQuestion (String password){
        this.password = password;
        this.length = validationLength(this.password);
        this.number = validationIfContainsNumber(this.password);
        this.upperCase = validationIfContainsUpperCase((this.password));
        this.lowerCase = validationIfContainsLowerCase((this.password));
        this.especialChar = validationIfCotainsEspecialChar((this.password));



    }

    public boolean validationLength(String password){

        return (password.length() >= 6);

    }

    public boolean validationIfContainsNumber(String password){

        for( int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public String removeNumbers(String password){

        String passwordWithoutNumbers = "";

        //remove numbers of password
        for( int i = 0; i < password.length(); i++){
            if(!Character.isDigit(password.charAt(i))){

                passwordWithoutNumbers +=  password.charAt(i);

            }
        }

        return  passwordWithoutNumbers;
    }

    public boolean validationIfContainsUpperCase(String password){

        String passwordUpperCase = removeNumbers(password);

        for( int i = 0; i < passwordUpperCase.length(); i++){
            if(passwordUpperCase.toUpperCase().charAt(i) == passwordUpperCase.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public boolean validationIfContainsLowerCase(String password){

        String passwordLowerCase = removeNumbers(password);

        for( int i = 0; i < passwordLowerCase.length(); i++){
            if(passwordLowerCase.toLowerCase().charAt(i) == passwordLowerCase.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public boolean validationIfCotainsEspecialChar(String password){

        String passwordEspecialChar = "!@#$%^&*()-+";

        for( int i = 0; i < password.length(); i++){
            for(int j = 0; j < passwordEspecialChar.length(); j++) {
               if (passwordEspecialChar.charAt(j) == password.charAt(i)) {
                   return true;
               }
           }
        }
        return false;
    }


}
