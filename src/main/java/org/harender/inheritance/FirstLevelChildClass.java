package org.harender.inheritance;

public class FirstLevelChildClass extends ParentClassOne{

    FirstLevelChildClass(){
        System.out.println("Default Constructor of 'FirstLevelChildClass'");
    }

    public void func1OfParentClassOne(){
        System.out.println("Function 'func1OfParentClassOne' of FirstLevelChildClass");
    }

    public void func2OfParentClassOne(){
        System.out.println("Function 'func2OfParentClassOne' of FirstLevelChildClass");
    }

    public void func3OfFirstLevelChildClass(){
        System.out.println("Function 'func3OfParentClassOne' of FirstLevelChildClass");
    }

    public void func4OfFirstLevelChildClass(){
        System.out.println("Function 'func4OfParentClassOne' of FirstLevelChildClass");
    }
}
