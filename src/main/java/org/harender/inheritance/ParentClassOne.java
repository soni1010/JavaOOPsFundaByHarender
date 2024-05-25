package org.harender.inheritance;

public class ParentClassOne {

    ParentClassOne(int x){
        System.out.println("'Default' Parameterized Constructor of 'ParentClassOne' in java and Value="+x);
    }

    ParentClassOne(){
        System.out.println("'Default' default constructor in ParentClassOne");
    }

    public ParentClassOne(int a,int b){
        System.out.println("'Default' Parameterized Constructor of 'ParentClassOne' in java and"+"\nValue of A="+a
        +"\nValue of B= "+b);
    }

    public void func1OfParentClassOne(){
        System.out.println("Function 'func1OfParentClassOne' of ParentClassOne");
    }

    public void func2OfParentClassOne(){
        System.out.println("Function 'func2OfParentClassOne' of ParentClassOne");
    }

    public void func3OfParentClassOne(){
        System.out.println("Function 'func3OfParentClassOne' of ParentClassOne");
    }

    protected void func4OfParentClassOne(){
        System.out.println("'protected' Function 'func4OfParentClassOne' of ParentClassOne");
    }

    private void func5OfParentClassOne(){
        System.out.println("'private' Function 'func5OfParentClassOne' of ParentClassOne");
    }

}
