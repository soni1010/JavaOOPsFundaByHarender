package org.harender;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
/*
Feature                                                  printf          println
Adds a newline character ---------------------------->   | No  |         | Yes  |
Can format output ----------------------------------->   | Yes |         |  No  |
Can print multiple values on the same line ---------->   | Yes |         |  No  |
*/
        for (int i = 1; i <= 5; i++) {
            if(i<5)
                System.out.printf("i = %d, " , i);
            else
                System.out.printf("i = %d " , i);
        }

// Abstraction class Animal Abstract implemented by AbstractionAnimalLion class



    }



}