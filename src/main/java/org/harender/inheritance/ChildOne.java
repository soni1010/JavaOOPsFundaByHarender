package org.harender.inheritance;

public class ChildOne {

    /*
    As ParentClass is having Private default Constructor so we can get instance this way without extending.
     */

    public ParentClass parentClass;

    public ChildOne(){
        parentClass=ParentClass.getInstance();
    }

    public void childOneClassMethod1(){
        parentClass.methodInParentClass();
    }

    public static void main(String[] args) {
        new ChildOne().childOneClassMethod1();
    }
}
