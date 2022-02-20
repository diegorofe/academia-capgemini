package com.capgemini.secondQuestion;

/**
 * @author Diego Rodrigues
 * @version 1.0.0
 * **/


public class SecondQuestionMain {

    public static void main(String[] args) {
        TestSecondQuestion testSecondQuestion = new TestSecondQuestion();
        System.out.println("Senha de teste: " + testSecondQuestion.password + "\n" +
                "---------------------------------");
        System.out.println("---Características da senha---");
        System.out.println("Possui no mínimo 6 caracteres? " + testSecondQuestion.testPasswordLength());
        System.out.println("Contém no mínimo 1 digito? " + testSecondQuestion.testPasswordNumber());
        System.out.println("Contém no mínimo 1 letra em minúsculo? " + testSecondQuestion.testPasswordLowerCase());
        System.out.println("Contém no mínimo 1 letra em maiúsculo? " + testSecondQuestion.testPasswordUppeerCase());
        System.out.println("Contém no mínimo 1 caractere especial? " + testSecondQuestion.testPasswordEspecialChar());
        System.out.println("\n" +
                "----------------------------------");
        System.out.println("Quantidade de caracteres faltantes para o tamanho mínimo: " + testSecondQuestion.testCountLengthPassword());
        System.out.println("Sugestão de senha: " + testSecondQuestion.testSuggestionPassword());


    }
}
