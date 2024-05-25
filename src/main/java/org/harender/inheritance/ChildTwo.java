package org.harender.inheritance;

public class ChildTwo extends ParentClassOne{

    public ChildTwo(int x) {
        super(9);
    }

    public static void main(String[] args) {
        ParentClassOne parentClassOne=new ParentClassOne(6);
        ChildTwo childTwo= new ChildTwo(6);
    }

}
