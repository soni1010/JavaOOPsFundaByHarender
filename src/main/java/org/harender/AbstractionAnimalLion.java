package org.harender;

public class AbstractionAnimalLion extends  Animal {



    public static void main ( String[] args) {
        AbstractionAnimalLion abstractionAnimalLion=new AbstractionAnimalLion();
        Animal obj = new AbstractionAnimalLion();
        //Abstract method call
        obj.sound();
        // Non-Abstract method call
        obj.catagory();

        //We can call using any class object
        abstractionAnimalLion.catagory();
        abstractionAnimalLion.sound();
    }

    @Override
    public void sound() {
        System.out.println("Roar");
    }
}
