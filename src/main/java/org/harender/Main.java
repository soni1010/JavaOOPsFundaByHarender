package org.harender;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(Byte.MIN_VALUE +" And "+Byte.MAX_VALUE);
        new Main().sampleFunc1(Byte.MIN_VALUE);

    }


    public void sampleFunc1(int a){
        System.out.println("Int = "+a);
    }
    public void sampleFunc1(float a){
        System.out.println("Float = "+a);
    }
    public void sampleFunc1(double a){
        System.out.println("Double = "+a);
    }
    public void sampleFunc1(byte a){
        System.out.println("Byte = "+a);
    }

}