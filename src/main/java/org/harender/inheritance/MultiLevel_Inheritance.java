package org.harender.inheritance;

public class MultiLevel_Inheritance extends ParentClassOne{

    public void func1OfParentClassOne(){
        System.out.println("Function 'func1OfParentClassOne' of MultiLevel_Inheritance");
    }

    @Override
    public void func2OfParentClassOne(){
        System.out.println("Function 'func2OfParentClassOne' of MultiLevel_Inheritance");
    }

    public void func1OfMultiLevel_Inheritance(){
        System.out.println("Function 'func1OfMultiLevel_Inheritance' of MultiLevel_Inheritance");
    }

    public static void main(String[] args) {
        //using Child CLass Object
        MultiLevel_Inheritance multiLevelInheritance=new MultiLevel_Inheritance();
        multiLevelInheritance.func1OfParentClassOne();
        multiLevelInheritance.func2OfParentClassOne();
        multiLevelInheritance.func1OfMultiLevel_Inheritance();
        multiLevelInheritance.func3OfParentClassOne();
        multiLevelInheritance.func4OfParentClassOne();

        //using Parent class Object
        ParentClassOne parentClassOne=new ParentClassOne();
        parentClassOne.func1OfParentClassOne();
        parentClassOne.func3OfParentClassOne();
        parentClassOne.func4OfParentClassOne();
        //We can not call private function using any class object outside the Class where private Method is available.
        //parentClassOne.func5OfParentClassOne();

    }

}
