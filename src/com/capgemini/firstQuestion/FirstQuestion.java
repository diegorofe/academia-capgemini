package com.capgemini.firstQuestion;


/**
 * @author Diego Rodrigues
 * @version 1.0.0
 * @see TestFirstQuestion
 * **/

public class FirstQuestion {

    private final int n;

        //class constructor
        public FirstQuestion(int n){
             this.n = n;
        }

        //method to print the asterisk ladder
        public  void print() {
            int cont = n;

            for (int i = 1; i <= n; i++) {

                for (int j = cont; j > 1; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }

            cont--;
            //jump line
            System.out.println("");


            }

        }

}
